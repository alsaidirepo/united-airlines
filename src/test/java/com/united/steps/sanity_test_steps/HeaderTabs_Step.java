package com.united.steps.sanity_test_steps;

import com.united.sections.Header_Section;
import com.united.utilis.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HeaderTabs_Step {
    @Given("user clicks on book tab")
    public void userClicksOnBookTab() {
        Header_Section header_section = new Header_Section();
        header_section.getBook_tab().click();
        Common.waitUntil(header_section.getBook_panel());
    }

    @Then("verify correct panel is displayed")
    public void verifyCorrectPanelIsDisplayed() {
        Header_Section header_section = new Header_Section();
        boolean displayed = header_section.getBook_panel().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @And("user clicks on my trips tab")
    public void userClicksOnMyTripsTab() {
        Header_Section header_section = new Header_Section();
        header_section.getMyTrips_tab().click();
        Common.waitUntil(header_section.getMyTrips_panel());
    }

    @Then("verify my trips panel is displayed")
    public void verifyMyTripsPanelIsDisplayed() {
        Header_Section header_section = new Header_Section();
        boolean displayed = header_section.getMyTrips_panel().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @And("user clicks on travel info tab")
    public void userClicksOnTravelInfoTab() {
        Header_Section header_section = new Header_Section();
        header_section.getTravelInfo_tab().click();
        Common.waitUntil(header_section.getTravelInfo_panel());
    }

    @Then("verify travel info panel is displayed")
    public void verifyTravelInfoPanelIsDisplayed() {
        Header_Section header_section = new Header_Section();
        boolean displayed = header_section.getTravelInfo_panel().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @And("user clicks on mileage plus tab")
    public void userClicksOnMileagePlusTab() {
        Header_Section header_section = new Header_Section();
        header_section.getMileagePlus_tab().click();
        Common.waitUntil(header_section.getMileagePlus_panel());
    }
    @Then("verify mileage plus panel is displayed")
    public void verifyMileagePlusPanelIsDisplayed() {
        Header_Section header_section = new Header_Section();
        boolean displayed = header_section.getMileagePlus_panel().isDisplayed();
        Assert.assertTrue(displayed);
    }
    @And("user clicks on deals tab")
    public void userClicksOnDealsTab() {
        Header_Section header_section = new Header_Section();
        header_section.getDeals_tab().click();
        Common.waitUntil(header_section.getDeals_panel());
    }

    @Then("verify deals panel is displayed")
    public void verifyDealsPanelIsDisplayed() {
        Header_Section header_section = new Header_Section();
        boolean displayed = header_section.getDeals_panel().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @And("user clicks on help tab")
    public void userClicksOnHelpTab() {
        Header_Section header_section = new Header_Section();
        header_section.getHelp_tab().click();
        Common.waitUntil(header_section.getHelp_panel());
    }

    @Then("verify help panel is displayed")
    public void verifyHelpPanelIsDisplayed() {
        Header_Section header_section = new Header_Section();
        boolean displayed = header_section.getHelp_panel().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Given("advisory links are displayed with correct info")
    public void advisoryLinksAreDisplayedWithCorrectInfo() {
        Header_Section header_section = new Header_Section();
        List<WebElement> advisory_links = header_section.getAdvisory_links();
        for(WebElement link : advisory_links){
            String text = link.getText();
            System.out.println(text);
            Assert.assertFalse(text.isEmpty());
        }

    }
}
