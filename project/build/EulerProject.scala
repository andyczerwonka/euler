import sbt._

class EulerProject(info: ProjectInfo) extends DefaultWebProject(info) {
  // If you're using JRebel uncomment this line
  override def scanDirectories = Nil

  override def libraryDependencies = Set(
    "junit" % "junit" % "4.7" % "test->default",
    "org.scala-tools.testing" %% "specs" % "1.6.7" % "test->default"
  ) ++ super.libraryDependencies

}
