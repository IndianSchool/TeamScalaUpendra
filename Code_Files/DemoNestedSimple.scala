object DemoNestedSimple {
	
	def main(args: Array[String]) {
		println( doSomething(3,4) )
	}

	def doSomething(i:Int, j:Int):Int = {
		// 2 functions defined here

		def addIt(a:Int, b:Int) : Int = { a + b	}
		def prodIt(a:Int, b:Int) : Int = { a * b }

		addIt(i,j) + prodIt(i,j)
		}

}
