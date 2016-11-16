name := """gressy-demo"""
organization := "gressy"
version := "0.0.2"

lazy val root = (project in file(".")).enablePlugins(PlayJava)
PlayKeys.playRunHooks += GulpRunner(baseDirectory.value)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaJpa,
  evolutions,
  filters,
  "com.github.gressy" %% "gressy-entities" % "0.0.2",
  "org.postgresql" % "postgresql" % "9.4.1212.jre7"
)
