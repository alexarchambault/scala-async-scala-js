```text
$ sbt fastOptJS
[info] welcome to sbt 1.4.0 (Oracle Corporation Java 1.8.0_121)
[info] loading global plugins from ~/.sbt/1.0/plugins
[info] loading settings for project scala-async-scala-js-build from plugins.sbt ...
[info] loading project definition from ./project
[info] loading settings for project scala-async-scala-js from build.sbt ...
[info] set current project to scala-async-scala-js (in build file:./)
[info] compiling 1 Scala source to ./target/scala-2.13/classes ...
[info] Fast optimizing ./target/scala-2.13/scala-async-scala-js-fastopt.js
[error] Referring to non-existent class scala.async.FutureStateMachine
[error]   called from Test$stateMachine$async$1
[error]   called from Test$.main([java.lang.String)void
[error]   called from static Test.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   Test$
[error] Referring to non-existent class scala.async.FutureStateMachine
[error]   called from constructor Test$stateMachine$async$1.<init>()void
[error]   called from Test$.main([java.lang.String)void
[error]   called from static Test.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   Test$
[error] Referring to non-existent method constructor scala.async.FutureStateMachine.<init>(scala.concurrent.ExecutionContext)void
[error]   called from constructor Test$stateMachine$async$1.<init>()void
[error]   called from Test$.main([java.lang.String)void
[error]   called from static Test.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   Test$
[error] Referring to non-existent method Test$stateMachine$async$1.start()scala.concurrent.Future
[error]   called from Test$.main([java.lang.String)void
[error]   called from static Test.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   Test$
[error] Referring to non-existent method Test$stateMachine$async$1.start()scala.concurrent.Future
[error]   called from Test$.main([java.lang.String)void
[error]   called from static Test.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   Test$
[error] There were linking errors
[error] (Compile / fastOptJS) There were linking errors
[error] Total time: 8 s, completed 8 oct. 2020 17:22:58
```
