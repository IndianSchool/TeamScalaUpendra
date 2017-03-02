object DemoPartial {
	def main(args: Array[String]) {
		val piF = 22f/7f
		val piD = 22d/7d
		var str = "Value of pi in "
		information(str, " float is ", piF)
		information(str, " double is ", piD)

		println("*********INSIGHT*********")

		val insight = information(str, _ : String, _ : Any)
		insight(" double is ", piD)
		insight(" float is ", piF)

		val omega = information(_ : String, "Hello", _ : Any)
		omega("Hi "," Friend")
	}

	def information(a:String, b:String, c:Any) = {
		println(a + b + c)
	}
}

