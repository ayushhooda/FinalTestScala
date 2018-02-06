package com.knoldus.userDashBoard

import inventoryServices.Products

trait DashBoardApi {

  def register()
  def viewAllSortedItems(productDb: Map[Int, Products]): Map[Int, Products]
  def addItemsToCart()
  def removeItemFromCart()
  def placeOrder()

}
