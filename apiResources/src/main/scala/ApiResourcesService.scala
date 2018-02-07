import accountServices.{AccountApi, AccountService}
import checkOutServices.{CheckOutApi, CheckOutService}
import inventoryServices.{InventoryApi, InventoryService}

class ApiResourcesService {

  val accountService = new AccountService with AccountApi

  val inventoryService = new InventoryService with InventoryApi

  val checkoutService = new CheckOutService with CheckOutApi

}
