package stack

object Stack_Impl extends App {
  val stack = new Stack
  stack.Push(4)
  stack.Push(5)
  stack.Pop
  println(stack.getStack)
  stack.Push(2)
  stack.Push(6)
  println(stack.Peek)
  println(stack.getStack)
  println(stack.isEmpty)

}
