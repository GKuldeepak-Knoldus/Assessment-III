package Table

class Table_api {
  def createTable(list : List[Int]) = {
    for (element <- list) {
      println("Table of " + element)
      for (number <- 1 to 10) {
        print((number * element) + " ")
      }
      println(" ")
    }
  }
}
