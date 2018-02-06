package accountServices

trait AccountApi {

  def addNewUser(userDb: Map[Int, User], userDetails: User, userId: Int): Map[Int, User]

  def authenticate(userDb: Map[Int, User], username: String, password: String, userId: Int): Boolean

  def viewAllUsers(userDb: Map[Int, User]): Unit

}
