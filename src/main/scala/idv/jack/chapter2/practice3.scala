package idv.jack.chapter2

object practice3 {

  def curry[A, B, C](f: (A, B) => C): A => B => C  =
    a => b => f(a, b)

  def main(args: Array[String]): Unit = {
       val fun = curry((x: Int, y: Int) => x + y)
       println(fun(1)(2))

       val fun1 = curry((x: Int, y: Int) => x + y)
       val fun2 = fun1(1)
       val result = fun2(2)
       println(result)
  }

}
