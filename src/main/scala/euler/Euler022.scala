package euler
import java.io.File
import scala.util.Sorting



object Euler022 {
  
  lazy val sortedNames : List[String] = {
    val path = new File(".").getAbsolutePath() 
    val source = scala.io.Source.fromFile("src/main/scala/euler/names.txt")
    val array = source.mkString.split(",").map(s => s.substring(1, s.length() - 1)) // strip the quotes from the input file
    source.close
    array.toList.sortWith((e1, e2) => (e1 compareTo e2) < 0)
  }

}