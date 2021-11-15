import org.graalvm.graphio.GraphOutput;

class Foo {
  public static void main(String[] args) {
    GraphOutput.newBuilder(null).attr("a", "b");
  }
} 
