name := """actor-search-play-example"""
organization := "play-java"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.8"

playEbeanModels in Compile := Seq("models.*")

//scalacOptions ++= Seq("-encoding", "UTF-8")
//javacOptions ++= Seq("-encoding", "UTF-8")
//これ意味なかった


libraryDependencies += guice
libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
libraryDependencies += "com.h2database" % "h2" % "1.4.192"
// Visit https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 to see the list of versions available
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.8"

// Compile the project before generating Eclipse files, so that generated .scala or .class files for views and routes are present
EclipseKeys.preTasks := Seq(compile in Compile, compile in Test)
