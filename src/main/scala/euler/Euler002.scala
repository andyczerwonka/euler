package euler

import euler.Helper.fibonacciSeq

object Euler002 {

  def evenValuedSumBelow(ceiling: Int) = fibonacciSeq.filter(_ % 2 == 0).takeWhile(_ < ceiling).sum

}
