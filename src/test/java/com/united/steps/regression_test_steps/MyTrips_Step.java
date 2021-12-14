package com.united.steps.regression_test_steps;

import com.united.modals.Booking_Modal;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MyTrips_Step {
    @Then("verify travel credits page is displayed")
    public void verifyTravelCreditsPageIsDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        boolean displayed = booking_modal.getTravelCredits_link().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Given("user clicks on my trips book tab")
    public void userClicksOnMyTripsBookTab() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getTrips_tab().click();
    }

    @Then("verify error message is displayed when form is not filled up")
    public void verifyErrorMessageIsDisplayedWhenFormIsNotFilledUp() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getMyTripsSearch_Btn().click();
        boolean displayed = booking_modal.getMyTripsError_element().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Then("verify there is a link to find my trips sign in page")
    public void verifyThereIsALinkToFindMyTripsSignInPage() {
        Booking_Modal booking_modal = new Booking_Modal();
        boolean displayed = booking_modal.getMyTripsSignIn_link().isDisplayed();
        Assert.assertTrue(displayed);

    }
}
