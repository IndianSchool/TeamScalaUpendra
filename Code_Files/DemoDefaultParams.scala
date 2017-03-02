object DemoDefaultParams {
	
	def main(args: Array[String]) {
		
		println("******ADDITION******")
		println("Returned Value : " + addInt() );
		println("Returned Value : " + addInt(3,4) );

		println("******MULTIPLICATION*****")
		println("Returned Value : " + prodInt(3,3));
		println("Returned Value : " + prodInt(4));
		println("Returned Value : " + prodIntRev(4)); // this fails as situation is ambiguous.
		// is it first param? then where is 2nd one 
		// do i need to consider this as 2nd param because first one some default is there
	}

	def addInt( a:Int = 5, b: Int = 8 ) : Int = {
		a + b
	}
	
	def prodInt( x:Int , y:Int = 4 ) = {
		x * y
	}
	def prodIntRev( x:Int = 4 , y:Int ) = {
		x * y
	}
}

