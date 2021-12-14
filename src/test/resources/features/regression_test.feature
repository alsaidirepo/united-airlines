Feature: Regression Tests

  Scenario: round trip option should have departing and return date fields
    Given user chooses round trip flight
    Then verify departing and return date fields are displayed

  Scenario: Choosing one way flight option should only have departing date
    Given user chooses one way flight
    Then verify only departing date is displayed

  Scenario: User should be able to increment traveler count up to 9
    Given user chooses one way flight
    Then user increments traveler count
    Then verify traveler count is correctly

  Scenario: User can select one traveler from every single passenger type
    Given user chooses round trip flight
    Then clicks on every passenger type
    Then verify correct number of travelers displayed

  Scenario: Leaving from and going to fields should switch when click on switch icon
    Given user chooses round trip flight
    Then clicks on switch icon
    Then verify fields are switched correctly

  Scenario: Leaving from and going to fields should have correct placeholders
    Given verify from field should have correct placeholder
    Then verify going to filed should have correct placeholder

  Scenario: User should be able to remove leaving from location value
    Given user click on from field and removes the destination
    Then verify destination is removed

  Scenario: User should be able to remove going to location value
    Given user chooses flight destination
    Given user click on going to filed and removes the destination
    Then verify going to destination is removed

  Scenario: User can select different flight classes such as Economy, Premium economy, Business or First
    Given user clicks on business flight then verify selection
    And user click on premium then verify selection
    Then user clicks on economy then verify selection

  Scenario: Minimum one traveler should be selected
    Given user clicks on traveler subtract button
    Then verify one traveler is displayed

  Scenario: User can only travel with one pet
    Given verify only one user is traveling
    Then click on travel with pet link
    Then verify only one pet is allowed

  Scenario: Advance search should open a separate page with more advanced search fields
    Given user clicks on advance search link
    Then verify advance search fields are displayed

  Scenario: Checking flexible dates option should change the Dates field to month dropdown only
    Given user clicks on flexible dates option
    Then verify month dropdown is displayed

  Scenario: Panel should have following fields: Going to, check-in, check-out, number of rooms,
  number of travelers,book with miles and find hotels button
    Given user clicks on book hotel tab
    Then verify hotel input fields are displayed
    And verify hotel buttons are also displayed

  Scenario: One room and 1 travelers should be selected by default
    Given user clicks on book hotel tab
    Then verify only one room and one traveler displayed

  Scenario: User can select maximum 8 adult and 8 children travelers, 16 in total
    Given user clicks on book hotel tab
    Then select eight adults and eight children travelers
    Then verify correct number of travelers

  Scenario: User should be able to maximum 8 rooms
    Given user clicks on book hotel tab
    Then verify maximum eight rooms is displayed

  Scenario: Number of travelers field should disappear when number of rooms is more than one
    Given user clicks on book hotel tab
    Given user selects two rooms
    Then verify number of travelers is removed

  Scenario: Cars tab should have all correct fields
    Given user clicks on car tab
    Then verify all car tabs fields are displayed

  Scenario: Drop off location should disappear if return car to same location checkbox is checked
    Given user clicks on car tab
    Then user click on return car check box
    Then verify drop off location is removed

  Scenario:Age field should disappear if primary driver is 25 or older checkbox is checked
    Given user clicks on car tab
    Then user clicks on age over check box
    Then verify age field is removed

  Scenario:  Finding a car after filling up the form should navigate to a separate tab
    Given user clicks on car tab
    Then user fills out the car form
    And user clicks on find car button
    Then verify car result is displayed

  Scenario: User should see vacation search result with all fields
    Given user clicks on packages tab
    Then verify all fields of packages tab are displayed

  Scenario: Vacation form should have only up to 4 rooms
    Given user clicks on packages tab
    Then verify only up to four rooms are displayed

  Scenario: Rooms container should say “rooms” if room count is bigger than one
    Given user clicks on packages tab
    Then selects more that one room
    Then verify container should say rooms

  @demo
  Scenario: Rooms option dropdown should disappear when Flight and car option is selected
    Given user clicks on packages tab
    And user clicks on Flight and car option
    Then verify rooms option is removed

  Scenario: Clicking cruise link should navigate to United Cruises page
    Given user clicks on cruise link
    Then verify it navigates to new page

  Scenario: User searches flight status between from and to destinations
    Given  user clicks on flight status tab
    Then user search for flight
    Then verify flight status is displayed

  Scenario: Flight number field should not accept other than numbers
    Given user clicks on flight status tab
    Then verify number field should not accept other than number

  Scenario: Invalid number error message should be displayed when a wrong flight number is entered
    Given user clicks on flight status tab
    Then verify error message is displayed when wrong flight num in entered

  Scenario: Empty flight check-in form should show error messages when searched without filling up
    Given user clicks on check in tab
    Then verify get error when user does not fill out form

  Scenario: There should be a check-in details link and navigates to correct page
    Given user clicks on check in tab
    Then verify check-in details link takes user to different page

  Scenario: There should be a check-in with MilesPlus link and navigates to correct page
    Given user clicks on check in tab
    Then verify check-in MilesPlus link takes user to different page

  Scenario: There should be a link to find United Travel Credits page
    Given user clicks on my trips book tab
    Then verify travel credits page is displayed

  Scenario: Empty My Trips form should show error messages when searched without filling up
    Given user clicks on my trips book tab
    Then verify error message is displayed when form is not filled up

  Scenario: There should be a link to find my trips sign in page
    Given user clicks on my trips book tab
    Then verify there is a link to find my trips sign in page