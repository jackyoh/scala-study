package idv.jack.chapter3

/**
  * Created by user1 on 2017/5/31.
  */
object practice9 {
  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B =
    as match {
      case Nil => z
      case Cons(x, xs) => f(x, foldRight(xs, z)(f))
    }

  def length[A](list: List[A]): Int =
     foldRight(list, 0)((_, acc) => acc + 1)

  def main(args: Array[String]): Unit ={
     println(length(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))

  }
}
