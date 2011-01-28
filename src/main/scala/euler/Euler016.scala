package euler

class Euler016 {

   def sumDigits(bd: BigDecimal) = bd.toString.map(_ asDigit).sum

}

object Euler016 {

  def main(args: Array[String]) {
	val twoPowerThousand = BigDecimal(2).pow(1000)
	val e = new Euler016
	println(e.sumDigits(twoPowerThousand))
  }

}
