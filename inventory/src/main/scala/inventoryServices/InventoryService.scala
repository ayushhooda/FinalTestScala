package inventoryServices

class InventoryService extends InventoryApi {

  /**
    * @param productDb - map containing all products
    * @param productDetails - product to be added
    * @param productId - product id for product
    * @return - updated map containing products
    */
  def addProduct(productDb: Map[Int, Products], productDetails: Products, productId: Int): Map[Int, Products] = {
    productDb + (productId -> productDetails)
  }

  /**
    * @param productDb - map containing all products
    * @return - list of all inventory
    */
  def viewInventory(productDb: Map[Int, Products]): List[(Int, Products)] = {
    productDb.toList
  }

  /**
    * @param category - product's category
    * @param productDb - map containing all products
    * @return - map containing products of particular category
    */
  def searchOnCategory(category: String, productDb: Map[Int, Products]): Map[Int, Products] = {

    val list = productDb.keySet.toList
    def innerSearch(list: List[Int], searchedItems: Map[Int, Products]): Map[Int, Products] = {
      list match {
        case head :: tail => if (productDb(head).productCategory equals(category)) {
          val item = productDb(head)
          innerSearch(tail, searchedItems + (head -> item))
        }
        else {
          innerSearch(tail, searchedItems)
        }
        case Nil => searchedItems
      }
    }
    innerSearch(list, Map())
  }

  /**
    * @param productDb - map containing all products
    * @return - list containing products sorted in ascending order by price
    */
  def sortItemsByPriceAscending(productDb: Map[Int, Products]): List[(Int, Products)] = {
    productDb.toList.sortWith((a, b) => a._2.productPrice < b._2.productPrice)
  }

  /**
    * @param productDb - map containing all products
    * @return - list containing products sorted in descending order by price
    */
  def sortItemsByPriceDescending(productDb: Map[Int, Products]): List[(Int, Products)] = {
    productDb.toList.sortWith((a, b) => a._2.productPrice > b._2.productPrice)
  }

}
