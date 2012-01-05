package euler

import euler.Helper.fact

class Euler020 {

  def factorial(number: Int) = fact(BigInt(number))

  def sumOfFactorialDigits(number: Int) = {
    factorial(number).toString.map(_ asDigit).sum
  }

}


