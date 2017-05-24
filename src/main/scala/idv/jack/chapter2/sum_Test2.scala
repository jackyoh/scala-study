package idv.jack.chapter2

/**
  * Created by user1 on 2017/5/24.
  */
object sum_Test2 {

  def sum(n: Int, f: Int => Int): Int = {
    def sumf(n: Int, total: Int): Int = {
      if(n <= 0)total
      else sumf(f(n), n + total)
    }
    sumf(n, 0)
  }

  def main(args: Array[String]) = {
    println(sum(9, (x: Int) => x - 2))
    println(sum(10,(x: Int) => x - 1))

  }

}
