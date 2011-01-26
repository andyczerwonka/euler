package euler

class Euler003 {

  lazy val naturals: Stream[Int] = Stream.cons(2, naturals.map(_ + 1))

  def answer = {
    var theNum = 600851475143L
    naturals.dropWhile(n => {
      while (theNum % n == 0) {
	theNum /= n }; theNum > 1
    }).head
  }

}
