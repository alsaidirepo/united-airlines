package com.united.steps.sanity_test_steps;

import com.united.sections.Header_Section;
import com.united.utilis.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ChangeLanguage_step {
    @Given("user click on change language link")
    public void userClickOnChangeLanguageLink() {
        Header_Section header_section = new Header_Section();
        header_section.getLanguageSelection_element().click();
    }

    @Then("click on select language dropdown")
    public void clickOnSelectLanguageDropdown() throws InterruptedException {
        Header_Section header_section = new Header_Section();
        header_section.getSelectLanguage_dropdown().click();
    }

    @And("user selects a language")
    public void userSelectsALanguage() throws InterruptedException {
        Header_Section header_section = new Header_Section();
        header_section.getEspanolLanguage_selection().click();
        Common.waitUntil(header_section.getChangeLanguage_button());
    }

    @Then("user clicks on change button")
    public void userClicksOnChangeButton() {
        Header_Section header_section = new Header_Section();
        header_section.getChangeLanguage_button().click();
        Common.waitUntil(header_section.getEspanolLanguage_verification());
    }

    @Then("verify language is changed")
    public void verifyLanguageIsChanged() throws InterruptedException {
        Header_Section header_section = new Header_Section();
        String text = header_section.getEspanolLanguage_verification().getText();
        Assert.assertTrue(text.contains("Español"));
    }
}
