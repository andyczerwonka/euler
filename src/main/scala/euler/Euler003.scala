package euler

object Euler003 {

  lazy val naturals: Stream[Int] = Stream.cons(2, naturals.map(_ + 1))

  def largestPrimeFactor(target: Long) = {
    var num = target;
    naturals.dropWhile(n => {
      while (num % n == 0) {num = num / n};
      num > 1
    }).head
  }

}
