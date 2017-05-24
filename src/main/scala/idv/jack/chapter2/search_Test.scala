package idv.jack.chapter2

object search_Test {

  def findFirst(list: List[Int], x: Int => Boolean): Int = {
    def loop(n: Int): Int =
      if(n >= list.length) -1
      else if(x(list(n))) n
      else loop(n + 1)
    loop(1)
  }
  def main(args: Array[String]): Unit ={
      println(findFirst(List(1, 2, 3, 4, 5), (x: Int) => x == 5))
  }
}
