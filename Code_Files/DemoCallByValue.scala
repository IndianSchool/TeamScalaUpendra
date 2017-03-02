object Demo {
	
	def main(args: Array[String]) {
		
		var a:Long = 123123123123L

		delayed(time()) // pass function as parameter
		delayed(123456789101112L) // pass value/literal as parameter
		delayed(a) // pass variable as parameter
		delayed( {println("Hello, World"); 10L}	)
	}

	def time() = {
		println("Getting time in nano seconds")
		System.nanoTime
	}

	def delayed( t: => Long ) = {
		println("In delayed method")
		println("Param: " + t)
	}
}

