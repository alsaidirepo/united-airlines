Feature: Sanity Tests

  Scenario: Home page booker container tabs should display correct fields
    Given  user clicks book tab verify correct field displayed
    Then  click on flight status tab
    And verify all fields are displayed
    Then click on check-in tab
    And verify all check-in fields displayed
    Then click on my trips tab
    And verify all my trips fields displayed

  Scenario: User should be able to change language
    Given user click on change language link
    Then click on select language dropdown
    And user selects a language
    Then user clicks on change button
    Then verify language is changed

  Scenario: Top header tabs should show correct panels when clicked
    Given user clicks on book tab
    Then verify correct panel is displayed
    And user clicks on my trips tab
    Then verify my trips panel is displayed
    And user clicks on travel info tab
    Then verify travel info panel is displayed
    And user clicks on mileage plus tab
    Then verify mileage plus panel is displayed
    And user clicks on deals tab
    Then verify deals panel is displayed
    And user clicks on help tab
    Then verify help panel is displayed

  Scenario: Advisory top section should display info with links
    Given advisory links are displayed with correct info

  Scenario: Footer links should not be broken
    Given verify footer links are not broken

