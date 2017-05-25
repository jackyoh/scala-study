package idv.jack.chapter3



object practice2 {

  def tail[A](list: List[A]): List[A] = {
    list match {
      case Nil => sys.error("tail of empty list")
      case Cons(_, t) => t
    }
  }

  def main(args: Array[String]): Unit ={
    val list = tail(List(1, 2, 3, 4, 5))
    println(list)
  }

}
