name := """example-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

//Debian package config
enablePlugins(DebianPlugin)

maintainer := "Srikant Sahoo <srikantakumar@address>"

packageSummary := "My custom package"

packageDescription := "Package"


