package idv.jack.chapter2

/**
  * Created by user1 on 2017/5/22.
  */
object practice2 {

  def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {
     @annotation.tailrec
    def go(n: Int): Boolean =
       if ( n >= as.length - 1) true
       else if (gt(as(n), as(n + 1))) false
       else go(n + 1)

    go(0)
  }

  def main(args: Array[String]): Unit ={
    val list = Array(10, 11, 12, 14)
    val result = isSorted(list, (x: Int, y: Int) => x > y)
    println(result)
  }

}
