package List_Elements

object List_impl {
  def main(args: Array[String]): Unit = {
    val list_api = new List_api
    print(list_api.getLastElement(List(5,7,2,4,5)))
  }
}
