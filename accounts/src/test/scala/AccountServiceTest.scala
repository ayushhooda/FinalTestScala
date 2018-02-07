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

  test("Method should return true if User is valid") {
    assert {
      obj.authenticate(Map(1 -> User("Ayush", "Hooda", "ayushhooda", "Ayush99", "9971870869")),
        "ayushhooda", "Ayush99", 1)
    }
  }

  test("Method should return false if User entered Invalid Credentials") {
    assert {
      !obj.authenticate(Map(1 -> User("Ayush", "Hooda", "ayushhooda", "Ayush99", "9971870869")),
        "ayushhooda", "Ayush", 1)
    }
  }

  test("Method should return list of All users") {
    assert {
      obj.viewAllUsers(Map(1 -> User("Ayush", "Hooda", "ayushhooda", "Ayush99", "9971870869"))) ==
      List((1, User("Ayush", "Hooda", "ayushhooda", "Ayush99", "9971870869")))
    }
  }

}
