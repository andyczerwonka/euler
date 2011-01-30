package euler

class Euler020 {

  def factorial(number: Int) = new Helper().factorial(BigInt(number))

  def sumOfFactorialDigits(number: Int) = {
    factorial(number).toString.map(_ asDigit).sum
  }

}

object Euler020 {

  def main(args: Array[String]) {
    val e = new Euler020
    println(e.sumOfFactorialDigits(100))
  }

}

