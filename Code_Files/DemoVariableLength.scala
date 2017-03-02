object DemoVariableLength {
	
	def main( args: Array[String]) {
		printStrings("Hello", "Java", "R")
		printStrings("Hello", "Java", "R", "Scala", "Python")
		printStrings()
		printStrings("only me")
	}

	// declared only one param but it is of variable length [elastic size]
	def printStrings( words: String* ) = {

		var i : Int = 0
		for( word <- words) {
			println("Arg value[" + i + "] = " + word)
			i = i + 1
		}
	}
}

