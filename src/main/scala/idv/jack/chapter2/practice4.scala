package idv.jack.chapter2


object practice4 {

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a, b) => f(a)(b)

  def main(args: Array[String]): Unit ={
    val f : Int => Int => Int = a => b=> a + b
    val fun1 = uncurry(f)
    val result = fun1(2, 3)
    println(result)

  }

}
