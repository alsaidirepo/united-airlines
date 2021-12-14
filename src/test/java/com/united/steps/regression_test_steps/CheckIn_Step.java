package com.united.steps.regression_test_steps;

import com.united.modals.Booking_Modal;
import com.united.utilis.Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.CommandLineArgs;

import static com.united.base.Hooks.driver;

public class CheckIn_Step {
    @Given("user clicks on check in tab")
    public void userClicksOnCheckInTab() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getCheckInTab_element().click();
        Common.waitUntil(booking_modal.getCheckInBtn_element());
        booking_modal.getCheckInBtn_element().click();
    }

    @Then("verify get error when user does not fill out form")
    public void verifyGetErrorWhenUserDoesNotFillOutForm() {
        Booking_Modal booking_modal = new Booking_Modal();
        boolean displayed = booking_modal.getCheckInErrorMessage_element().isDisplayed();
        Assert.assertTrue(displayed);

    }

    @Then("verify check-in details link takes user to different page")
    public void verifyCheckInDetailsLinkTakesUserToDifferentPage() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
        Thread.sleep(1500);
        booking_modal.getCheckInDetails_link().click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.united.com"));
    }

    @Then("verify check-in MilesPlus link takes user to different page")
    public void verifyCheckInMilesPlusLinkTakesUserToDifferentPage() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getCheckInMilesPlus_link().click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.united.com"));
    }
}
