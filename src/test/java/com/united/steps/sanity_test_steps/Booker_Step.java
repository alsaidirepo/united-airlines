package com.united.steps.sanity_test_steps;

import com.united.modals.Booking_Modal;
import com.united.utilis.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Booker_Step {

    @Given("user clicks book tab verify correct field displayed")
    public void userClicksBookTabVerifyCorrectFieldDisplayed() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
       booking_modal.getTravelers_element().click();
       Thread.sleep(1000);
        List<WebElement> bookTab_inputFields = booking_modal.getBookTab_inputFields();
        for(WebElement fields: bookTab_inputFields){
            boolean displayed = fields.isDisplayed();
            Assert.assertTrue(displayed);
        }
    }
    @Then("click on flight status tab")
    public void clickOnFlightStatusTab() throws InterruptedException {
        Thread.sleep(2000);
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getFlightStatus_tab().click();
    }

    @And("verify all fields are displayed")
    public void verifyAllFieldsAreDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        List<WebElement> statusTab_inputFields = booking_modal.getStatusTab_inputFields();
        for (WebElement fields : statusTab_inputFields){
            boolean displayed = fields.isDisplayed();
            Assert.assertTrue(displayed);
        }
    }
    @Then("click on check-in tab")
    public void clickOnCheckInTab() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getCheckIn_tab().click();
    }

    @And("verify all check-in fields displayed")
    public void verifyAllCheckInFieldsDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        List<WebElement> checkIn_inputFields = booking_modal.getCheckIn_inputFields();
        for (WebElement fields : checkIn_inputFields){
            boolean displayed = fields.isDisplayed();
            Assert.assertTrue(displayed);
        }
    }

    @Then("click on my trips tab")
    public void clickOnMyTripsTab() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getMyTrips_tab().click();
    }

    @And("verify all my trips fields displayed")
    public void verifyAllMyTripsFieldsDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        List<WebElement> myTrips_inputFields = booking_modal.getMyTrips_inputFields();
        for(WebElement fields : myTrips_inputFields){
            boolean displayed = fields.isDisplayed();
            Assert.assertTrue(displayed);
        }
    }
}
