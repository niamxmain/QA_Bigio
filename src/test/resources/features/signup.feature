Feature: SignUp

  @Positive
  Scenario: SignUp with valid data
    Given user access signUp page
    When user input firstname
    And user input lastname
    And user input email
    And user input password
    And user click signUp btn
    Then user redirect to dashboard

  @Negative
  Scenario: SignUp with invalid email
    Given user access signUp page
    When user input firstname
    And user input lastname
    And user input invalid email
    And user input password
    And user click term checkbox
    And user click signUp btn
    Then popup error invalid email