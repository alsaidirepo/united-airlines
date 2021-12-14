package com.united.steps.sanity_test_steps;

import com.united.sections.Footer_Section;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class FooterLink_Step {
    @Given("verify footer links are not broken")
    public void verifyFooterLinksAreNotBroken() {
        Footer_Section footer_section = new Footer_Section();
        List<WebElement> footer_links = footer_section.getFooter_links();
        for (WebElement links : footer_links){
            String href = links.getAttribute("href");
            Assert.assertFalse(href.isEmpty());
        }
    }
}
