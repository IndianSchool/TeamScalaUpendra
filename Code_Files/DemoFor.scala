object DemoFor {
    def main(args: Array[String]) {
       /* 
        for(var i = 10; i < 20; i = i + 1){
            
            println("The Value is : " + i)
        }*/
        
        // for loop -> to iterate and print the input arguments array
        for(arg <- args) println("[Array]The Value is : " + arg)
        
        // for loop -> to run for n times, using range of numbers
        for(i <- 1 to 10) println("[Range]The Value is : " + i)
        
        // for loop -> to run for all except the last one
        for(i <- 1 until 10) println("[Until]The Value is : " + i)
        
        // var is optional, scala has the intelligence
        var a = 0
        for (a <- 1 to 10){
            println("Value of a is : " + a)
        }
        
        // for loop -> to run multiple or nested loops (3x3x3=27 loops)*3 loops = 81
        var i = 0
        for( a <- 1 to 3; b <- 1 to 3; c <- 1 to 3) {
            i += 1
            println("["+i+"]"+"a is => " + a )
            i += 1
            println("["+i+"]"+"b is => => " + b)
            i += 1
            println("["+i+"]"+"c is => => => " + c)
        }
        
        // for loop -> to iterate through a list
        var numList = List(1,2,3,4,5,6,7)
        for (n <- numList) println("Value in list is : " + n)
        
        // for loop -> with filters
        for ( n <- numList; if n%2 == 0) println("Filtered Value is : " + n)
        
        // for loop -> with multi filters
        for ( n <- numList; if n != 2; if n < 4) 
            println("Another Filtered Value is : " + n)
        
        // for loop -> no semi colon
        for ( n <- numList 
                if n != 2; if n < 7; if n%3 == 0; if n > 3) 
            println("Super Filtered Value is : " + n)
        
        // for loop -> with multi filters + multi line + no semi colon
        for ( n <- numList
                if n != 2
                    if n < 4) 
            println("Multi Filtered Value is : " + n)
        
        // for loop -> with no semi colons // difficult to interpret by us; but works
        for ( n <- numList if n != 2 if n < 4) 
            println("No Colon Value is : " + n)
            
        // for loop -> with yield option
        // to store the output of a loop in a collection variable
        var someVar = for { a <- 1 to 10; if a%2 == 1; if a%3 == 0 } yield a
        
        for(s <- someVar) println("Yeild Value is : " + s)
    }   
    
}