package idv.jack.chapter3

/**
  * Created by user1 on 2017/5/31.
  */
object practice6 {

  def init[A](list: List[A]): List[A] =
     list match {
       case Nil => sys.error("init of empty list")
       case Cons(_, Nil) => Nil
       case Cons(h, t) => Cons(h, init(t))
     }

  def init2[A](list: List[A]): List[A] = {
    import collection.mutable.ListBuffer
    val buf = new ListBuffer[A]
    @annotation.tailrec
    def go(cur: List[A]): List[A] = cur match {
      case Nil => sys.error("init of empty list")
      case Cons(_, Nil) => List(buf.toList: _*)
      case Cons(h, t) => buf +=h; go(t)
    }
    go(list)
  }

  def main(args: Array[String]): Unit ={

    println(init(List(1, 2, 3, 4, 5, 6)))
    println(init2(List(1, 2, 3, 4, 5, 6)))

  }

}
