package scala


import scala.collection.immutable.Stream.consWrapper

object Prob2 {
	def fibFrom(a: Int, b: Int): Stream[Int] = a #:: fibFrom(b, a + b)
	
	def main(args: Array[String]) {
	var result = fibFrom(1, 1)
				 .takeWhile((fib:Int) => fib < 4000000)
				 .filter((fib:Int) => fib % 2 == 0)
				 .sum
	println("The sum of the even-valued terms considering the terms in the Fibonacci sequence whose values do not exceed four million is "+result);
	}
}