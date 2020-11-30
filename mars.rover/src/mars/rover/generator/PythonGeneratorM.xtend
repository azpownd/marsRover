package mars.rover.generator

import mars.rover.roverDSL.Greeting
import mars.rover.roverDSL.Model

class PythonGeneratorM {
	def static toText(Model root)'''
	«root.greetings»
	'''
}