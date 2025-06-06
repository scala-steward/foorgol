name := "java-client"

javaOptions += "-deprecation"

crossPaths := false

resolvers += Resolver.typesafeRepo("snapshots")

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-lang3" % "3.17.0",
  "org.apache.httpcomponents" % "httpclient" % "4.5.14",
  "com.google.code.gson" % "gson" % "2.13.1",
  "org.specs2" %% "specs2-core" % "4.2.0")

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))
