package euler

class Euler003 {

  lazy val naturals: Stream[Int] = Stream.cons(2, naturals.map(_ + 1))

  def answer = {
    var num = 600851475143L
    naturals.dropWhile(n => {
      while (num % n == 0) {num = num / n};
      num > 1
    }).head
  }

}
