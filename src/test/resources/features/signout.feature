@Regression
Feature: SignOut

  Scenario: SignOut
    Given user login with valid credential
    When user redirect to dashboard
    And user click toggle button
    And user click sign out
    Then user redirect to main page


