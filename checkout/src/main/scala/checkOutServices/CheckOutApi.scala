package checkOutServices

import inventoryServices.Products

trait CheckOutApi {

  def addToCart(userCart: Map[Int, Products], productId: Int, item: Products): Map[Int, Products]

  def removeFromCart(userCart: Map[Int, Products], productId: Int): Map[Int, Products]

}
