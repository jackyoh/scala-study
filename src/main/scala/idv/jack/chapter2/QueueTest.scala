package idv.jack.chapter2

import scala.collection.immutable.Queue

/**
  * Created by user1 on 2017/6/15.
  */
object QueueTest {
  def main(args: Array[String]): Unit ={

    val queue = Queue(1, 2, 3)
    println(queue.dequeue)

    println(queue.enqueue(4))

  }

}
