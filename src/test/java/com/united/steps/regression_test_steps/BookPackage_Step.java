package com.united.steps.regression_test_steps;

import com.united.modals.Booking_Modal;
import com.united.utilis.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.united.base.Hooks.driver;

public class BookPackage_Step {
    @Given("user clicks on packages tab")
    public void userClicksOnPackagesTab() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getBookPackage_tab().click();
        Common.waitUntil(booking_modal.getPackageTraveler_element());
    }

    @Then("verify all fields of packages tab are displayed")
    public void verifyAllFieldsOfPackagesTabAreDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        int size = booking_modal.getPackagesTab_fields().size();
        Assert.assertEquals(size,15);
    }

    @Then("verify only up to four rooms are displayed")
    public void verifyOnlyUpToFourRoomsAreDisplayed() {
        Booking_Modal booking_modal = new Booking_Modal();
        int size = booking_modal.getNumOfRoom_element().size();
        Assert.assertEquals(size,4);

    }

    @Then("selects more that one room")
    public void selectsMoreThatOneRoom() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getRoomCabinet_element().click();
        List<WebElement> numOfRoom_element = booking_modal.getNumOfRoom_element();

            numOfRoom_element.get(2).click();

    }

    @Then("verify container should say rooms")
    public void verifyContainerShouldSay() {
        Booking_Modal booking_modal = new Booking_Modal();
        String text = booking_modal.getRoomCabinet_element().getText();
        Assert.assertTrue(text.contains("rooms"));

    }

    @And("user clicks on Flight and car option")
    public void userClicksOnFlightAndCarOption() throws InterruptedException {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getFlightAndCar_radioBtn().click();
       Thread.sleep(2000);

    }

    @Then("verify rooms option is removed")
    public void verifyRoomsOptionIsRemoved() {
        Booking_Modal booking_modal = new Booking_Modal();
        int size = booking_modal.getRoomListCabinet_element().size();
        Assert.assertEquals(size, 1);
    }

    @Given("user clicks on cruise link")
    public void userClicksOnCruiseLink() {
        Booking_Modal booking_modal = new Booking_Modal();
        booking_modal.getCruise_link().click();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
    }

    @Then("verify it navigates to new page")
    public void verifyItNavigatesToNewPage() throws InterruptedException {
        Thread.sleep(1500);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertTrue(currentUrl.contains("https://cruises.united.com"));
    }
}
