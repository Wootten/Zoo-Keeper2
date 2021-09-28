Feature: Pigeon eats for energy
  The Pigeon wants to eat

  Scenario: Pigeon is full of energy and tries to eat worms
    Given Pigeon energy is 100
    When I ask to eat "worms"
    Then I cant "I'm full of energy"

  Scenario: Pigeon is full of energy and tries to eat seeds
    Given Pigeon energy is 100
    When I ask to eat "seeds"
    Then I cant "I'm full of energy"

  Scenario: Pigeon is low on energy and tries to eat worms
    Given Pigeon energy is 30
    When I ask to eat "worms"
    Then I eat and energy equals 40

  Scenario: Pigeon is low on energy and tries to eat seeds
    Given Pigeon energy is 30
    When I ask to eat "seeds"
    Then I eat and energy equals 35
