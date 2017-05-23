package idv.jack.chapter2

/**
  * Created by user1 on 2017/5/22.
  */
object SumMaxTest {

  def sum(xs: List[Int]): Int = {
    xs match {
      case x :: tail => x + sum(tail)
      case Nil => 0
    }

  }

  def max(xs: List[Int]): Int = {
    xs match {
      case Nil => 0
      case x :: Nil => x
      case x :: y :: rest => max((if(x > y)x else y) :: rest)

    }
  }

  def main(args: Array[String]) {
    println(sum(List(1, 2, 3, 4)))
    println(max(List(10, 20, 300, 40 , 50)))
  }

}
