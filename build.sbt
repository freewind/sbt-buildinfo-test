name := "sbt-buildinfo-test"

version := "1.0"

scalaVersion := "2.11.6"

lazy val root = (project in file(".")).
  enablePlugins(BuildInfoPlugin).
  settings(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion),
    buildInfoPackage := "hello"
  )
