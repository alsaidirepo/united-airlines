package com.united.steps.smoke_test_steps;

import com.united.modals.Booking_Modal;
import com.united.utilis.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Flights_Step {
    @Given("user chooses round trip flight")
    public void userChoosesRoundTripFlight() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getRoundTrip_radioButton().click();
    }


    @And("clicks on find flights button")
    public void clicksOnFindFlightsButton() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getFindFlights_button().click();
        Common.waitUntil(booking_modal.getFlightResults_element());
    }
    @Then("user chooses flight destination")
    public void userChoosesToFlightDestination() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getToDestination_textArea().sendKeys("Los Angeles, CA, US (LAX)");
    }

    @Then("verify flight results are displayed")
    public void verifyFlightResultsAreDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        boolean displayed = booking_modal.getFlightResults_element().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Given("user chooses one way flight")
    public void userChoosesOneWayFlight() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getOneWay_radioButton().click();
    }

    @And("chooses flight departure")
    public void choosesFlightDeparture() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getDepartDate_element().click();
        booking_modal.getLeftArrow_button().click();
        booking_modal.getDepartDate_selection().click();
    }

    @Then("chooses Feb 15th as flight date")
    public void choosesFebAsFlightDate() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getDepartDate_element().click();
        booking_modal.getClearFlightDate_button().click();
        booking_modal.getDepartDate_element().click();
        booking_modal.getRightArrow_button().click();
        booking_modal.getFlight_departureDate().click();
        booking_modal.getFlight_returnDate().click();
    }

    @And("adds two adults and one infant to ticket")
    public void addsTwoAdultsAndOneInfantToTicket() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getTravelers_element().click();
        booking_modal.getTraveler_plusButton().click();
        booking_modal.getRoundTrip_radioButton().click();
    }

    @Then("verify only departing date is displayed")
    public void verifyOnlyDepartingDateIsDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        boolean displayed = booking_modal.getDepartDates_element().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Then("user increments traveler count")
    public void userIncrementsTravelerCount() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getTravelers_element().click();
        Common.waitUntil(booking_modal.getTraveler_plusButton());
        WebElement traveler_plusButton = booking_modal.getTraveler_plusButton();
        for(int i = 0;i < 8; i++){
            traveler_plusButton.click();
        }
    }

    @Then("verify traveler count is correctly")
    public void verifyTravelerCountIsCorrectly() {
        Booking_Modal booking_modal = new Booking_Modal();
        String text = booking_modal.getTravelers_element().getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("9"));
    }

    @Then("clicks on every passenger type")
    public void clicksOnEveryPassengerType() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getTravelers_element().click();
        Common.waitUntil(booking_modal.getTraveler_plusButton());
       booking_modal.getSenior_plusButton().click();
       booking_modal.getInfant_plusButton().click();
       booking_modal.getInfantUnderTwo_plusButton().click();
       booking_modal.getChild_plusButton().click();
       booking_modal.getChildTwo_plusButton().click();
       booking_modal.getChildThree_plusButton().click();
       booking_modal.getChildFour_plusButton().click();
       Common.waitUntil(booking_modal.getTravelers_element());

    }

    @Then("verify correct number of travelers displayed")
    public void verifyCorrectNumberOfTravelersDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        String text = booking_modal.getTravelers_element().getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("8"));
    }

    @Then("clicks on switch icon")
    public void clicksOnSwitchIcon() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getSwitchFlight_icon().click();
        Common.waitUntil(booking_modal.getSwitchFlight_icon());
    }

    @Then("verify fields are switched correctly")
    public void verifyFieldsAreSwitchedCorrectly()  {
        Booking_Modal booking_modal = new Booking_Modal();
        Common.waitUntil(booking_modal.getToDestination_textArea());
        String text = booking_modal.getToDestination_textArea().getAttribute("value");
        System.out.println(text);
        Assert.assertTrue(text.contains("Washington IAD"));
    }
}
