Feature: show how works scenario outline

  Scenario Outline: User Log in
    Given User Opens website
    And User clicks on LoginButton
    And user inserts "<email>" email
    And user inserts "<password>" password

    Examples:
      | email               | password        |
      | coffeacc1@gmail.com | AmazingPassword |
      | coffeacc2@gmail.com | SuperPassword   |