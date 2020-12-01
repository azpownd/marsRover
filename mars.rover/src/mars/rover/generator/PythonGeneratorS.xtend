package mars.rover.generator

import mars.rover.roverDSL.Mission

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
	ts_r = TouchSensor(INPUT_3)
	ts_l = TouchSensor(INPUT_2)
	us_f = UltrasonicSensor(INPUT_4)
	us_f.mode = 'US-DIST-CM'
	
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
		print('Now listening...')
		while True:
			data = sock_in.readline()
			print('Received ' + str(data))
			sleep(1)
			sock_out.write("nothing" + '\n')
			sock_out.flush()
			print('Sent ' + str(data))
			
	def missions():
		while True:
			sleep(1)
	run(server_mac, is_master)
	'''
}