package euler

class Euler016 {

   def sumDigits(string: String) = string.map(_ asDigit).sum

}

object Euler016 {

  def main(args: Array[String]) {
	val digits = BigDecimal(2).pow(1000).toString
	val e = new Euler016
	println(e.sumDigits(digits))
  }

}
