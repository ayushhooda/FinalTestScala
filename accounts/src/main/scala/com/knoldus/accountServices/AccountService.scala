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
    userDb.get(userId) match {
      case value => if (value.get.username.equals(username) && value.get.password.equals(password)) true else false
    }
  }

  /**
    * @param userDb - User records
    */
  def viewAllUsers(userDb: Map[Int, User]): List[(Int, User)] = {
    userDb.toList
  }

}
