Feature: check My Store website

  Scenario: Check website is ON
    Given User Opens website
    And verifies website is opened

    Scenario: Check Login
      Given User Opens website
      And User clicks on LoginButton
      And user fills "coffeacc2@gmail.com" as email
      And user fills "qwe1156q" as password
      And user clicks Log In button
      Then verifies user is logged In successfully