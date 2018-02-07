package inventoryServices

trait InventoryApi {

  def addProduct(productDb: Map[Int, Products], productDetails: Products, productId: Int): Map[Int, Products]

  def viewInventory(productDb: Map[Int, Products]): List[(Int, Products)]

  def searchOnCategory(category: String, productDb: Map[Int, Products]): Map[Int, Products]

  def sortItemsByPriceAscending(productDb: Map[Int, Products]): List[(Int, Products)]

  def sortItemsByPriceDescending(productDb: Map[Int, Products]): List[(Int, Products)]

}
