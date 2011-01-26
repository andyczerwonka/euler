package euler

import org.specs._
import org.specs.runner.JUnit4
import org.specs.runner.ConsoleRunner
import org.specs.matcher._
import org.specs.specification._

class EulerSpecsAsTest extends JUnit4(EulerSpecs)
object EulerSpecsSpecsRunner extends ConsoleRunner(EulerSpecs)

object EulerSpecs extends Specification {

    "The sum of all the natural numbers below one thousand that are multiples of 3 or 5 is 233168" in {
      val euler = new Euler001
      euler.filterApproach must_== 233168
      euler.patternMatchApproach must_== 233168
    }

}

