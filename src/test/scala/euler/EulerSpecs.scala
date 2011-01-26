package euler

import org.specs._
import org.specs.runner.JUnit4
import org.specs.runner.ConsoleRunner
import org.specs.matcher._
import org.specs.specification._

class EulerSpecsAsTest extends JUnit4(EulerSpecs)
object EulerSpecsSpecsRunner extends ConsoleRunner(EulerSpecs)

object EulerSpecs extends Specification {

  "001: The sum of all the natural numbers below one thousand that are multiples of 3 or 5 is 233168" in {
    val e1 = new Euler001
    e1.filterApproach must_== 233168
    e1.patternMatchApproach must_== 233168
  }

  "002: The sum of all even valued terms in the Fibonacci sequence whose value does not exceed 4 million is 4613732" in {
    val e2 = new Euler002
    e2.answer must_== 4613732
  }

  "003: The largest prime factor of the number 600851475143 is 6857" in {
    val e3 = new Euler003
    e3.answer must_== 6857
  }

  "006: The difference between the sum of the squares of the first 100 numbers and the square of the sum is 25164150" in {
    val e6 = new Euler006
    val range = 1 to 100
    e6.squareOfSums(range) - e6.sumOfSquares(range) must_== 25164150
  }

}

