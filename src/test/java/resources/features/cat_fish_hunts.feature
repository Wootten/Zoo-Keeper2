Feature: Cat Fish hunts
  The Cat Fish wants to hunt

  Scenario: Cat Fish is hungry
    Given hunger is greater than 50
    When I ask to hunt
    Then I should be told "Yes"

  Scenario: Cat Fish is not hungry
    Given hunger is less than 20
    When I ask to hunt
    Then I should be told "No"