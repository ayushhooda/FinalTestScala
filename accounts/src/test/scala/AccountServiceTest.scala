import accountServices.{AccountService, User}
import org.scalatest.FunSuite

class AccountServiceTest extends FunSuite {

  val obj =  new AccountService
  test("Method should return Updated Map by adding a User Type") {
    assert {
      obj.addNewUser(Map(),
        User("Ayush", "Hooda", "ayushhooda", "Ayush99", "9971870869"), 1) ==
        Map(1 -> User("Ayush", "Hooda", "ayushhooda", "Ayush99", "9971870869"))
    }
  }

  test("Method should return if User is valid") {
    assert {
      obj.authenticate(Map(1 -> User("Ayush", "Hooda", "ayushhooda", "Ayush99", "9971870869")),
        "ayushhooda", "Ayush99", 1)
    }
  }

}
