object DemoNamedOrder {
	
	def main(args: Array[String]) {
		printSomething(10,20)
		printSomething(second=10, first=20)
	}
	def printSomething(first:Int, second:Int) = {
		println("First param is : " + first + " and Second param is : " + second)
	}
}

