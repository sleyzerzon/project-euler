object Prob6 {
  
  def main(args: Array[String]) {
    val sumSquare = (1 to 100).map(n =>n*n).sum
    val sum = (1 to 100).sum   
    val result = (sum*sum) - sumSquare
    println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is "+ result);
  }

}