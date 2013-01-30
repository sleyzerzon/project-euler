package prob

object Prob1 {
  def main(args: Array[String]) {
    var result: Int = 0
      .until(1000)
      .filter((i: Int) => i % 3 == 0 || i % 5 == 0)
      .sum

    println("The sum of all the multiples of 3 or 5 below 1000 is " + result);
  }
}