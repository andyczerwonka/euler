package euler

object Euler006 {

  private def square(x: Int) = x * x

  def sumOfSquares(range: Range) = range.map(square(_)).sum

  def squareOfSums(range: Range) = square(range.sum)

}

