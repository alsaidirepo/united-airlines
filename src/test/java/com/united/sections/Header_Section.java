package com.united.sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Header_Section {
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[5]/header/div/div/div[1]/div/div/div/div[2]/nav/ul/li[1]/div/div/button")
    private WebElement languageSelection_element;
    @FindBy(css = "#localization-language-selector")
    private WebElement selectLanguage_dropdown;
    @FindBy(css = "[aria-label=\"Español\"]")
    private WebElement espanolLanguage_selection;
    @FindBy(xpath = "//button[text()='Cambiar']")
    private WebElement changeLanguage_button;
    @FindBy(xpath = "//*[@id=\"headerNav0\"]/span")
    private WebElement book_tab;
    @FindBy(css = "#headerNav0-panel")
    private WebElement book_panel;
    @FindBy(css = "#headerNav1")
    private WebElement myTrips_tab;
    @FindBy(css = "#headerNav1-panel")
    private WebElement myTrips_panel;
    @FindBy(css = "#headerNav2")
    private WebElement travelInfo_tab;
    @FindBy(css = "#headerNav2-panel")
    private WebElement travelInfo_panel;
    @FindBy(css = "#headerNav3")
    private WebElement mileagePlus_tab;
    @FindBy(css = "#headerNav3-panel")
    private WebElement mileagePlus_panel;
    @FindBy(css = "#headerNav4")
    private WebElement deals_tab;
    @FindBy(css = "#headerNav4-panel")
    private WebElement deals_panel;
    @FindBy(css = "#headerNav5")
    private WebElement help_tab;
    @FindBy(css = "#headerNav5-panel")
    private WebElement help_panel;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[5]/header/div/div/div[1]/div/div/div/div[2]/nav/ul/li[1]/div/div/button")
    private WebElement espanolLanguage_verification;
    @FindBy(css = "div>span>a")
    private List<WebElement> advisory_links;

    public Header_Section(){
        PageFactory.initElements(driver,this);
    }

    public List<WebElement> getAdvisory_links() {
        return advisory_links;
    }

    public WebElement getBook_tab() {
        return book_tab;
    }

    public WebElement getDeals_tab() {
        return deals_tab;
    }
    public WebElement getDeals_panel() {
        return deals_panel;
    }
    public WebElement getHelp_tab() {
        return help_tab;
    }
    public WebElement getHelp_panel() {
        return help_panel;
    }
    public WebElement getMileagePlus_tab() {
        return mileagePlus_tab;
    }
    public WebElement getMileagePlus_panel() {
        return mileagePlus_panel;
    }
    public WebElement getTravelInfo_tab() {
        return travelInfo_tab;
    }
    public WebElement getTravelInfo_panel() {
        return travelInfo_panel;
    }
    public WebElement getMyTrips_panel() {
        return myTrips_panel;
    }
    public WebElement getMyTrips_tab() {
        return myTrips_tab;
    }
    public WebElement getBook_panel() {
        return book_panel;
    }

    public WebElement getEspanolLanguage_verification() {
        return espanolLanguage_verification;
    }
    public WebElement getEspanolLanguage_selection() {
        return espanolLanguage_selection;
    }
    public WebElement getSelectLanguage_dropdown() {
        return selectLanguage_dropdown;
    }
    public WebElement getLanguageSelection_element() {
        return languageSelection_element;
    }
    public WebElement getChangeLanguage_button() {
        return changeLanguage_button;
    }
}
