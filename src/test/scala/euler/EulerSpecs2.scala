package euler
import org.junit._
import org.specs2.matcher._

class EulerSpecs2 extends JUnitMustMatchers {

  @Test
  def testEuler001 {
    val range = 1 until 1000
    Euler001.filterApproach(range) mustEqual 233168
    Euler001.patternMatchApproach(range) mustEqual 233168
  }

  @Test
  def testEuler022 {

    def wordValue(s: String, list: List[String]): Int = {
      val locationValue = list.indexOf(s) + 1
      val wordValue = s.map(_.toInt - 64).sum
      locationValue * wordValue
    }

    val names = Euler022.sortedNames
    val sum = names.map(s => wordValue(s, names)).sum
    sum mustEqual 871198282

  }

  @Test
  def testEuler004 {

    def isPalindrome(n: Int): Boolean = {

      def split(n: Int) = {
        val stringValue = n.toString()
        val left = stringValue.substring(0, stringValue.size / 2)
        val right = stringValue.substring(stringValue.size / 2)
        (left, right)
      }

      if (n.toString.size % 2 != 0)
        false
      else {
        val (left, right) = split(n)
        left.equals(right.reverse)
      }
    }

    isPalindrome(9009) mustEqual true
    isPalindrome(9008) mustEqual false

  }

}