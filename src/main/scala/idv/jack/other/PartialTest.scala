package idv.jack.other

object PartialTest {

  val isOdd: PartialFunction[Int, String] = {
    case x if x % 2 != 0 => x + " is odd"
  }

  val isEven: PartialFunction[Int, String] = {
    case x if x % 2 == 0 => x + " is even"
  }
  
  def main(args: Array[String]): Unit ={
    val array = Array(1, 2, 3, 4, 5)
    array.map(isOdd orElse isEven).foreach(e => println(e))

  }

}
