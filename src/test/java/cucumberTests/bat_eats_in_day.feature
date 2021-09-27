Feature: Bat eats In Day
  The Bat wants to eat

  Scenario: It is night time, so bat eats
    Given It is night time is "true"
    When I ask to eat
    Then I will "Eat"

  Scenario: It is day time, so bat doesn't eat
    Given It's night time is "false"
    When I ask to eat
    Then I will "Not Eat"