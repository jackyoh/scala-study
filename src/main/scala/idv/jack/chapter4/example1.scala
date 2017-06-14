package idv.jack.chapter4

sealed trait Option[+A]
case class Some[+A](get: A) extends Option[A]
case object None extends Option[Nothing]

object example1 {
  def mean(xs: Seq[Double]): Option[Double] =
    if(xs.isEmpty) None
    else Some(xs.sum / xs.length)

  def main(args: Array[String]): Unit ={
     val result = mean(Seq(1, 2, 3, 4, 5))
     println(result)

    val maps = Map("key1" -> "value1", "key2" -> "value2", "key3" -> "value3")
    println(maps.get("key1"))

  }

}
