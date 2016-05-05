
import scala.util.matching.Regex

object RegExTest {
   def main(args: Array[String]) {
      val pattern = "(S|s)cala".r
	  // val pattern = new Regex("(S|s)cala")
	  
      val str = "Scala is scalable and cool"
      println(str)
      println(pattern replaceFirstIn(str, "Java"))
   }
}