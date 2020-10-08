scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true
scalacOptions += "-Xasync"
// "org.scala-lang.modules" %%% "scala-async" % "1.0.0-M1" not available
libraryDependencies += "org.scala-lang.modules" %% "scala-async" % "1.0.0-M1"
