package checkOutServices

import inventoryServices.Products

class CheckOutService extends CheckOutApi {

  /**
    * @param userCart - user's cart containing products
    * @param productId - product's id which is to be added in cart
    * @param item - product's details
    * @return - updated cart
    */
  def addToCart(userCart: Map[Int, Products], productId: Int, item: Products): Map[Int, Products] = {
    userCart + (productId -> item)
  }

  /**
    * @param userCart - user's cart containing products
    * @param productId - product's id which is to be removed from cart
    * @return - updated cart
    */
  def removeFromCart(userCart: Map[Int, Products], productId: Int): Map[Int, Products] = {
    userCart - productId
  }

}
