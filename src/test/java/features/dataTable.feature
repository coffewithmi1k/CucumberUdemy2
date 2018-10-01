Feature: show how data table is working
  Scenario: Try to login with different emails
    Given User Opens website
    And User clicks on LoginButton
    And user enters different emails
    |coffeacc1@gmail.com|coffeacc2@gmail.com|
    |coffeacc3@gmail.com|coffeacc4@gmail.com|
