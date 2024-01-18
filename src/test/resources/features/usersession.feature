Feature: user session

  Background: user login and logout
    Given user login with valid credential
    When user click toggle button
    Then user click sign out

  Scenario: user access course without sign in
    Given user in main page
    When user click course
    And user click get started course
    Then user redirect to signup page

