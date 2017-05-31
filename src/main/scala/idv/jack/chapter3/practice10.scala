package idv.jack.chapter3

/**
  * Created by user1 on 2017/5/31.
  */
object practice10 {
  def foldLeft[A, B](list: List[A], z: B)(f: (B, A) => B): B = list match {
    case Nil => z
    case Cons(h, t) => foldLeft(t, f(z, h))(f)
  }

  def length[A](list: List[A]): Int =
     foldLeft(list, 0)((acc, _) => acc + 1)

  def main(args: Array[String]): Unit ={
     println(length(List(1, 2, 3, 4, 5)))
  }

}
