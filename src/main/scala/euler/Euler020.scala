package euler

class Euler020 {

  def factorial(number: Int) = new Helper().factorial(BigInt(number))

  def sumOfFactorialDigits(number: Int) = {
    factorial(number).toString.map(_ asDigit).sum
  }

}


