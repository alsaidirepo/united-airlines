Feature: Smoke Tests

  Scenario: app loads successfully
    Given user at homepage verify booking window tabs is displayed

  @Test
  Scenario: available flights are displayed when user searches for round trip
    Given user chooses round trip flight
    Then user chooses flight destination
    And clicks on find flights button
    Then verify flight results are displayed

  Scenario: User checks out one way flight ticket
    Given user chooses one way flight
    Then user chooses flight destination
    And chooses flight departure
    And clicks on find flights button
    Then verify flight results are displayed

  Scenario: User checks out 3 round trip flight tickets
    Given user chooses round trip flight
    Then user chooses flight destination
    Then chooses Feb 15th as flight date
    And adds two adults and one infant to ticket
    And clicks on find flights button
    Then verify flight results are displayed

