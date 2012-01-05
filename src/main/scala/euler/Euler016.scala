package euler

class Euler016 {

  def sumDigits(bd: java.math.BigDecimal) = bd.toString.map(_ asDigit).sum

}

