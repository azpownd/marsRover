package mars.rover.generator

import mars.rover.roverDSL.Mission
import mars.rover.roverDSL.MissionType
import mars.rover.roverDSL.Safety
import mars.rover.roverDSL.Colors

class PythonGeneratorM {
	def static toText(Mission root)'''
	#!/usr/bin/python3
	from ev3dev2.motor import MoveTank, OUTPUT_A, OUTPUT_D, OUTPUT_B, SpeedPercent
	from ev3dev2.sound import Sound
	from ev3dev2.sensor.lego import ColorSensor, UltrasonicSensor
	from ev3dev2._platform.ev3 import INPUT_4, INPUT_1, INPUT_3, INPUT_2
	
	import bluetooth, threading
	from time import sleep
	
	is_master = True
	# is_master = False
	server_mac = 'CC:78:AB:50:B2:46'
	
	# driving variables
	s = Sound()
	tank_drive = MoveTank(OUTPUT_A, OUTPUT_D)
	# Robot arm = OUTPUT_B, use movetank again or...?
	cs_l = ColorSensor(INPUT_1)
	cs_m = ColorSensor(INPUT_2)
	cs_r = ColorSensor(INPUT_3)
	us_b = UltrasonicSensor(INPUT_4)
	us_b.mode = 'US-DIST-CM'
	
	avoid_object_bool = False
	
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
	    #start driving
	    missions()
	    disconnect(sock_in)
	    disconnect(sock_out)
	    disconnect(sock)
	
	
	def start_listening(sock_in, sock_out):
	    i = 1
	    sock_out.write(str(i) + '\n')
	    sock_out.flush()
	    #print('Sent ' + str(i))
	    listen(sock_in, sock_out)
	
	
	def listen(sock_in, sock_out):
	    global avoid_object_bool
	    print('Now listening...')
	    while True:
	        data = sock_in.readline()
	        if 'Avoid' in data:
	            print('Avoid Received')
	            avoid_object_bool = True
	        #else:
	        #    print('Received ' + str(data))
	        sleep(1)
	        sock_out.write("nothing" + '\n')
	        sock_out.flush()
	        #print('Sent ' + str(data))

	
	#-------------------------MISSIONS CODE---------------------------------------
	«IF root.safetyproperty.equals(Safety.ON)»	
	class StayInLine:
	    #stop = False
	    done = False # When / how set to done? Given as input or smth? (set to done is needed for terminating program correctly?
	    prio = 10 # Higher = more important
	    def takeControl(self):
	        return not self.done and (cs_l.color == «IF (root.bordercolor === null)»6«ELSE»«toInt(root.bordercolor.color)»«ENDIF» or cs_m.color == «IF (root.bordercolor === null)»6«ELSE»«toInt(root.bordercolor.color)»«ENDIF» or cs_r.color == «IF (root.bordercolor === null)»6«ELSE»«toInt(root.bordercolor.color)»«ENDIF»
	                                  or us_b.distance_centimeters > 100) #white (border) # Note: Change if lake depth changes!
	        
	    def action(self):
	        outer_border_color = «IF (root.bordercolor === null)»6«ELSE»«toInt(root.bordercolor.color)»«ENDIF»
	        rotation_speed_right = «IF !(root.forwardspeed === null)»«0.8*root.forwardspeed.integer»«ELSE»«0.8*20»«ENDIF» # 80% of max speed forwards
	        rotation_speed_left = -«IF !(root.reversespeed === null)»«0.8*root.reversespeed.integer»«ELSE»«0.8*20»«ENDIF» # 80% of max speed backwards
	        rotation_degrees = «IF !(root.turndirection === null)»«root.turndirection.integer»«ELSE»90«ENDIF» # How far you want to turn
	
	        s.speak("Found border", play_type=Sound.PLAY_NO_WAIT_FOR_COMPLETE)
	        if cs_l.color == outer_border_color:
	            print("Border on left side")
	            tank_drive.on_for_degrees(left_speed=0, right_speed=rotation_speed_left, degrees=rotation_degrees) # Turn left (backwards)
	        elif cs_m.color == outer_border_color:
	            print("Border in front")
	            tank_drive.on_for_degrees(left_speed=0, right_speed=rotation_speed_left, degrees=rotation_degrees) # Turn left (backwards)
	        elif cs_r.color == outer_border_color:
	            print("Border on right side")
	            tank_drive.on_for_degrees(left_speed=0, right_speed=rotation_speed_left, degrees=rotation_degrees) # Turn left (backwards)
	        elif us_b.distance_centimeters > 100: # Note: Change if lake depth changes!
	            print("Border behind")
	            tank_drive.on_for_degrees(left_speed=rotation_speed_right, right_speed=0, degrees=rotation_degrees) # Turn right (forward)
	
	    def suppress(self):
	       print("StayInLine suppressed!") # Should never happen!
	       #self.stop = True
	«ENDIF»
	
	
	new_lake_found = 0
	
	class AvoidLakes: # Only generate if no color tasks OR always have but add colors to colors found array if mission selected?
	    stop = False
	    prio = 9 # Higher = more important
	    lake_colors = {
			«IF !root.lakelist.isEmpty()»
			«FOR c: root.lakelist SEPARATOR ","»«IF c.equals(Colors.WHITE)»
				6: "White"«ELSEIF c.equals(Colors.RED)»
				5: "Red"«ELSEIF c.equals(Colors.BLUE)»
				2: "Blue"«ELSEIF c.equals(Colors.YELLOW)»
				4: "Yellow"«ELSEIF c.equals(Colors.BLACK)»
				1: "Black"
    			«ENDIF»
			«ENDFOR»
			«ENDIF»
	    }
	    def takeControl(self):
	           «IF !root.lakelist.isEmpty()» return cs_l.color in self.lake_colors or cs_m.color in self.lake_colors or cs_r.color in self.lake_colors \
	                   or us_b.distance_centimeters > 100 # Note: Change if lake depth changes!«ELSE»return 0«ENDIF»
	    
	    def action(self):
	        rotation_speed_right = «IF !(root.forwardspeed === null)»«0.8*root.forwardspeed.integer»«ELSE»«0.8*20»«ENDIF» # 80% of max speed forwards
	        rotation_speed_left = -«IF !(root.reversespeed === null)»«0.8*root.reversespeed.integer»«ELSE»«0.8*20»«ENDIF» # 80% of max speed backwards
	        rotation_degrees = «IF !(root.turndirection === null)»«root.turndirection.integer»«ELSE»90«ENDIF» # How far you want to turn
	    
	        global new_lake_found # Used for find colors
	        s.speak("Found lake", play_type=Sound.PLAY_NO_WAIT_FOR_COMPLETE)
	        if cs_l.color in self.lake_colors:
	            new_lake_found = cs_l.color  # Used for find colors
	            print("{} lake on left side".format(self.lake_colors[new_lake_found]))
	            tank_drive.on_for_degrees(left_speed=0, right_speed=rotation_speed_left, degrees=rotation_degrees) # Turn left (backwards)
	        elif cs_m.color in self.lake_colors:
	            new_lake_found = cs_m.color  # Used for find colors
	            print("{} lake in front".format(self.lake_colors[cs_m.color]))
	            tank_drive.on_for_degrees(left_speed=0, right_speed=rotation_speed_left, degrees=rotation_degrees) # Turn left (backwards)
	        elif cs_r.color in self.lake_colors:
	            new_lake_found = cs_r.color  # Used for find colors
	            print("{} lake on right side".format(self.lake_colors[cs_r.color]))
	            tank_drive.on_for_degrees(left_speed=0, right_speed=rotation_speed_left, degrees=rotation_degrees) # Turn left (backwards)
	            #print("Appended new lake RIGHT: {}\n\n".format(new_lake_found))
	            print(cs_r.color)
	        elif us_b.distance_centimeters > 100: # Note: Change if lake depth changes!
	            print("Lake behind")
	            tank_drive.on_for_degrees(left_speed=rotation_speed_right, right_speed=0, degrees=rotation_degrees) # Turn right (forward)
	    def suppress(self):
	        print("StayInLine suppressed!") # Can only be done by StayInLine
	
	
	«IF root.safetyproperty.equals(Safety.ON)»
	class AvoidObjects: # Add sensor checks to brick 2. Action code can be here. Take control if signal from brick 1?
	    stop = False
	    prio = 8 # Higher = more important
	
	    brick2_us_f = False
	    brick2_ts_b = False
	    brick2_ts_l = False
	    brick2_ts_r = False
	
	    def takeControl(self):
	        global avoid_object_bool
	        return avoid_object_bool
	
	    def action(self):
	        rotation_speed_left = -«IF !(root.reversespeed === null)»«0.8*root.reversespeed.integer»«ELSE»«0.8*20»«ENDIF» # 80% of max speed backwards
	        rotation_degrees = «IF !(root.turndirection === null)»«root.turndirection.integer»«ELSE»90«ENDIF» # How far you want to turn
	
	        global avoid_object_bool
	        avoid_object_bool = False
	        print("Avoiding object") # Can extend if wanted to different turn side for each bumper or something
	        # tank_drive.on_for_rotations(SpeedPercent(0), SpeedPercent(-50), 1)  # Turn left (backwards)
	        tank_drive.on_for_degrees(left_speed=0, right_speed=rotation_speed_left, degrees=rotation_degrees)
	
	    def suppress(self):
	        print("AvoidObjects suppressed!")
	«ENDIF»
	
	«IF root.missiontype.equals(MissionType.FIND_COLORS)»
	found_colors = [] # global to store found colors between interrupts
	
	class FindColors: # change name to find lakes?
	    stop = False
	    done = False
	    prio = 5  # Higher = more important
	    old_lake_found = 0
	
	    def takeControl(self):
	        global new_lake_found
	        #print('STARTING?????: {}\n'.format(new_lake_found != self.old_lake_found and not self.done))
	        return new_lake_found != self.old_lake_found and not self.done
	
	    def action(self):
	        global found_colors
	        global new_lake_found
	        self.old_lake_found = new_lake_found # allows 1 run of this action, then they are equal egain
	        mission_colors = ["«FOR c: root.colorlist SEPARATOR "\",\"" »«c»«ENDFOR»"]  # Give as input
	        all_colors_on_field = {
	            1: "Black",
	            2: "Blue",
	            4: "Yellow",
	            5: "Red",
	            6: "White"
	        }
	        #print('\n(Re)Starting the color search!\n')
	        #print('Old lake: {} and new lake: {}'.format(self.old_lake_found, new_lake_found))
	
	        if not self.done:
	            if self.old_lake_found in all_colors_on_field:  # check if old_lake_found is a key value in our dictionary
	                found_color = all_colors_on_field[self.old_lake_found] # Determines which color is attached to this key value
	                #print(found_color)
	                if found_color in mission_colors and found_color not in found_colors:
	                    s.speak(found_color, play_type=Sound.PLAY_NO_WAIT_FOR_COMPLETE)
	                    found_colors.append(found_color)
	                    print("New color found: {}".format(found_color))
	                    #print("New color array: {}\n".format(found_colors))
	                    #print("Mission color array: {}\n".format(mission_colors))
	            if len(found_colors) == len(mission_colors):
	                print("ALL COLORS FOUND!")
	                tank_drive.on(SpeedPercent(0), SpeedPercent(0)) # turn off instead?
	                #Leds().animate_flash('AMBER', sleeptime=0.75, duration=5,
	                #                     block=True)  # blocking to prevent early exit()
	                s.speak("All colors found! Good Job!", play_type=Sound.PLAY_NO_WAIT_FOR_COMPLETE)
	                self.done = True
	                # break # Or exit if last / only program? Discuss program flow multiple missions
	
	    def suppress(self):
	        print("FindColors suppressed!")
	        self.stop = True
	«ENDIF»
	
	class ClassB2: # DONT DELETE!!! ONLY IF OTHER CLASS IS ALWAYS TRUE!!!
	    stop = False
	    prio = 0 # Higher = more important
	    def takeControl(self):
	        return True # One class needs to always be wanting takeControl or else crash
	        
	    def action(self): # drive speed at start of while not loop
	        counter = 0
	        while not self.stop:
	            #sleep(1)
	            counter +=1
	            #print("B2: ",self.stop,counter)
	            if counter == 5000:
	                break
	        
	    def suppress(self):
	       print("B2 suppressed!")
	       self.stop = True
	
	«IF root.missiontype.equals(MissionType.AVOID_COLORS)»
	
	«ENDIF»
	
	behaviour = ClassB2() #edited
	behaviours = [«IF root.safetyproperty.equals(Safety.ON)»StayInLine(),«ENDIF»
	«IF !root.lakelist.isEmpty()»AvoidLakes(),«ENDIF»
	«IF root.safetyproperty.equals(Safety.ON)»AvoidObjects(),«ENDIF»
	«IF root.missiontype.equals(MissionType.FIND_COLORS)»FindColors(),«ENDIF» 
	ClassB2()] #list with missions, first = highest priority. NEED to be in order!
	
	#-------------------------MISSIONS CODE---------------------------------------
	
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
	    drive_forward_speed = «IF !(root.forwardspeed === null)»«root.forwardspeed.integer»«ELSE»«50»«ENDIF» # Give as input
	    
	    while True:
	        #print("Nieuwe ronde!")
	        tank_drive.on(SpeedPercent(drive_forward_speed), SpeedPercent(drive_forward_speed)) # default movement speed
	        behaviour = next(b for b in behaviours if b.takeControl())
	        behaviour.action()
	        #behaviour.stop = False
	        
	
	s.speak("start")
	run(server_mac, is_master)


	'''
	def static int toInt(Colors c) {
		switch(c){
			case Colors.WHITE: return 6
			case Colors.RED: return 5
			case Colors.BLUE: return 2
			case Colors.YELLOW: return 4
			case Colors.BLACK: return 1
		}
	}
}