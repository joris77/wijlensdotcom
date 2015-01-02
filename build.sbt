import NativePackagerKeys._

name := "wijlensdotcom"

version := "1.0"

lazy val `wijlensdotcom` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq( jdbc , anorm , cache , ws )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

// setting a maintainer which is used for all packaging types</pre>
maintainer:= "Joris Wijlens"

// exposing the play ports
dockerExposedPorts in Docker := Seq(9000, 9443)