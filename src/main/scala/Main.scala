import org.graalvm.graphio._

@main def foo(): Unit =  
  val bar: GraphOutput.Builder[Object, Object, _] = GraphOutput.newBuilder(null).attr("a", "b")
