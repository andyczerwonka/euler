package euler

class Euler006 {

  private def square(x: Int) = x * x

  def sumOfSquares(in: Range) = in.map(square(_)).sum

  def squareOfSums(in: Range) = square(in.sum)

}

object Euler006 {
  def main(args: Array[String]) {
    val runner = new Euler006
    val range = 1 to 100
    println(runner.squareOfSums(range) - runner.sumOfSquares(range))
  }
}
