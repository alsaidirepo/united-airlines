package com.united.steps.regression_test_steps;

import com.united.modals.Booking_Modal;
import com.united.utilis.Common;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class BookHotel_Step {
    @Given("user clicks on book hotel tab")
    public void userClicksOnBookHotelTab() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getBookHotel_tab().click();
        Thread.sleep(1000);

    }

    @Then("verify hotel input fields are displayed")
    public void verifyHotelInputFieldsAreDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        int size = booking_modal.getHotelInput_fields().size();
        Assert.assertEquals(size,5);
    }
    @And("verify hotel buttons are also displayed")
    public void verifyHotelButtonsAreAlsoDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        int size = booking_modal.getHotel_Buttons().size();
        Assert.assertEquals(size, 3);

    }

    @Then("verify only one room and one traveler displayed")
    public void verifyOnlyOneRoomAndOneTravelerDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        String roomNum = booking_modal.getNumOfRooms_element().getAttribute("aria-label");
        String travelerNum = booking_modal.getNumOfTravelers_hotelElement().getAttribute("value");
        Assert.assertTrue(roomNum.contains("1"));
        Assert.assertTrue(travelerNum.contains("1"));
    }

    @Then("select eight adults and eight children travelers")
    public void selectEightAdultsAndEightChildrenTravelers() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getNumOfTravelers_hotelElement().click();
        for(int i = 0; i <9; i++){
            booking_modal.getAdultHotel_plusBtn().click();
        }
        Thread.sleep(1000);
        for(int i = 0; i <9; i++){
            booking_modal.getChildHotel_plusBtn().click();
        }

    }

    @Then("verify correct number of travelers")
    public void verifyCorrectNumberOfTravelers() {
        Booking_Modal booking_modal = new Booking_Modal();
        String travelerNum = booking_modal.getNumOfTravelers_hotelElement().getAttribute("value");
        Assert.assertTrue(travelerNum.contains("16"));
    }

    @Then("verify maximum eight rooms is displayed")
    public void verifyMaximumEightRoomsIsDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        int size = booking_modal.getEightRoom_element().size();
        System.out.println(size);
        Assert.assertEquals(size, 8);
    }

    @Given("user selects two rooms")
    public void userSelectsTwoRooms() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getNumOfRooms_element().click();
        Thread.sleep(1000);
        booking_modal.getNumRoomTwo_element().click();
        Thread.sleep(1000);
    }

    @Then("verify number of travelers is removed")
    public void verifyNumberOfTravelersIsRemoved() {
        Booking_Modal booking_modal = new Booking_Modal();
        boolean displayed = booking_modal.getNumOfTravelers_hotelElement().isDisplayed();
        Assert.assertFalse(displayed);
    }
}
