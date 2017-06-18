package idv.jack.chapter2


object Sum_Test4 {
  def sum(n: Int): Int = {
    def sumf(n: Int, total: Int): Int = {
       if (n == 0) total
       else sumf(n - 1, total + n)
    }
    sumf(n, 0)
  }
  def main(args: Array[String]): Unit ={

    println(sum(10))
    println(sum(1000))
  }

}
