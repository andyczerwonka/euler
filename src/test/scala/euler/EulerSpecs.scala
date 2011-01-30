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
    val range = 1 until 1000
    e1.filterApproach(range) must_== 233168
    e1.patternMatchApproach(range) must_== 233168
  }

  "002: The sum of all even valued terms in the Fibonacci sequence whose value does not exceed 4 million is 4613732" in {
    val e2 = new Euler002
    e2 evenValuedSumBelow 4000000  must_== 4613732
  }

  "003: The largest prime factor of the number 600851475143 is 6857" in {
    val e3 = new Euler003
    e3 largestPrimeFactor 600851475143L must_== 6857
  }

  "006: The difference between the sum of the squares of the first 100 numbers and the square of the sum is 25164150" in {
    val e6 = new Euler006
    val range = 1 to 100
    e6.squareOfSums(range) - e6.sumOfSquares(range) must_== 25164150
  }

  "008: The greatest product of five consecutive digits in the 1000-digit number is 40824" in {
    val list = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450"
    val e8 = new Euler008
    e8.largestConsecutiveProduct(list, 5) must_== 40824
  }

  "016: The sum of the digits of the number 2^1000 is 1366" in {
    val e16 = new Euler016
    val digits = BigDecimal(2).pow(1000)
    e16 sumDigits digits must_== 1366
  }

  "020: The sum of digits in 100! is 648" in {
    val e20 = new Euler020
    e20 sumOfFactorialDigits 100 must_== 648
  }

}

