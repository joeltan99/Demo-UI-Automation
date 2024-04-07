Feature: Login Page Functionalities

  Background:
    Given user is on moodle login page

  @Positive @Regression
  Scenario Outline: User login to moodle successful
    When user enters username using "<username>"
    And user enters password using "<password>"
    And user clicks on login button
    Then user should enter the homepage
    And user exits the application

  Examples:
    | username       | password     |
    | t.zhuoyaojoel  | Joeltanzy99  |

  @Negative @Regression
  Scenario Outline: User login to moodle unsuccessful
    When user enters username using "<username>"
    And user enters password using "<password>"
    And user clicks on login button
    Then error message should be displayed
    And user exits the application

    Examples:
    | username  | password  |
    | unknown   | unknown   |
    | User123   | Pass123   |
