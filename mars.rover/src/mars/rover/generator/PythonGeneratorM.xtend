package mars.rover.generator

import mars.rover.roverDSL.Tasks
import mars.rover.roverDSL.MissionType
import mars.rover.roverDSL.Safety
import mars.rover.roverDSL.Colors

class PythonGeneratorM {
	def static toText(Tasks root)'''
	#!/usr/bin/python3
	from ev3dev2.motor import MoveTank, OUTPUT_A, OUTPUT_D, OUTPUT_B, SpeedPercent, Motor
	from ev3dev2.sound import Sound
	from ev3dev2.sensor.lego import ColorSensor, UltrasonicSensor
	from ev3dev2._platform.ev3 import INPUT_4, INPUT_1, INPUT_3, INPUT_2
	from ev3dev2.led import Leds
	
	import bluetooth, threading
	import math
	from time import sleep, time
	from sys import exit
	from pathlib import Path
	
	# communication variables
	is_master = True
	server_mac = 'CC:78:AB:50:B2:46'
	
	# driving variables & sensors
	s = Sound()
	tank_drive = MoveTank(OUTPUT_A, OUTPUT_D)
	measure_motor = Motor(OUTPUT_B)
	cs_l = ColorSensor(INPUT_1)
	cs_m = ColorSensor(INPUT_2)
	cs_r = ColorSensor(INPUT_3)
	us_b = UltrasonicSensor(INPUT_4)
	us_b.mode = 'US-DIST-CM'
	
	#-------------------------- Global variables --------------------------
	# DSL generated variables
	park = False
	measure = False
	begin_sentence = ''
	final_sentence = ''
	forward_speed = 0
	reverse_speed = 0
	turn_direction = 0
	safety_property = False
	object_distance = 0
	border_color = 0
	lake_list = []
	color_list = []
	measurement_list = []
	flashing_color = 0
	timeout = 0
	behaviours = []
	mission_list = []
	avoid_objects = False
	
	# code variables
	mission_end = True
	mission_end_block = False
	lake_depth = 800
	avoid_object_bool = False
	stop_bool = False
	new_lake_found = 0
	found_colors = []
	turn_state = 0
	measured_colors=[]
	color_mission_active_bool = True
	mission_start_time = time()
	
	
	#---------------------------- Communication ---------------------------
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
	    # start executing missions
	    missions()
	    disconnect(sock_in)
	    disconnect(sock_out)
	    disconnect(sock)
	
	
	def start_listening(sock_in, sock_out):
	    i = 1
	    sock_out.write(str(i) + '\n')
	    sock_out.flush()
	    listen(sock_in, sock_out)
	
	
	def listen(sock_in, sock_out):
	    global avoid_object_bool
	    global stop_bool
	    print('Now listening...')
	    while True:
	        data = sock_in.readline()
	        # handle input from brick2
	        if 'Avoid' in data:
	            print('Avoid Received')
	            avoid_object_bool = True
	        sleep(1)
	        # ending communication
	        if stop_bool:
	            sock_out.write("stop" + '\n')
	            sock_out.flush()
	            break
	        # keeping connection alive
	        sock_out.write("nothing" + '\n')
	        sock_out.flush()
	
	
	#----------------------------- Report Functions -----------------------------
	def missionRanking(mission_name, duration_minutes, duration_seconds):
	    # variables
	    folder_name = "MissionRankings"
	    first_sentence = "Placements:\n"
	    max_rank_size = 5
	
	    # Create missionRankings folder and file for this mission, in case it does not yet exist on the user's machine
	    Path("./{}".format(folder_name)).mkdir(parents=True, exist_ok=True)
	    f = open("./{}/{}.txt".format(folder_name, mission_name), "a")
	    f.close()
	
	    with open("./{}/{}.txt".format(folder_name, mission_name), 'r') as reader:
	        # Check if rankings for this mission are stored on the running machine
	        if reader.readline() != first_sentence:
	            new_file = True
	        else:
	            new_file = False
	
	        # Create format if file is new
	        if new_file:
	            with open("./{}/{}.txt".format(folder_name, mission_name), 'w') as writer:
	                writer.write(first_sentence)
	
	    # Gathering old file
	    with open("./{}/{}.txt".format(folder_name, mission_name), 'r') as reader:
	        old_file = reader.readlines()
	
	    # Add new mission statistics
	    with open("./{}/{}.txt".format(folder_name, mission_name), 'r') as reader:
	        reader.readline() # Read header line before looping
	        line_number = 0
	        found_line = 0
	        # Find correct position to add the new time
	        found = False
	        for line in reader:
	            line_number += 1
	            if (int(line[:1]) > duration_minutes or (int(line[:1]) == duration_minutes and int(line[2:]) >= duration_seconds)) and not found:
	                found = True
	                found_line = line_number
	
	    # add new time to ranking file in correct position, if relevant. Return position in the ranking file.
	    if found_line:
	        with open("./{}/{}.txt".format(folder_name, mission_name), 'w') as writer:
	            new_file_data = old_file
	            new_file_data[found_line] = "{}:{}\n{}".format(duration_minutes, duration_seconds, old_file[found_line])
	            writer.writelines(new_file_data[:max_rank_size]) # :max_rank_size to remove the new bottom ranking
	            return_value = found_line
	    elif not found_line and line_number <= max_rank_size-1:
	        with open("./{}/{}.txt".format(folder_name, mission_name), 'a') as appender:
	            appender.write("{}:{}\n".format(duration_minutes, duration_seconds))
	            return_value = line_number+1 # +1 because it is appended on top of the last found line in the ranking file
	    else:
	        return_value = 99
	
	    # Check new mission position
	    with open("./{}/{}.txt".format(folder_name, mission_name), 'r') as reader:
	        print(reader.read())
	
	    return return_value
	
	
	def missionReport(mission_name, mission_duration):
	    print("Mission complete!")
	    # name with space e.g. Find Colors
	    # duration in seconds
	
	    # Calculating the minutes and seconds it took to complete the mission
	    mission_minutes = math.floor(mission_duration / 60)
	    mission_seconds = mission_duration % 60
	
	    # Determining mission ranking in comparison to previous performances on this machine
	    ranking = missionRanking(mission_name, mission_minutes, mission_seconds) # - ask return value from placement / mission_ranking function (creates .txt file with placements)
	    if ranking <= 5:
	        placement = "This mission is ranked as number {}. Good Job!".format(ranking)
	    else:
	        placement = "This mission did not make the top 5. Better luck next time!"
	
	    if mission_minutes > 0:
	        s.speak("Mission {} completed in {} minutes and {} seconds. {}".format(mission_name, mission_minutes, mission_seconds, placement), play_type=0)  # Blocks until done talking
	    else:
	        s.speak("Mission {} completed in {} seconds. {}".format(mission_name, mission_seconds, placement), play_type=0)  # Blocks until done talking
	
	
	#----------------------------- Behaviours -----------------------------
	# default behaviour
	class Default:
	    stop = False
	    prio = 0  # lowest priority
	
	    def takeControl(self):
	        return True
	
	    def action(self):
	        counter = 0
	        while not self.stop:
	            counter += 1
	            if counter == 5000:
	                break
	
	    def suppress(self):
	        print("B2 suppressed!")
	        self.stop = True
	
	
	# parking and safety behaviour to stop going beyond the outer border
	class StayInLine:
	    start_time_set = False
	    done = False
	    prio = 10  # highest priority
	
	    def takeControl(self):
	        global border_color
	        global turn_state
	        return (turn_state == 0 and (
	                    cs_l.color == border_color or cs_m.color == border_color or cs_r.color == border_color or us_b.distance_centimeters > 100)) or (
	                           turn_state == 1 and us_b.distance_centimeters > 100) or (turn_state == 2 and (
	                    cs_l.color == border_color or cs_m.color == border_color or cs_r.color == border_color))
	
	    def action(self):
	        global turn_state
	        global border_color
	        global forward_speed
	        global reverse_speed
	        global park
	        global mission_start_time
	        global mission_end
	        self.done = False
	        left = False
	        right = False
	        rotation_speed_forward = 0.8 * forward_speed
	        rotation_speed_backwards = 0.8 * reverse_speed
	
	        # if we are parking
	        if park and (cs_l.color == border_color or cs_m.color == border_color or cs_r.color == border_color):
	            # Determining mission start time. Only called true at the first time this part class is ran.
	            if self.start_time_set == False:
	                mission_start_time = math.floor(time())
	                self.start_time_set = True
	
	            turn_state = 4
	            while True:
	                if cs_l.color == border_color and cs_r.color == border_color and cs_m.color == border_color:
	                    print("3 colors!")
	                    break
	                elif cs_l.color == border_color and cs_r.color == border_color:
	                    print("2 colors!")
	                    break
	                elif cs_l.color == border_color:
	                    # if right should be on the border but isn't anymore
	                    tank_drive.stop()
	                    # sleep(0.5)
	                    if right:
	                        right = False
	                        print("right is true")
	                        tank_drive.on_for_rotations(left_speed=-forward_speed, right_speed=-forward_speed, rotations=1)
	                        tank_drive.on(left_speed=forward_speed, right_speed=forward_speed)
	                    else:
	                        left = True
	                        tank_drive.on(left_speed=0, right_speed=rotation_speed_forward)
	                elif cs_r.color == border_color:
	                    tank_drive.stop()
	                    # sleep(0.5)
	                    if left:
	                        left = False
	                        print("left is true")
	                        tank_drive.on_for_rotations(left_speed=reverse_speed, right_speed=reverse_speed, rotations=1)
	                        tank_drive.on(left_speed=forward_speed, right_speed=forward_speed)
	                    else:
	                        right = True
	                        tank_drive.on(left_speed=rotation_speed_forward, right_speed=0)
	            tank_drive.stop()
	            s.speak("Going to park now")
	            # the actual parking
	            turn_state = 1
	            tank_drive.on_for_rotations(left_speed=0, right_speed=rotation_speed_backwards,
	                                        rotations=1.07)  # Turn left 90 degrees(backwards)
	            # if the turn (parking) completed, end mission
	            if not self.done:
	                mission_end_block = True
	                mission_end = True
	                turn_state = 0
	                s.speak(final_sentence)
	                print("Parked")
	
	                Leds().animate_flash('AMBER', sleeptime=0.75, duration=1,
	                                     block=True)  # blocking to prevent early exit()
	
	                # Determining duration time of this mission
	                mission_endtime = math.floor(time())
	                mission_duration = mission_endtime - mission_start_time
	                
	                # Call mission report function
	                missionReport('Parking', mission_duration)
	
	                park = False
	                mission_end_block = False
	
	                # else if we were not turning yet
	        elif turn_state == 0:
	            if cs_l.color == border_color:
	                turn_state = 1
	                tank_drive.on_for_rotations(left_speed=0, right_speed=rotation_speed_backwards,
	                                            rotations=turn_direction)  # Turn left (backwards)
	            elif cs_m.color == border_color:
	                turn_state = 1
	                tank_drive.on_for_rotations(left_speed=0, right_speed=rotation_speed_backwards,
	                                            rotations=turn_direction)  # Turn left (backwards)
	            elif cs_r.color == border_color:
	                turn_state = 1
	                tank_drive.on_for_rotations(left_speed=0, right_speed=rotation_speed_backwards,
	                                            rotations=turn_direction)  # Turn left (backwards)
	            elif us_b.distance_centimeters > 100:
	                turn_state = 2
	                tank_drive.on_for_rotations(left_speed=rotation_speed_forward, right_speed=0,
	                                            rotations=turn_direction)  # Turn right (forward)
	        # else if we were interrupted while turning backwards
	        elif turn_state == 1:
	            turn_state = 2
	            tank_drive.on_for_rotations(left_speed=rotation_speed_forward, right_speed=0,
	                                        rotations=turn_direction)  # Turn right (forward)
	        # else if we were interrupted while turning forward
	        elif turn_state == 2:
	            turn_state = 1
	            tank_drive.on_for_rotations(left_speed=0, right_speed=rotation_speed_backwards,
	                                        rotations=turn_direction)  # Turn left (backwards)
	        # if turn is completed, reset the turn_state
	        if not self.done:
	            turn_state = 0
	            print("Turn completed!")
	
	    def suppress(self):
	        # if we are suppressed by the same function, stop and indicate we did not finish turning
	        tank_drive.stop()
	        self.done = True
	
	
	# measure and safety behaviour to not drive into lake
	class AvoidLakes:
	    prio = 9 # second highest
	    start_time_set = False
	
	    def takeControl(self):
	        global lake_list
	        return cs_l.color in lake_list or cs_m.color in lake_list or cs_r.color in lake_list
	
	    def action(self):
	        global lake_list
	        global measure
	        global forward_speed
	        global reverse_speed
	        global mission_end
	        global measured_colors
	        global measurement_list
	        global final_sentence
	        global new_lake_found  # Used for find colors
	        global mission_start_time
	        global color_mission_active_bool
	
	        rotation_speed_forward = 0.8 * forward_speed  # 80% of max speed forwards
	        rotation_speed_backwards = 0.8 * reverse_speed  # 80% of max speed backwards
	        tank_drive.stop()
	
	        # Plays a sound iff no other missions are playing a sound when a lake is found
	        if color_mission_active_bool == False:
	            s.speak("Found lake", play_type=Sound.PLAY_NO_WAIT_FOR_COMPLETE)
	
	        # execute measurements
	        if measure and ((cs_l.color in measurement_list and not cs_l.color in measured_colors) or (
	                cs_m.color in measurement_list and not cs_m.color in measured_colors) or (
	                                cs_r.color in measurement_list and not cs_r.color in measured_colors)):
	
	            # Determining mission start time. Only called true at the first time this part class is ran.
	            if self.start_time_set == False:
	                mission_start_time = math.floor(time())
	                self.start_time_set = True
	
	            # getting in position
	            while True:
	                if cs_l.color in measurement_list and cs_r.color in measurement_list:
	                    break
	                elif cs_l.color in lake_list:
	                    tank_drive.on(left_speed=0, right_speed=rotation_speed_forward)
	                elif cs_r.color in lake_list:
	                    tank_drive.on(left_speed=rotation_speed_forward, right_speed=0)
	                elif cs_m.color in lake_list:
	                    tank_drive.on(left_speed=forward_speed, right_speed=forward_speed)
	            # measuring
	            tank_drive.stop()
	            s.speak("Measuring now")
	            measure_motor.on_for_degrees(speed=-20, degrees=90)
	            measured_colors.append(cs_l.color)
	            sleep(1)
	            measure_motor.on_for_degrees(speed=20, degrees=90)
	            tank_drive.on_for_rotations(left_speed=reverse_speed, right_speed=reverse_speed, rotations=1)
	            tank_drive.on_for_rotations(left_speed=0, right_speed=rotation_speed_backwards,
	                                        rotations=turn_direction)  # Turn left (backwards)
	            # if we measured all colors
	            if (len(measured_colors) == len(measurement_list)):
	                mission_end_block = True
	                mission_end = True
	                print(measured_colors)
	                s.speak(final_sentence, play_type=Sound.PLAY_NO_WAIT_FOR_COMPLETE)
	                print("Measurements performed")
	                Leds().animate_flash('AMBER', sleeptime=0.75, duration=1,
	                                     block=True)  # blocking to prevent early exit()
	
	                # Determining duration time of this mission
	                mission_endtime = math.floor(time())
	                mission_duration = mission_endtime - mission_start_time
	
	                # Call mission report function
	                missionReport('Measuring', mission_duration)
	
	                measure = False
	                mission_end_block = False
	                # if not measuring
	        else:
	            if cs_l.color in lake_list:
	                new_lake_found = cs_l.color  # Used for find colors
	                # print("{} lake on left side".format(lake_list[new_lake_found]))
	                tank_drive.on_for_rotations(left_speed=0, right_speed=rotation_speed_backwards,
	                                            rotations=turn_direction)  # Turn left (backwards)
	            elif cs_m.color in lake_list:
	                new_lake_found = cs_m.color  # Used for find colors
	                # print("{} lake in front".format(lake_list[cs_m.color]))
	                tank_drive.on_for_rotations(left_speed=0, right_speed=rotation_speed_backwards,
	                                            rotations=turn_direction)  # Turn left (backwards)
	            elif cs_r.color in lake_list:
	                new_lake_found = cs_r.color  # Used for find colors
	                # print("{} lake on right side".format(lake_list[cs_r.color]))
	                tank_drive.on_for_rotations(left_speed=0, right_speed=rotation_speed_backwards,
	                                            rotations=turn_direction)  # Turn left (backwards)
	                # print("Appended new lake RIGHT: {}\n\n".format(new_lake_found))
	                # print(cs_r.color)
	
	    def suppress(self):
	        print("suppressed")
	
	
	# safety behaviour to not bump into objects
	class AvoidObjects: # Add sensor checks to brick 2. Action code can be here. Take control if signal from brick 1?
	    global forward_speed
	    global turn_direction
	    stop = False
	    prio = 8 # Higher = more important
	
	    brick2_us_f = False
	    brick2_ts_b = False
	    brick2_ts_l = False
	    brick2_ts_r = False
	
	    def takeControl(self):
	        global avoid_object_bool
	        global avoid_objects
	        return avoid_object_bool and avoid_objects
	
	    def action(self):
	        rotation_speed_backwards = (-0.8)*forward_speed # 80% of max speed backwards
	        global avoid_object_bool
	        avoid_object_bool = False
	        print("Avoiding object") # Can extend if you want to display different turn side for each bumper or something
	        tank_drive.on_for_rotations(left_speed=0, right_speed=rotation_speed_backwards, rotations=turn_direction)
	
	    def suppress(self):
	        print("AvoidObjects suppressed!")
	
	
	class FindColors: # change name to find lakes?
	    stop = False
	    done = False
	    start_time_set = False
	    prio = 5  # Higher = more important
	    old_lake_found = 0
	    #mission_start_time = time()
	
	    def takeControl(self):
	        global new_lake_found
	        return new_lake_found != self.old_lake_found and not self.done
	
	    def action(self):
	        global found_colors
	        global new_lake_found
	        global mission_start_time
	        global mission_end
	
	        # Determining mission start time. Only called true at the first time this part class is ran.
	        if self.start_time_set == False:
	            mission_start_time = math.floor(time())
	            self.start_time_set = True
	
	        self.old_lake_found = new_lake_found # allows 1 run of this action, then they are equal again
	        mission_colors = ["Blue", "Red", "Yellow"]  # Give as input
	        all_colors_on_field = {
	            2: "Blue",
	            4: "Yellow",
	            5: "Red"
	        }
	
	        if not self.done:
	            if self.old_lake_found in all_colors_on_field:  # check if old_lake_found is a key value in our dictionary
	                found_color = all_colors_on_field[self.old_lake_found] # Determines which color is attached to this key value
	                if found_color in mission_colors and found_color not in found_colors:
	                    found_colors.append(found_color)
	                    remaining_color_amount = len(mission_colors)-len(found_colors)
	
	                    # Mission status update
	                    tank_drive.off(brake=True)
	                    s.speak("{} lake added to found colors. {} colors left to find.".format(found_color, remaining_color_amount), play_type=0) # Blocking to allow full report before continuing
	                    print("\nNew color found: {}".format(found_color))
	                    print("{} lake added to found colors. {} colors left to find.\n".format(found_color, remaining_color_amount))
	
	            if len(found_colors) == len(mission_colors):
	                mission_end_block = True
	                mission_end = True
	                # Mission completion sequence initiated
	                print("ALL COLORS FOUND!\n")
	                tank_drive.off(brake=True) # Stops rover to prevent it from driving off the edge
	                Leds().animate_flash('AMBER', sleeptime=0.75, duration=1,
	                                     block=True)  # blocking to prevent early exit()
	
	                # Determining duration time of this mission
	                mission_endtime = math.floor(time())
	                mission_duration = mission_endtime - mission_start_time
	
	                # Call mission report function
	                missionReport('Find Colors', mission_duration)
	
	                # Signals that this mission is completed to the rest of the code
	                self.done = True
	                mission_end_block = False
	
	    def suppress(self):
	        print("FindColors suppressed!")
	        self.stop = True
	
	
	# ------------------------------ Missions ------------------------------
	# missions generated by the DSL
	
	«FOR m: root.missionlist»
	def «String.valueOf(m.missiontype).toLowerCase()»«root.missionlist.indexOf(m)»():
	    «IF m.missiontype.equals(MissionType.PARK)»global park«ENDIF»
	    «IF m.missiontype.equals(MissionType.MEASURE)»global measure«ENDIF»
	    global begin_sentence
	    global final_sentence
	    global forward_speed
	    global reverse_speed
	    global turn_direction
	    global safety_property
	    global object_distance
	    global border_color
	    global lake_list
	    global color_list
	    global measurement_list
	    global flashing_color
	    global timeout
	    global avoid_objects
	    global behaviours

	    # variables generated by DSL
	    park = «IF m.missiontype.equals(MissionType.PARK)»True«ELSE»False«ENDIF»
	    measure = «IF m.missiontype.equals(MissionType.MEASURE)»True«ELSE»False«ENDIF»
	    begin_sentence = "«m.beginsentence»"
	    finalsentence = "«m.finalsentence»"
	    forward_speed = «IF !(m.forwardspeed === null)»«m.forwardspeed.integer»«ELSE»50«ENDIF»
	    reverse_speed = «IF !(m.reversespeed === null)»-«m.reversespeed.integer»«ELSE»-20«ENDIF»
	    turn_direction = («IF !(m.turndirection === null)»«m.turndirection.integer»«ELSE»90«ENDIF»/360)*4.28
	    safety_property = «IF m.safetyproperty.equals(Safety.ON)»True«ELSE»False«ENDIF»
	    object_distance = «IF m.objectdistance === null»15«ELSE»«m.objectdistance.integer»«ENDIF»
	    border_color = «IF (m.bordercolor === null)»6«ELSE»«toInt(m.bordercolor.color)»«ENDIF»
	    lake_list = [«IF !m.lakelist.isEmpty()»«FOR l: m.lakelist SEPARATOR ","»«toInt(l)»«ENDFOR»«ENDIF»]
	    color_list = [«IF m.missiontype.equals(MissionType.FIND_COLORS)»«FOR c: m.colorlist SEPARATOR "," »«toInt(c)»«ENDFOR»«ENDIF»]
	    measurement_list = [«IF m.missiontype.equals(MissionType.MEASURE)»«FOR c: m.measurelist SEPARATOR "," »«toInt(c)»«ENDFOR»«ENDIF»]
	    flashing_color = «IF (m.flashingcolor === null)»6«ELSE»«toInt(m.flashingcolor.color)»«ENDIF»
	    timeout = «IF !(m.timeout === null)»«m.timeout.integer»«ELSE»120«ENDIF»
	    avoid_objects = «IF m.safetyproperty.equals(Safety.ON)»True«ELSE»False«ENDIF»
	    behaviours = [«IF m.safetyproperty.equals(Safety.ON)»StayInLine(), «ENDIF»«IF m.safetyproperty.equals(Safety.ON) && !m.lakelist.isEmpty() »AvoidLakes(), «ENDIF»«IF m.safetyproperty.equals(Safety.ON)»AvoidObjects(), «ENDIF»«IF m.missiontype.equals(MissionType.FIND_COLORS)»«m.missiontype»(), «ENDIF»Default()]

	«ENDFOR»
	mission_list = [«FOR m: root.missionlist SEPARATOR ", "»«String.valueOf(m.missiontype).toLowerCase()»«root.missionlist.indexOf(m)»«ENDFOR»]
	
	# ------------------------ Controlling missions ------------------------
	behaviour = Default()
	
	# keeping track of time and interrupting behaviours
	def monitoring():
	    global behaviour
	    global behaviours
	    global stop_bool
	    global mission_end
	
	    # tracking time for time out
	    endtime = time() + timeout
	
	    while True:
	        # stopping if all missions are finished
	        if stop_bool:
	            break
	        # stopping if time is up
	        if (endtime < time()):
	            s.speak("Time is up!")
	            print("Time is up!")
	            stop_bool = True
	            break
	        # pausing if mission ended to allow loading next mission
	        if (mission_end):
	            while mission_end_block:
	                #just wait
	            sleep(1)
	            endtime = time() + timeout
	        # switching to the needed behaviour
	        for b in behaviours:
	            sleep(0.5)
	            if behaviour.prio < b.prio and b.takeControl():
	                print("interrupting prio: ", behaviour.prio)
	                behaviour.suppress()
	                # sleep(1) # Remove later with print, just for testing
	            elif behaviour.prio == b.prio == 10 and b.takeControl():
	                print("Stayinline interrupted by itself.")
	                behaviour.suppress()
	
	# starting the next mission and keeping track of overall progress
	def missions():
	    global behaviour
	    global behaviours
	    global stop_bool
	    global forward_speed
	    global mission_list
	    global mission_end
	
	    mission_index = 0
	    monitor = threading.Thread(target=monitoring)
	    monitor.start()
	
	    # handle execution and order of missions
	    while True:
	        # stop with the program
	        if (stop_bool):
	            tank_drive.stop()
	            print("Signing off for today!")
	            sleep(2)  # giving time to send stop signal to other brick
	            break
	        # stop driving and go to next mission
	        if (mission_end):
	            tank_drive.stop()
	            while mission_end_block:
	                # just wait
	            sleep(1)
	            # stop program if this was the last mission
	            if (mission_index == len(mission_list)):
	                print("Last mission finished")
	                s.speak("All missions finished")
	                stop_bool = True
	            # end of mission feedback etc
	            else:
	                print("Next mission: ", str(mission_list[mission_index]))
	                mission_list[mission_index]()
	                mission_index += 1
	                mission_end = False
	                sleep(1)
	                s.speak(begin_sentence, play_type=Sound.PLAY_NO_WAIT_FOR_COMPLETE)
	                # continue driving and go to the next behaviour
	        tank_drive.on(SpeedPercent(forward_speed), SpeedPercent(forward_speed))
	        behaviour = next(b for b in behaviours if b.takeControl())
	        behaviour.action()
	
	s.speak("Hello!")
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