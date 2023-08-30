Feature: Feedback Functionality Verification

  Scenario: User submits feedback
    Given the user navigates to JavaTpoint.com
    When the user clicks on Feedback, then the Feedback page opens
    And the user submits feedback message
    Then feedback should be received on the admin page
    And admin can reply to the user
