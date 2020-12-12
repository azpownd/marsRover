package mars.rover.generator

import mars.rover.roverDSL.Mission
import mars.rover.roverDSL.Safety

class PythonGeneratorS {
	def static toText(Mission root)'''
	#!/usr/bin/python3
	from ev3dev2.motor import MoveTank, OUTPUT_A, OUTPUT_D, SpeedPercent
	from ev3dev2.sound import Sound
	from ev3dev2.sensor.lego import TouchSensor, UltrasonicSensor
	from ev3dev2._platform.ev3 import INPUT_4, INPUT_1, INPUT_3, INPUT_2
	
	import bluetooth, threading
	from time import sleep
	
	# is_master = True
	is_master = False
	server_mac = 'CC:78:AB:50:B2:46'
	
	# driving variables
	s = Sound()
	ts_b = TouchSensor(INPUT_1)
	ts_l = TouchSensor(INPUT_2)
	ts_r = TouchSensor(INPUT_3)
	us_f = UltrasonicSensor(INPUT_4)
	us_f.mode = 'US-DIST-CM'
	
	new_value_to_sent = False
	new_value = ''
	
	def connect(server_mac, is_master = True):
	    port = 3
	    if is_master:
	        server_sock = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
	        server_sock.bind((server_mac, port))
	        server_sock.listen(1)
	        print('Listening...')
	        client_sock, address = server_sock.accept()
	        print('Accepted connection from ', address)
	        return client_sock, client_sock.makefile('r'), client_sock.makefile('w')
	    else:
	        sock = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
	        print('Connecting...')
	        sock.connect((server_mac, port)) 
	        print('Connected to ', server_mac)
	        return sock, sock.makefile('r'), sock.makefile('w')
	
	
	def disconnect(sock):
	    sock.close()
	
	
	def run(server_mac, is_master = True):
	    sock, sock_in, sock_out = connect(server_mac, is_master)
	    listener = threading.Thread(target=start_listening if is_master else listen, args=(sock_in, sock_out))
	    listener.start()
	    #start doing things
	    missions()
	    disconnect(sock_in)
	    disconnect(sock_out)
	    disconnect(sock)
	
	
	def start_listening(sock_in, sock_out):
	    i = 1
	    sock_out.write(str(i) + '\n')
	    sock_out.flush()
	    print('Sent ' + str(i))
	    listen(sock_in, sock_out)
	
	
	def listen(sock_in, sock_out):
	    global new_value_to_sent
	    global new_value
	    print('Now listening...')
	    while True:
	        print('BLUETOOTH WAS HERE')
	        print('IF CHECK == {}'.format(new_value_to_sent))
	        data = sock_in.readline()
	        print('Received ' + str(data)) # crashes here or?
	        if new_value_to_sent:
	            #print('Brick1, avoid!')
	            sock_out.write('Avoid\n')
	            sock_out.flush()
	            #print('Sent ' + str(data))
	            print('Sent {}'.format(new_value))
	            new_value_to_sent = False
	        else:
	            sock_out.write("nothing" + '\n')
	            sock_out.flush()
	        sleep(1)
	
	
	class AvoidObjects:
	    stop = False
	    prio = 8
	    #global new_value_to_sent
	    #global new_value
	
	    def takeControl(self):
	        return ts_b.is_pressed or ts_l.is_pressed or ts_r.is_pressed or us_f.distance_centimeters < 30
	
	    def action(self):
	        global new_value_to_sent
	        global new_value
	        #if ts_b.is_pressed or ts_l.is_pressed or ts_r.is_pressed or us_f.distance_centimeters < 5:
	        #    print("Avoiding object!")
	        #    sleep(1) # temporary
	        #    print('Distance: {}'.format(us_f.distance_centimeters))
	        #    new_value = 'Avoiding' # Can extend to sent brick 1 the sensor that determined this (diff turn or smth)
	        #    new_value_to_sent = True
	        if ts_b.is_pressed:
	            print('touch back\n')
	            new_value = 'Avoiding'  # Can extend to sent brick 1 the sensor that determined this (diff turn or smth)
	            new_value_to_sent = True
	        elif ts_l.is_pressed:
	            print('touch left\n')
	            new_value = 'Avoiding'  # Can extend to sent brick 1 the sensor that determined this (diff turn or smth)
	            new_value_to_sent = True
	        elif ts_r.is_pressed:
	            print('touch right\n')
	            new_value = 'Avoiding'  # Can extend to sent brick 1 the sensor that determined this (diff turn or smth)
	            new_value_to_sent = True
	        elif us_f.distance_centimeters < 30:
	            print('us front\n')
	            print('Distance: {}'.format(us_f.distance_centimeters))
	            new_value = 'Avoiding'  # Can extend to sent brick 1 the sensor that determined this (diff turn or smth)
	            new_value_to_sent = True
	        sleep(2) # temp!!!
	
	
	    def suppress(self):
	       print("AvoidObjects suppressed!")
	       self.stop = True
	
	
	class ClassB2:  # DONT DELETE!!! ONLY IF OTHER CLASS IS ALWAYS TRUE!!!
	    stop = False
	    prio = 0  # Higher = more important
	
	    def takeControl(self):
	        return True  # One class needs to always be wanting takeControl or else crash
	
	    def action(self):  # drive speed at start of while not loop
	        counter = 0
	        while not self.stop:
	            # sleep(1)
	            counter += 1
	            # print("B2: ",self.stop,counter)
	            if counter == 5000:
	                break
	
	    def suppress(self):
	        print("B2 suppressed!")
	        self.stop = True
	
	
	behaviour = ClassB2()
	behaviours = [«IF root.safetyproperty.equals(Safety.ON)»AvoidObjects(),«ENDIF» ClassB2()] #list with missions, first = highest priority. NEED to be in order!
	
	
	def monitoring():
	    global behaviour
	    global behaviours
	    while True:
	        for b in behaviours:
	            if behaviour.prio < b.prio and b.takeControl():
	                print("interrupting prio: ", behaviour.prio)
	                behaviour.suppress()
	                sleep(1) # Remove later with print, just for testing
	
	
	def missions():
	    # initialize all behaviours
	    global behaviour
	    global behaviours
	
	    monitor = threading.Thread(target=monitoring)
	    monitor.start()
	
	    while True:
	        # print("Nieuwe ronde!")
	        #tank_drive.on(SpeedPercent(20), SpeedPercent(20))  # default movement speed
	        behaviour = next(b for b in behaviours if b.takeControl())
	        behaviour.action()
	        # behaviour.stop = False
	
	
	run(server_mac, is_master)
	'''
}