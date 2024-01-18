@Regression
Feature: SignIn

  @Positive
  Scenario: SignIn with valid data
    Given user access signIn page
    When user input registered email
    And user input registered password
    And user click remember me checkbox
    And user click sign in button
    Then user redirect to dashboard

  @Negative
  Scenario: SignIn with unregister password
    Given user access signIn page
    When user input registered email
    And user input unregistered password
    And user click remember me checkbox
    And user click sign in button
    Then popup error message