package idv.jack.chapter2


abstract class TopLevel {
  def method1(x: Int): Int
  def method2(x: Int): Int = {
    2
  }
}

class Level1 extends TopLevel {
  override def method1(x: Int): Int = {
    1
  }
}

object MyObject extends TopLevel {
  override def method1(x: Int): Int = {
    2
  }
}


object Hello {
  def main(args: Array[String]) = println("Hello World")
}