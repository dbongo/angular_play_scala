name := """angular_play_scala"""

version := "1.0-SNAPSHOT"

play.Project.playScalaSettings

//resolvers ++= Seq(
//  Resolver.url("sbt-plugin-releases", url("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
//)

libraryDependencies ++= Seq(
  // Select Play modules
  //jdbc,      // The JDBC connection pool and the play.api.db API
  cache,
  //anorm,     // Scala RDBMS Library
  filters,   // A set of built-in filters
  //javaCore,  // The core Java API
  // Add your own project dependencies in the form:
  // "group" % "artifact" % "version"
  "org.reactivemongo" %% "play2-reactivemongo" % "0.10.2",
  "securesocial" %% "securesocial" % "2.1.2"
)