Feature: User Validation

  @user_db
  Scenario: Validate user by login/username
    Given user connect to the application database
    When get all usernames as a list
    Then verify usernameList contains "login"
    And close the connection
