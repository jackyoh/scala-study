package idv.jack.chapter2


object MapTest {
  def func1(f: (Int, Int) => Int): Unit ={
    println(f(1, 2))
  }

  def main(args: Array[String]): Unit ={
    //func1((x,y) => x + y)

   // val studentInfo = Map("john" -> 21, "stephen" -> 22, "lucy" -> 20)
    /*for(student <- studentInfo){
      //println(student)
      println(student._1 + "   " + student._2)
    }*/

   // studentInfo.foreach(e => {val (k,v) = e; println(k + " " + v)})


   // var total = 0
   // studentInfo.foreach(e => total += e._2)
   // studentInfo.foreach((x: String, y: Int) => x)
   // studentInfo.foreach(e => println(e._1 + "  "))
   // println(s"total=$total")
      val xMap = new scala.collection.mutable.HashMap[String, Int]()
      xMap.put("spark", 1)
      xMap.put("hive", 2)
      xMap.foreach(e => println(e._1 + "   " + e._2))
      val result = xMap.contains("hadoop")
      println(result)

  }

}
