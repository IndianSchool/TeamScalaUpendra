object DemoCurrying {
	def main(args: Array[String]) {
		var result = add(10)(10)
		println("10 + 10 = " + result)


		// pass one param, other is left, underscore is wild character
		var addIt = add(10)_
		var result2 = addIt(3)
		println("10 + 3 = " + result2)
	}

	// if its one line brackets are optional
	def add(a:Int)(b:Int) = a+b
}

