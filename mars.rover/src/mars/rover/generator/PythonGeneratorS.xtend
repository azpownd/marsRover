package mars.rover.generator

import mars.rover.roverDSL.Greeting
import mars.rover.roverDSL.Model

class PythonGeneratorS {
	def static toText(Model root)'''
	«root»
	'''
}