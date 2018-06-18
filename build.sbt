import scala.language.postfixOps

name := "QRcode"

version := "0.1"

scalaVersion := "2.12.6"
libraryDependencies ++= Seq(
  "com.google.zxing"        % "core"                  % "3.3.0",
  "com.google.zxing"        % "javase"                % "3.3.0",
)
