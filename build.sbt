name := """gressy-demo"""
organization := "gressy"
version := "0.0.1"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaJpa,
  evolutions,
  filters,
  "gressy" %% "gressy-entities" % "0.0.1",
  "org.postgresql" % "postgresql" % "9.4.1208.jre7"
)
