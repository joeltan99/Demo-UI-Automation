Feature: Login Page Functionalities

  Background:
    Given user is on moodle login page

  @Positive @Regression @Test
  Scenario: User login to moodle successful
    When user enters valid username using "<username>"
    And user enters valid password using "<password>"
    And user clicks on login button
    Then user should enter the homepage

  @Negative @Regression @Test
  Scenario Outline: User login to moodle unsuccessful
    When user enters invalid username using "<username>"
    And user enters invalid password using "<password>"
    And user clicks on login button
    Then error message should be displayed

    Examples:
    | username  | password  |
    | unknown   | unknown   |
    | User123   | Pass123   |
