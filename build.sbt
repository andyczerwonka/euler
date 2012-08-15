organization := "com.andyczerwonka"

name := "euler"

version := "0.1"

scalaVersion := "2.9.2"

retrieveManaged := false

logLevel := Level.Info

resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

resolvers += "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots"

resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots"

libraryDependencies ++= {
  Seq(
    "joda-time" % "joda-time" % "2.0",
    "junit" % "junit" % "4.8" % "test",
    "org.specs2" %% "specs2" % "1.12" % "test"
  )
}