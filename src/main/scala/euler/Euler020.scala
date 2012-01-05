package euler

import euler.Helper.fact

object Euler020 {

  def factorial(number: Int) = fact(BigInt(number))

  def sumOfFactorialDigits(number: Int) = {
    factorial(number).toString.map(_ asDigit).sum
  }

}


