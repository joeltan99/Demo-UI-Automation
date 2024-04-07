Feature: Download All Submissions (with Status)

  Background:
    Given user is on moodle login page
    When user enters valid username using "<username>"
    And user enters valid password using "<password>"
    And user clicks on login button
    Then user should enter the homepage

  @Positive @e2e @Test
  Scenario: User downloads all submissions
    When user clicks on csd-1240-e
    When user clicks on HW 4 - E
    When user clicks on View all submissions
    Then user downloads all homework submissions
