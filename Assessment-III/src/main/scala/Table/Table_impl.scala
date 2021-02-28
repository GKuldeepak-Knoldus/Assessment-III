package Table

object Table_impl {
  def main(args: Array[String]): Unit = {
    val table_api = new Table_api
    table_api.createTable(List(5,2,4,1,3))
  }
}
