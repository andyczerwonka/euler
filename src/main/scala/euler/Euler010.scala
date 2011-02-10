package euler

import scala.actors.Actor
import Actor._

import scala.math._

object Euler010 extends Application {

  isPrime(9)

  def isPrime(target: Int) = {
    if (target % 2 != 0) {
      val odd = (2 until target).filter(_ % 2 != 0)
      val firstDivisor = odd.find(target % _ == 0)
      println("First divisor found for " + odd + " is " + firstDivisor)
      firstDivisor.isEmpty
    } else false
  }

}
