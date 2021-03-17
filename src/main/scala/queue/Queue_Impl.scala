package queue

object Queue_Impl extends App {
  val queue = new Queue
  queue.enqueue(4)
  queue.enqueue(5)
  queue.enqueue(34)
  println(queue.getQueue)
  queue.dequeue
  println(queue.getQueue)
  queue.enqueue(6)
  println(queue.getQueue)
}
