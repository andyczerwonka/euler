organization := "com.andyczerwonka"

name := "euler"

version := "0.1"

scalaVersion := "2.9.1"

retrieveManaged := false

logLevel := Level.Info

resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

resolvers += "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots"

resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots"

libraryDependencies ++= {
  Seq(
    "junit" % "junit" % "4.8" % "test",
    "org.scala-tools.testing" %% "specs" % "1.6.9" % "test",
    "org.specs2" %% "specs2" % "1.6.1" % "test"
  )
}