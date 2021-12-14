package com.united.steps.smoke_test_steps;

import com.united.modals.Booking_Modal;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AppLoad_Step {

    @Given("user at homepage verify booking window tabs is displayed")
    public void userAtHomepageVerifyBookingWindowTabsIsDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        int size = booking_modal.getBooking_tabs().size();
        Assert.assertEquals(size,4);
    }
}
