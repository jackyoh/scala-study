package idv.jack.other

object DefTest2 {

  def func1(x: Int): (Int, Int) => Int = {
    (y: Int, z: Int) => y * x * z
  }

  def main(args: Array[String]): Unit ={

    val fun = func1(10)
    val result = fun(2, 10)
    println(result)

    val maps = Map("key1" -> 10, "key2" -> 20, "key3" -> 30, "key4" -> 40, "key5" -> 50)
    maps.map(e => e._1 -> e._2 * 10).foreach(e => println(e._1 + "," + e._2))

    val arrayResult = Array("spark", "hive", "hadoop").map(_ * 2)
    arrayResult.foreach(e => println(e))

  }

}
