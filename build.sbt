organization := "edu.berkeley.cs"

version := "2.3-SNAPSHOT"

name := "chisel_float"

scalaVersion := "2.10.2"

addSbtPlugin("com.github.scct" % "sbt-scct" % "0.2")

libraryDependencies += "edu.berkeley.cs" %% "chisel" % "latest.release"
