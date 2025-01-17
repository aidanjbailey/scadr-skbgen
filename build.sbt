scalaVersion := "2.13.6"

name := "kbgt"
organization := "University of Cape Town"
version := "1.0"

Compile / doc / scalacOptions := Seq("-groups", "-implicits")
parallelExecution in Test := false

libraryDependencies += "com.github.scopt" % "scopt_2.13" % "4.1.0"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.18"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.18" % "test"
