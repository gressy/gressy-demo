name := """gressy-demo"""
organization := "gressy"
version := "0.0.1"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "gressy" %% "gressy-entities" % "0.0.1"
)
