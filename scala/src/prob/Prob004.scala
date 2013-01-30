package prob

object Prob4 {

  def isPalindrom(num: Integer): Boolean = {
    val numAsString = String.valueOf(num)
    if (numAsString.size % 2 == 0) {
      val firstHalf = numAsString.substring(0, numAsString.size / 2)
      val secondHalf = numAsString.substring(numAsString.size / 2)
      firstHalf == secondHalf.reverse
    } else {
      val firstHalf = numAsString.substring(0, numAsString.size / 2)
      val secondHalf = numAsString.substring(numAsString.size / 2 + 1)
      firstHalf == secondHalf.reverse
    }
  }

  def main(args: Array[String]) {
    val products = {
      for {
        i <- 1.until(999)
        j <- 1.until(999)
      } yield i * j
    }
    val result = products.filter(isPalindrom(_)).sorted.reverse.head
    println("Ththe largest palindrome made from the product of two 3-digit numbers is " + result);
  }
}