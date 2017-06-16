package idv.jack.other

object ForExample {

  def main(args: Array[String]): Unit ={
    for(i <- 1 to 10){
      println(s"i=$i")
    }

    val list = List(1, 2, 3, 4, 5)
    list.foreach(e => println(e))

  }


}
