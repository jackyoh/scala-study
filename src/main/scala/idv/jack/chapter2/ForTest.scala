package idv.jack.chapter2

/**
  * Created by user1 on 2017/6/5.
  */
object ForTest {

  def main(args: Array[String]): Unit ={
    var total = 0
    for(i <- 1 to 100)
      total += i

    println(s"$total")
  }
}
