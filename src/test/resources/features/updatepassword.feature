Feature: update password

  Background: user access my account page
    Given user login with valid credential
    When user click toggle button
    And user click my account
    Then user redirect to my account page

  Scenario: user update password
    Given user click password menu
    When user input new password
    And user re input new password
    And user input current password
    And user click update button
    Then popup success message

  Scenario: user updated password by blanking the current password
    Given user click password menu
    When user input new password
    And user re input new password
    And user click update button
    Then popup error password can't blank
