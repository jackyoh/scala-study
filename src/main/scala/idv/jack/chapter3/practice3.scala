package idv.jack.chapter3



object practice3 {

  def setHead[A](list: List[A], h: A): List[A] = {
    list match {
      case Nil => sys.error("setHead on empty list")
      case Cons(_, t) => Cons(h, t)
    }

  }

  def main(args: Array[String]): Unit = {
    println(setHead(List(1, 2, 3, 4, 5), 1000))
  }

}
