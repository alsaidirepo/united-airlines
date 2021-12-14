package com.united.steps.regression_test_steps;

import com.united.modals.Booking_Modal;
import com.united.utilis.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;

import static com.united.base.Hooks.driver;

public class BookCar_Step {
    @Given("user clicks on car tab")
    public void userClicksOnCarTab() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getBookCar_tab().click();
        Thread.sleep(1500);
    }

    @Then("verify all car tabs fields are displayed")
    public void verifyAllCarTabsFieldsAreDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        int size = booking_modal.getBookCar_fields().size();
        int size1 = booking_modal.getBookCar_buttons().size();
        Assert.assertEquals(size,6);
        Assert.assertEquals(size1,4);

    }

    @Then("user click on return car check box")
    public void userClickOnReturnCarCheckBox()  {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getReturnCar_element().click();
        Common.waitUntil(booking_modal.getReturnCar_element());

    }

    @Then("verify drop off location is removed")
    public void verifyDropOffLocationIsRemoved()  {
       Booking_Modal booking_modal = new Booking_Modal();
        boolean displayed = booking_modal.getCarDropOff_element().isDisplayed();
        Assert.assertTrue(displayed);
        booking_modal.getReturnCar_element().click();
        Common.waitUntil(booking_modal.getReturnCar_element());
    }

    @Then("user clicks on age over check box")
    public void userClicksOnAgeOverCheckBox() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getAgeOver25_element().click();
        Common.waitUntil(booking_modal.getAgeOver25_element());

    }

    @Then("verify age field is removed")
    public void verifyAgeFieldIsRemoved() {
        Booking_Modal booking_modal = new Booking_Modal();
        boolean displayed = booking_modal.getCarDriverAge_element().isDisplayed();
        Assert.assertTrue(displayed);
        booking_modal.getAgeOver25_element().click();
        Common.waitUntil(booking_modal.getAgeOver25_element());

    }

    @Then("user fills out the car form")
    public void userFillsOutTheCarForm() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getCarPickUp_element().click();
        booking_modal.getCarPickUp_element().sendKeys("Washington Dulles Airport, US (IAD)");
        Common.waitUntil(booking_modal.getWashingtonPickUp_element());
        booking_modal.getWashingtonPickUp_element().click();
        Common.waitUntil(booking_modal.getCarPickUp_element());
        booking_modal.getCarPickUpDate_element().click();
        Common.waitUntil(booking_modal.getPickUpCarDate_element());
        booking_modal.getPickUpCarDate_element().click();
        Common.waitUntil(booking_modal.getDropOffCarDate_element());
        booking_modal.getDropOffCarDate_element().click();

    }

    @And("user clicks on find car button")
    public void userClicksOnFindCarButton() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getFindCar_button().click();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        Common.waitUntil(booking_modal.getCarResult_element());
    }

    @Then("verify car result is displayed")
    public void verifyCarResultIsDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        boolean displayed = booking_modal.getCarResult_element().isDisplayed();
        Assert.assertTrue(displayed);
    }
}
