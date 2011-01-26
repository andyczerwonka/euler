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
    val euler001 = new Euler001
    euler001.filterApproach must_== 233168
    euler001.patternMatchApproach must_== 233168
  }

  "002: The sum of all even valued terms in the Fibonacci sequence whose value does not exceed 4 million is 4613732" in {
    val euler002 = new Euler002
    euler002.answer must_== 4613732
  }

  "003: The largest prime factor of the number 600851475143 is 6857" in {
    val euler003 = new Euler003
    euler003.answer must_== 6857
  }

  "005: The smallest number divisible by each of the numbers 1 through 20 is 232792560" in {
    val euler005 = new Euler005
    fail
  }

}

