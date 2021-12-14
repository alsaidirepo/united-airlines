package com.united.steps.regression_test_steps;

import com.united.modals.Booking_Modal;
import com.united.pages.BookFlight_page;
import com.united.utilis.Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class BookFlight_Step {
    @Given("verify only one user is traveling")
    public void verifyOnlyOneUserIsTraveling() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
        Thread.sleep(2000);
        String travelerCount = booking_modal.getTravelers_element().getText();
        Assert.assertEquals(travelerCount, "1 Adult");
    }

    @Then("click on travel with pet link")
    public void clickOnTravelWithPetLink() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getTravelers_element().click();
        BookFlight_page bookFlight_page = new BookFlight_page();
        bookFlight_page.getTravelWithPet_link().click();
        Thread.sleep(2000);
    }

    @Then("verify only one pet is allowed")
    public void verifyOnlyOnePetIsAllowed() throws InterruptedException {
        BookFlight_page bookFlight_page = new BookFlight_page();
        Select select = new Select(bookFlight_page.getPetCabin_element());
        select.selectByValue("1");
        Thread.sleep(2000);
        String text = select.getFirstSelectedOption().getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("1"));
    }

    @Given("user clicks on advance search link")
    public void userClicksOnAdvanceSearchLink() {
        BookFlight_page bookFlight_page = new BookFlight_page();
        bookFlight_page.getAdvancedSearch_link().click();
        Common.waitUntil(bookFlight_page.getAdvancedSearch_fields());
    }

    @Then("verify advance search fields are displayed")
    public void verifyAdvanceSearchFieldsAreDisplayed() {
        BookFlight_page bookFlight_page = new BookFlight_page();
        boolean displayed = bookFlight_page.getAdvancedSearch_fields().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Given("user clicks on flexible dates option")
    public void userClicksOnFlexibleDatesOption() {
        BookFlight_page bookFlight_page = new BookFlight_page();
        bookFlight_page.getFlexibleDates_element().click();
        Common.waitUntil(bookFlight_page.getFlexMonth_dropdown());
    }

    @Then("verify month dropdown is displayed")
    public void verifyMonthDropdownIsDisplayed() {
        BookFlight_page bookFlight_page = new BookFlight_page();
        boolean displayed = bookFlight_page.getFlexMonth_dropdown().isDisplayed();
        Assert.assertTrue(displayed);
    }
}
