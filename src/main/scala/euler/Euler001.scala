package euler

object Euler001 {

  // view is added to the range to virtualize the filter call
  def filterApproach(range: Range) = range.view.filter(i => (i % 3 == 0 || i % 5 == 0)).sum

  def patternMatchApproach(range: Range) = range.foldLeft(0) { (total, x) =>
    x match {
      case i if (i % 3 == 0 || i % 5 == 0) => i + total
      case _ => total
    }
  }


}
