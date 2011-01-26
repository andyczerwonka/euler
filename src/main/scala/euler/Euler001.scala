package euler

class Euler001 {

  def filterApproach = (1 until 1000).view.filter(i => (i % 3 == 0 || i % 5 == 0)).foldLeft(0)(_ + _)

  def patternMatchApproach = (1 until 1000).foldLeft(0) { (total, x) =>
    x match {
      case i if (i % 3 == 0 || i % 5 == 0) => i + total
      case _ => total
    }
  }

}
