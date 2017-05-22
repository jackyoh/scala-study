package idv.jack.chapter2


object practice5 {

  def compose[A, B, C](f: B => C, g: A => B): A => C = a => f(g(a))

  def main(args: Array[String]): Unit ={
    val func = compose((x: Int) => x, (g: Int) => g + 1)
    val result = func(1)
    println(result)

  }

}
