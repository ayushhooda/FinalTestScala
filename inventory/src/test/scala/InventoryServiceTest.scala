import inventoryServices.{InventoryService, Products}
import org.scalatest.FunSuite

class InventoryServiceTest extends FunSuite {

  val obj = new InventoryService

  // scalastyle:off
  test("Method should add Product to Map and return updated Map") {
    assert {
      obj.addProduct(Map(), Products("TV", "LCD", "Entertainment", 20000), 1) ==
      Map(1 -> Products("TV", "LCD", "Entertainment", 20000))
    }
  }

  test("Method should return Products of particular category") {
    assert {
      obj.searchOnCategory("Entertainment", Map(1 -> Products("TV", "LCD", "Entertainment", 20000),
        2 -> Products("A/C", "Window", "Luxury", 15000))) ==
      Map(1 -> Products("TV", "LCD", "Entertainment", 20000))
    }
  }

  test("Method should return Products on basis of price in ascending order") {
    assert {
      obj.sortItemsByPriceAscending(Map(1 -> Products("TV", "LCD", "Entertainment", 20000),
        2 -> Products("A/C", "Window", "Luxury", 15000))) == List((2, Products("A/C", "Window", "Luxury", 15000)),
        (1, Products("TV", "LCD", "Entertainment", 20000)))
    }
  }

  test("Method should return Products on basis of price in descending order") {
    assert {
      obj.sortItemsByPriceDescending(Map(1 -> Products("TV", "LCD", "Entertainment", 20000),
        2 -> Products("A/C", "Window", "Luxury", 15000))) != List((2, Products("A/C", "Window", "Luxury", 15000)),
        (1, Products("TV", "LCD", "Entertainment", 20000)))
    }
  }

  test("Method should return List of all inventory") {
    assert {
      obj.viewInventory(Map(1 -> Products("TV", "LCD", "Entertainment", 20000),
        2 -> Products("A/C", "Window", "Luxury", 15000))) ==
      List((1, Products("TV", "LCD", "Entertainment", 20000)), (2, Products("A/C", "Window", "Luxury", 15000)))
    }
  }
  //scalastyle:on

}
