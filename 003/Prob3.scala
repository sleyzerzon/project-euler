object Prob3 {
	
	var threshold = 317584931803L
	val limit = math.sqrt(threshold)
	
	def lazyNatural(a: Long): Stream[Long] = a #:: lazyNatural(a + 1)
	
	def main(args: Array[String]) {
		var result = lazyNatural(1)
					 .takeWhile((natural:Long) => natural < limit)
					 .filter((natural:Long) => threshold % natural == 0 )
					 .max
		println("The largest prime factor of the number 600851475143 is "+result);
	}

}