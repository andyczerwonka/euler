package euler

class Euler016 {

   def sumDigits(bd: BigDecimal) = bd.toString.map(_ asDigit).sum

}

