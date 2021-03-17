package stack

class Stack {
  var list : List[Int] = List[Int]()
  var Index: Int = -1

  //Push method to add element at last index in the Stack
  def Push (element : Int) = {
    list = list :+ element
    Index += 1
  }

  //Pop method to delete the last element of the stack
  def  Pop = {
      require(Index != -1 , "Stack UnderFlow !!!") // Check for stack underflow !!
      list = list.dropRight(1) //removing Last Index from Stack
      Index = -1
  }

  // getStack method to Display the elements of Stack as List
  def getStack : List[Int] = {
    list
  }

  def isEmpty : Boolean = {
    if(list.isEmpty)  true
    else false
  }

  def Peek : Int = {
    require(Index != -1 , "Stack UnderFlow")
    val element: Int = list.last
    list = list.dropRight(1)
    Index = -1
    element

  }

}
