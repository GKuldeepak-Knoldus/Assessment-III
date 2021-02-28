package List_Elements

import scala.collection.convert.ImplicitConversions.`seq AsJavaList`

class List_api {
  def getLastElement(list: List[Any]) : Any = {
    getElementByIndex(list , getLength(list)-1)
  }

  def getLength (list : List[Any]) : Int = {
    var length = 0
    list foreach (element =>length = length + 1)
    length
  }

  def getElementByIndex(list: List[Any] , index : Int) : Any = {
    list.get(index)
  }
}
