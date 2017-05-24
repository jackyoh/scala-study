package idv.jack.chapter2

/**
  * Created by user1 on 2017/5/23.
  */
object higherOrderFun {

  //def sum(f: Int => Int): (Int, Int) => Int = (a, b) => f(a) + b + a

 // def sum(f: Int => Int): Int => Int => Int = a => b => f(a) + b + a

  /*def sum(f: Int => Int): (Int, Int) => Int = {
    def sumf(a: Int, b: Int): Int = {f(a) + b + a}
    sumf
  }*/

  def sum(f: Int => Int)(a: Int, b: Int): Int = {a + b + f(a)}


  def main(args: Array[String]): Unit ={
    /*val fun1 = sum((x: Int) => x)
    val fun2 = fun1(1)(2)
    println(fun2)
*/
    val result = sum((x: Int) => x)(1, 2)
    println(result)

  }
}
