package idv.jack.chapter3


object listcalc {

  def sumList(list: List[Int], f: (Int, Int) => Int): Int = list match {
    case Nil => 0
    case Cons(head, tail) => f(head, sumList(tail, f))
  }

  def main(args: Array[String]): Unit ={
    println(sumList(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), (x: Int, y: Int) => x + y))

    println(sumList(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), (x: Int, y: Int) => x * y))
  }

}
