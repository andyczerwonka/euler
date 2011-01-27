package euler

class Euler008 {

   def largestConsecutiveProduct(string: String, count: Int) =
      string
        .sliding(count)
        .map(_.map(_.asDigit).product)
        .max
      ;

}
