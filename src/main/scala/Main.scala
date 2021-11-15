import org.graalvm.graphio._

@main def foo(): Unit = GraphOutput.newBuilder(null).attr("a", "b")
