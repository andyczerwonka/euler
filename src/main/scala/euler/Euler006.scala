package euler

class Euler006 {

  private def square(x: Int) = x * x

  def sumOfSquares(in: Range) = in.map(square(_)).sum

  def squareOfSums(in: Range) = square(in.sum)

}

