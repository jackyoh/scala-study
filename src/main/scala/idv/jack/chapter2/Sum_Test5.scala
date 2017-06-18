package idv.jack.chapter2

/**
  * Created by user1 on 2017/6/5.
  */
object Sum_Test5 {
  def sum(n: Int): Int = {
     def sumf(n: Int, total: Int): Int = {
       if(n == 0)total
       else sumf(n - 1, total + n)
     }
    sumf(n, 0)
  }

  def main(args: Array[String]): Unit ={
    val result = sum(10)
    println(s"$result")

  }
}
