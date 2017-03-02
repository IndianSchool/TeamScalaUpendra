object DemoNestedFactorial {
	
	def main(args: Array[String]) {
		println( factorial(0) )
		println( factorial(1) )
		println( factorial(2) )
		println( factorial(3) )
	}

	def factorial(i:Int):Int = {
		// a nested function, coincidentally its a recursive one
		def fact(i:Int, accumulator: Int) : Int = {
			if( i <= 1)
				accumulator
			else
				fact( i - 1, i * accumulator)

		}

		fact(i,1)
	}
}

