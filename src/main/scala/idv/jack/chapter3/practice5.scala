package idv.jack.chapter3

/**
  * Created by user1 on 2017/5/25.
  */
object practice5 {

  def dropWhile[A](list: List[A], f: A => Boolean): List[A] =
     list match {
       case Cons(h, t) if f(h) => dropWhile(t, f)
       case _ => list
     }

  def main(args: Array[String]): Unit ={
    val result = dropWhile(List("list1", "list2", "list3", "4", "list5"), (x: String) => x.contains("list"))
    println(result)
  }

}
