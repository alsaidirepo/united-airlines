package com.united.steps.regression_test_steps;

import com.united.modals.Booking_Modal;
import com.united.utilis.Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.remote.Command;
import org.testng.Assert;

public class FlightStatus_Step {
    @Given("user clicks on flight status tab")
    public void userClicksOnFlightStatusTab() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getStatus_tab().click();
        Common.waitUntil(booking_modal.getStatusSearch_element());
    }

    @Then("user search for flight")
    public void userSearchForFlight() {
        Booking_Modal booking_modal =  new Booking_Modal();
        booking_modal.getStatusToFlight_element().click();
        booking_modal.getStatusToFlight_element().sendKeys("Los Angeles, CA, US(LAX)");
        booking_modal.getFlightNumber_element().sendKeys("3432");
        booking_modal.getStatusSearch_element().click();
    }

    @Then("verify flight status is displayed")
    public void verifyFlightStatusIsDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        Common.waitUntil(booking_modal.getFlightStatus_element());
        boolean displayed = booking_modal.getFlightStatus_element().isDisplayed();
        Assert.assertTrue(displayed);

    }

    @Then("verify number field should not accept other than number")
    public void verifyNumberFieldShouldNotAcceptOtherThanNumber() {
        Booking_Modal booking_modal =  new Booking_Modal();
        booking_modal.getStatusToFlight_element().click();
        booking_modal.getStatusToFlight_element().sendKeys("Los Angeles, CA, US(LAX)");
        booking_modal.getFlightNumber_element().sendKeys("bsfd");
        booking_modal.getStatusSearch_element().click();
        Common.waitUntil(booking_modal.getInvalidNumError_element());
        boolean displayed = booking_modal.getInvalidNumError_element().isDisplayed();
        Assert.assertTrue(displayed);

    }

    @Then("verify error message is displayed when wrong flight num in entered")
    public void verifyErrorMessageIsDisplayedWhenWrongFlightNumInEntered() {
        Booking_Modal booking_modal =  new Booking_Modal();
        booking_modal.getStatusToFlight_element().click();
        booking_modal.getStatusToFlight_element().sendKeys("Los Angeles, CA, US(LAX)");
        booking_modal.getFlightNumber_element().sendKeys("bbdf");
        booking_modal.getStatusSearch_element().click();
        Common.waitUntil(booking_modal.getInvalidNumError_element());
        boolean displayed = booking_modal.getInvalidNumError_element().isDisplayed();
        Assert.assertTrue(displayed);
    }
}
