object Prob5 {
  
   def main(args: Array[String]) {
     
     def lazyNatural(a: Long): Stream[Long] = a #:: lazyNatural(a + 1)
     
     def evenlyDivByRange(num:Long)(range:Range):Boolean={
       for (i <- range){ if (num % i != 0) return false}
       true
     }
     
     val result =  lazyNatural(1)
					 .dropWhile(!evenlyDivByRange(_)(1.until(20)))
					 .head
     println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is "+ result)
   }
  
}