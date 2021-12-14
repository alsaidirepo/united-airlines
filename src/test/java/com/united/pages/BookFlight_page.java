package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.united.base.Hooks.driver;

public class BookFlight_page {

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[2]/button/span")
    private WebElement travelWithPet_link;
    @FindBy(css = "#flexDatesLabel")
    private WebElement flexibleDates_element;
    @FindBy(name = "bookFlightModel.advancedSearch.petCabin")
    private WebElement petCabin_element;
    @FindBy(css = "[title=\"Advanced search\"]")
    private WebElement advancedSearch_link;
    @FindBy(css = "#flexMonth")
    private WebElement flexMonth_dropdown;
    @FindBy(css = "div.atm-l-section.atm-l-sidebar__main")
    private WebElement advancedSearch_fields;



    public BookFlight_page() {
        PageFactory.initElements(driver, this);
    }
    public WebElement getPetCabin_element() {
        return petCabin_element;
    }

    public WebElement getFlexibleDates_element() {
        return flexibleDates_element;
    }

    public WebElement getFlexMonth_dropdown() {
        return flexMonth_dropdown;
    }

    public WebElement getAdvancedSearch_fields() {
        return advancedSearch_fields;
    }

    public WebElement getAdvancedSearch_link() {
        return advancedSearch_link;
    }

    public WebElement getTravelWithPet_link() {
        return travelWithPet_link;
    }

}

