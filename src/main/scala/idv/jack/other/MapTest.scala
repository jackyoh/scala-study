package idv.jack.other

/**
  * Created by user1 on 2017/6/17.
  */
object MapTest {
  def main(args: Array[String]): Unit ={
    val maps = Map("key1" -> 10, "key2" -> 20, "key3" ->30)
    maps.foreach(e => println(e._1 + "   " + e._2))

  }

}
