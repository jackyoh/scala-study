package idv.jack.chapter3

/**
  * Created by user1 on 2017/5/31.
  */
object practice12 {
  def foldLeft[A, B](list: List[A], z: B)(f: (B, A) => B): B = list match {
    case Nil => z
    case Cons(h, t) => foldLeft(t, f(z, h))(f)
  }

  def reverse[A](list: List[A]): List[A] = foldLeft(list, List[A]())((acc, h) => Cons(h ,acc))

  def main(args: Array[String]): Unit ={
    println(reverse(List(1, 2, 3, 4, 5)))

  }
}
