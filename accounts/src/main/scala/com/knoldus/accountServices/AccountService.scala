package accountServices

class AccountService extends AccountApi{

  /**
    * @param userDb - User records
    * @param userDetails - New User Details
    * @param userId - autoincremented id for New User
    * @return - Updated User records
    */
  def addNewUser(userDb: Map[Int, User], userDetails: User, userId: Int): Map[Int, User] = {
    userDb + (userId -> userDetails)
  }

  /**
    * @param userDb - User records
    * @param username - username of user
    * @param password - password of user
    * @param userId - userId of user
    * @return - true if valid user else false
    */
  def authenticate(userDb: Map[Int, User], username: String, password: String, userId: Int): Boolean = {
    Option(userDb.get(userId)) match {
      case Some(value) => if (value.get.username == username && value.get.password == password) true else false
      case None => false
    }
  }

  /**
    * @param userDb - User records
    */
  def viewAllUsers(userDb: Map[Int, User]): Unit = {
    userDb.foreach {
      case (id, user) => print(s"\n$id \t ${user.firstName} \t ${user.lastName} \t ${user.phone}")
    }
  }

}
