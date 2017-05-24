package idv.jack.chapter2

/**
  * Created by user1 on 2017/5/23.
  */
class MyClass(x: Int, y: Int) {

  require(y > 0, "y must be positive")

  def this(x: Int) = this(x, 1)

  def nb1 = x

  def nb2 = y

  private def test(a: Int): Int = {1}

  val nb3 = x + y
  override def toString = {
    "TO STRING"
  }
}

object MyClass {

  def main(args: Array[String]): Unit ={
    println(new MyClass(1, 1))

  }

}
