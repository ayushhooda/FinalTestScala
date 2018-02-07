import checkOutServices.CheckOutService
import inventoryServices.Products
import org.scalatest.FunSuite

class CheckOutServiceTest extends FunSuite {

  val obj = new CheckOutService

  //scalastyle:off
  test("Method should add product to cart") {
    assert {
      obj.addToCart(Map(), 1, Products("TV", "LED", "Entertainment", 20000)) ==
      Map(1 -> Products("TV", "LED", "Entertainment", 20000))
    }
  }

  test("Method should remove product from cart") {
    assert {
      obj.removeFromCart(Map(1 -> Products("Tv", "led", "entertain", 20000)), 1) == Map()
    }
  }
  //scalastyle:on

}
