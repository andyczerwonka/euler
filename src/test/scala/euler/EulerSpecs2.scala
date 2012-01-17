package euler
import scala.collection.immutable.Stream.consWrapper
import scala.math.BigInt.int2bigInt

import org.junit.Test
import org.specs2.matcher.JUnitMustMatchers

class EulerSpecs2 extends JUnitMustMatchers {

  @Test
  def testEuler001 {
    val range = 1 until 1000
    Euler001.filterApproach(range) mustEqual 233168
    Euler001.patternMatchApproach(range) mustEqual 233168
  }

  @Test
  def testEuler007 {
    def from(n: Int): Stream[Int] = n #:: from(n + 1)
    def primes(nums: Stream[Int]): Stream[Int] = nums.head #:: primes(nums.tail.filter(_ % nums.head != 0))
    primes(from(2)).take(100001)(10000) mustEqual 3571
  }

  @Test
  def testEuler007Cheat {
    lazy val primes: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
      primes.takeWhile(j => j * j <= i).forall(i % _ > 0))
    primes(10000) mustEqual 104743
  }

  @Test
  def testEuler022 {

    def wordValue(s: String, list: List[String]): Int = {
      val locationValue = list.indexOf(s) + 1
      val wordValue = s.map(_.toInt - 64).sum
      locationValue * wordValue
    }

    val names = Euler022.sortedNames
    val sum = names.map(s => wordValue(s, names)).sum
    sum mustEqual 871198282

  }

  @Test
  def testEuler004 {

    def isPalindrome(n: Int) = n.toString() == n.toString().reverse
    val array = for (i <- 999 to 1 by -1; j <- 999 to i by -1 if isPalindrome(i * j)) yield i * j
    array.max mustEqual 906609
  }

  @Test
  def testEuler025 {
    lazy val fib: Stream[BigInt] = Stream.cons(0, Stream.cons(1, fib.zip(fib.tail).map(p => p._1 + p._2)))
    val size = fib.map(_.toString()).takeWhile(_.size < 1000).size
    size mustEqual 4782
  }

  @Test
  def testEuler019 {

  }

}