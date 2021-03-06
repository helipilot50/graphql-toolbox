name := "graphql-toolbox"
description := "GraphQL Toolbox"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  ws,
  filters,
  "org.sangria-graphql" %% "sangria-relay" % "0.7.3",
  "org.sangria-graphql" %% "sangria-play-json" % "0.3.2",
  "io.gatling" %% "jsonpath" % "0.6.7"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(PlayScala)

herokuAppName in Compile := "graphql-toolbox"