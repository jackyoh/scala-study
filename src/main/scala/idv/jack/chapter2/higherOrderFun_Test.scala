package idv.jack.chapter2

object higherOrderFun_Test {
  def calc0(f: (Int, Int) => Int): (Int => (Int => (Int))) = (a => (b => f(a, b)))

  def calc1[A](f: (A, A) => A): A => A => A = a => b => f(a, b)

  def calc2[A](f: (A, A) => A): (A, A) => A = {
    def calc22(a: A, b: A): A = {
      f(a, b)
    }
    calc22
  }

  def calc3[A](f: A => A, g: (A, A) => A): A => A => A = a => b => f(g(a, b))

  def main(args: Array[String]): Unit ={
   /* println(calc0((x, y) => x + y)(1)(5))

    println(calc1((x: Int, y: Int) => x + y)(2)(5))
    println(calc1((x: Int, y: Int) => x - y)(5)(2))
    println(calc1((x: Int, y: Int) => x * y)(5)(2))
    println(calc1((x: Int, y: Int) => x / y)(8)(2))
    println(calc1((x: String, y: String) => x.concat(y))("str1")("str2"))

    val func = (x: Int, y: Int) => x + y * x
    println(calc1(func)(2)(8))*/

    println(calc2((x: Int, y: Int) => x + y)(1,2))

    //println("CALC3:" + calc3((x: Int) => x * 10, (x: Int, y: Int) => x + y)(1)(2))
  }


}
