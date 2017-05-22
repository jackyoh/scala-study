package idv.jack.chapter2


object practice1 {

  def fib(n: Int): Int = {
      @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if ( n == 0 ) prev
      else loop(n - 1, cur, prev + cur)

    loop(n, 0, 1)
  }
  def main(args: Array[String]): Unit ={
      println(fib(2))
  }

}
