package idv.jack.chapter3



object practice4 {

  def drop[A](list: List[A], n: Int): List[A] =
    if (n <= 0) list
    else list match {
      case Nil => Nil
      case Cons(_, t) => drop(t, n -1)
    }


  def main(args: Array[String]): Unit ={
     println(drop(List(1, 2, 3, 4, 5, 6, 7, 8, 9), 3))

  }
}
