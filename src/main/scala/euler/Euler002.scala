package euler

class Euler002 {

  lazy val fib: Stream[Int] = Stream.cons(0, Stream.cons(1, fib.zip(fib.tail).map(p => p._1 + p._2)))

  def evenValuedSumBelow(ceiling: Int) = fib.filter(_ % 2 == 0).takeWhile(_ < ceiling).sum

}
