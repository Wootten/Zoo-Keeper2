Feature: Cat Swims Faster
  The Cat wants to swim faster

  Scenario: Cat is not at max speed
    Given speed is less than or equal to 60
    When I ask to swim faster
    Then I should "Speed Up"

  Scenario: Cat is at max speed
    Given speed is equal to or greater than 70
    When I ask to swim faster
    Then I should "Not Speed Up"