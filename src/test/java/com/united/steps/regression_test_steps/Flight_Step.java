package com.united.steps.regression_test_steps;

import com.united.modals.Booking_Modal;
import com.united.utilis.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Flight_Step {
    @Then("verify departing and return date fields are displayed")
    public void verifyDepartingAndReturnDateFieldsAreDisplayed(){
        Booking_Modal booking_modal = new Booking_Modal();
        boolean displayed = booking_modal.getDepartDates_element().isDisplayed();
        boolean displayed1 = booking_modal.getReturnDates_element().isDisplayed();
        Assert.assertTrue(displayed);
        Assert.assertTrue(displayed1);
    }

    @Given("verify from field should have correct placeholder")
    public void verifyFromFieldShouldHaveCorrectPlaceholder() {
    Booking_Modal booking_modal = new Booking_Modal();
        String placeholder = booking_modal.getFromDestination_textArea().getAttribute("placeholder");
        Assert.assertTrue(placeholder.contains("From*"));
    }

    @Then("verify going to filed should have correct placeholder")
    public void verifyGoingToFiledShouldHaveCorrectPlaceholder() {
        Booking_Modal booking_modal = new Booking_Modal();
        String placeholder = booking_modal.getToDestination_textArea().getAttribute("placeholder");
        Assert.assertTrue(placeholder.contains("To*"));
    }

    @Given("user click on from field and removes the destination")
    public void userClickOnFromFieldAndRemovesTheDestination() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getFromDestination_textArea().click();
        Common.waitUntil(booking_modal.getFromDestination_textArea());
        booking_modal.getRemoveFrom_button().click();

    }

    @Then("verify destination is removed")
    public void verifyDestinationIsRemoved() {
        Booking_Modal booking_modal = new Booking_Modal();
        String value = booking_modal.getFromDestination_textArea().getAttribute("value");
        Assert.assertTrue(value.isEmpty());
    }

    @Given("user click on going to filed and removes the destination")
    public void userClickOnGoingToFiledAndRemovesTheDestination() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getToDestination_textArea().click();
        booking_modal.getRemoveGoingTo_button().click();
    }

    @Then("verify going to destination is removed")
    public void verifyGoingToDestinationIsRemoved() {
        Booking_Modal booking_modal = new Booking_Modal();
        String value = booking_modal.getToDestination_textArea().getAttribute("value");
        Assert.assertTrue(value.isEmpty());
    }

    @Given("user clicks on business flight then verify selection")
    public void userClicksOnBusinessFlightThenVerifySelection() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getFlightType_element().click();
        Thread.sleep(2000);
        booking_modal.getBusinessFlight_element().click();
        String value = booking_modal.getFlightType_element().getAttribute("aria-label");
        Assert.assertTrue(value.contains("Business"));
    }

    @And("user click on premium then verify selection")
    public void userClickOnPremiumThenVerifySelection() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getFlightType_element().click();
        Thread.sleep(2000);
        booking_modal.getPremiumFlight_element().click();
        String value = booking_modal.getFlightType_element().getAttribute("aria-label");
        Assert.assertTrue(value.contains("Premium economy"));
    }

    @Then("user clicks on economy then verify selection")
    public void userClicksOnEconomyThenVerifySelection() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getFlightType_element().click();
        Thread.sleep(2000);
        booking_modal.getEconomyFlight_element().click();
        String value = booking_modal.getEconomyFlight_element().getAttribute("aria-label");
        Assert.assertTrue(value.contains("Economy"));
    }

    @Given("user clicks on traveler subtract button")
    public void userClicksOnTravelerSubtractButton() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getTravelers_element().click();
        WebElement traveler_subtractButton = booking_modal.getTraveler_subtractButton();
        for (int i = 0; i < 3; i++){
            traveler_subtractButton.click();
        }
    }

    @Then("verify one traveler is displayed")
    public void verifyOneTravelerIsDisplayed() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
        Thread.sleep(2000);
        String travelerCount = booking_modal.getTravelers_element().getText();
        System.out.println(travelerCount);
        Assert.assertEquals(travelerCount, "1 Adult");
    }
}
