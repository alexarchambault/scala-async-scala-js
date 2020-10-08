
import scala.async.Async.{async, await}
import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.concurrent.ExecutionContext.Implicits.global

object Test {

  def main(args: Array[String]): Unit = {
    val f = async {
      println()
    }
    Await.result(f, Duration.Inf)
  }
}
