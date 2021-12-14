package com.united.sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Footer_Section {

    @FindBy(css = "#footerPanel0-panel a")
    private List<WebElement> footer_links;

    public Footer_Section(){
        PageFactory.initElements(driver,this);
    }

    public List<WebElement> getFooter_links() {
        return footer_links;
    }
}
