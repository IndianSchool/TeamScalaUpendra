object DemoCurrying2 {
	def main(args: Array[String]) {
		var result = add(10,20)(10,30)
		println("10,20,10,30 = " + result)


		// pass one param, other is left, underscore is wild character
		var addIt = add(10,90)_
		var result2 = addIt(10,80)
		println("10,90,10,80 = " + result2)
// wont work
/*		var smashIt = add_(10,60)
		var result3 = smashIt(10,70)
		println("10,70,10,60 = " + result3)
*/
	}

	// if its one line brackets are optional
	def add(a:Int,c:Int)(b:Int,d:Int) = (a+b) * (c+d)
}

