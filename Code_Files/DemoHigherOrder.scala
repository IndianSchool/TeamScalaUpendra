object DemoHigherOrder {
	
	def addIt(a:Int, b:Int):Int = { a+b }
	def subIt(a:Int, b:Int):Int = { b-a }
	def prodIt(a:Int, b:Int):Int = { a*b }

	def crazy(a:Int, b:Int) {println("value is : "+(2*a*2*b))}

	def main(args: Array[String]) {

		println(doIt(addIt,1,2))
		println(doIt(subIt,3,4))
		println(doIt(prodIt,5,6))


		crackIt(crazy,5,6)
	}

	def doIt(fn:(Int,Int) => Int, p:Int, q:Int) : Int = {
		fn(p,q)
	}

	def crackIt(lt:(Int,Int) => Unit, x:Int, y:Int) {
		lt(x,y)
	}
}

