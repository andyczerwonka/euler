package euler

class Helper {

  lazy val fibonacciSeq: Stream[Int] = Stream.cons(0, Stream.cons(1, fibonacciSeq.zip(fibonacciSeq.tail).map(p => p._1 + p._2)))

  def factorial(number: BigInt): BigInt = number match {
    case n if n == 0 => 1
    case _ => number * factorial(number - 1)
  }

}
