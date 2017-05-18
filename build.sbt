name := """scala-study"""

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.1"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

val akkaVersion = "2.4.10"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.6" % "test"
)
