package idv.jack.other

/**
  * Created by user1 on 2017/6/17.
  */
object DefTest {

  def gcd(x: Int, y: Int): Int = if(x % y == 0) y else gcd(y, x % y)

  val sum = (x: Int, y: Int) => x + y

  def main(args: Array[String]): Unit ={
    //println(gcd(10, 100))
    //println(sum(1, 2))
    val array = Array(1, 2, 3, 4, 5)
    array.map((x: Int) => x + 1).foreach(e => print(s"$e "))
    println("\n=========================")
    array.map(x => x + 1).foreach(e => print(s"$e "))
    println("\n==========================")
    array.map(_ + 1).foreach(e => print(s"$e "))
    println("\n")

    val increment = (_: Int) + 1
    array.map(increment).foreach(e => println(s"$e"))
  }

}
