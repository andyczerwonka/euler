package euler

class Euler002 {

  lazy val fib: Stream[Int] = new Helper().fibonacciSeq

  def evenValuedSumBelow(ceiling: Int) = fib.filter(_ % 2 == 0).takeWhile(_ < ceiling).sum

}
