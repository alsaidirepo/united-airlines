package com.united.modals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Booking_Modal {
    @FindBy(css = "ul[class='app-components-BookTravel-bookTravel__travelNav--3RNBj'] >li")
    private List<WebElement> booking_tabs;
    @FindBy(xpath = "//span[text()='Roundtrip']")
    private WebElement roundTrip_radioButton;
    @FindBy(xpath = "//span[text()='Find flights']")
    private WebElement findFlights_button;
    @FindBy(css = "#bookFlightOriginInput")
    private WebElement fromDestination_textArea;
    @FindBy(xpath = "//*[@id=\"bookFlightDestinationInput\"]")
    private WebElement toDestination_textArea;
    @FindBy(css = "#flightResults-content")
    private WebElement flightResults_element;
    @FindBy(css = "#oneway")
    private WebElement oneWay_radioButton;
    @FindBy(css = "#DepartDate")
    private WebElement departDate_element;
    @FindBy(css = "#passengerSelector>button")
    private WebElement travelers_element;
    @FindBy(css = "[aria-label='Saturday, January 15, 2022. Prices from $108']")
    private WebElement departDate_selection;
    @FindBy(css = "[aria-label='Move backward to switch to the previous month.']")
    private WebElement leftArrow_button;
    @FindBy(css = "[aria-label='Move forward to switch to the next month.']")
    private WebElement rightArrow_button;
    @FindBy(css = "[aria-label='Substract one Adult']")
    private WebElement traveler_plusButton;
    @FindBy(css = "[aria-label='Add one more Adult']")
    private WebElement traveler_subtractButton;
    @FindBy(css = "[aria-label='Tuesday, February 15, 2022. Prices from $215']")
    private WebElement flight_departureDate;
    @FindBy(css = "[aria-label='Clear Dates']")
    private WebElement clearFlightDate_button;
    @FindBy(css = "[aria-label='Friday, February 25, 2022']")
    private WebElement flight_returnDate;
    @FindBy(css = "#bookFlightTab-panel")
    private List<WebElement> bookTab_inputFields;
    @FindBy(css = "#statusTab-panel input")
    private List<WebElement> statusTab_inputFields;
    @FindBy(xpath = "//span[text()='Flight status']")
    private WebElement flightStatus_tab;
    @FindBy(css = "#checkInTab")
    private WebElement checkIn_tab;
    @FindBy(css = "#tripsTab")
    private WebElement myTrips_tab;
    @FindBy(css = "#checkInTab-panel input")
    private List<WebElement> checkIn_inputFields;
    @FindBy(css = "#tripsTab-panel input")
    private List<WebElement> myTrips_inputFields;
    @FindBy(css = "#cabinType")
    private WebElement flightType_element;
    @FindBy(css = "#DepartDate")
    private WebElement departDates_element;
    @FindBy(css = "#ReturnDate")
    private WebElement returnDates_element;
    @FindBy(css = "button[aria-label='Substract one Adult']")
    private WebElement senior_plusButton;
    @FindBy(css = "button[aria-label='Substract one Infant']")
    private WebElement infant_plusButton;
    @FindBy(css = "button[aria-label='Substract one Infant on lap']")
    private WebElement infantOnLap_plusButton;
    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[2]/div[1]/div/button[2]")
    private WebElement child_plusButton;
    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[2]/div[2]/div/button[2]")
    private WebElement childTwo_plusButton;
    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[2]/div[3]/div/button[2]")
    private WebElement childThree_plusButton;
    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[2]/div[4]/div/button[2]")
    private WebElement childFour_plusButton;
    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[2]/div/div[1]/div/div/div[1]/div/button")
    private WebElement removeFrom_button;
    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[2]/div/div[1]/div/div/div[2]/div/button[2]")
    private WebElement removeGoingTo_button;
    @FindBy(css = "button[aria-label=\"reverse origin and destination\"]")
    private WebElement switchFlight_icon;
    @FindBy(css = "#cabinType_item-2")
    private WebElement businessFlight_element;
    @FindBy(css = "#cabinType_item-1")
    private WebElement premiumFlight_element;
    @FindBy(css = "#cabinType_item-0")
    private WebElement economyFlight_element;
    @FindBy(css = "#bookHotelTab")
    private WebElement bookHotel_tab;
    @FindBy(css = "input[id='bookHotelModel.passengers']")
    private WebElement numOfTravelers_hotelElement;
    @FindBy(css = "#roomsDropdown div")
    private WebElement numOfRooms_element;
    @FindBy(id = "Adults plusBtn")
    private WebElement adultHotel_plusBtn;
    @FindBy(id = "Children plusBtn")
    private WebElement childHotel_plusBtn;
    @FindBy(css = "#bookHotelTab-panel input")
    private List<WebElement> hotelInput_fields;
    @FindBy(css = "#bookHotelTab-panel button")
    private List<WebElement> hotel_Buttons;
    @FindBy(css = "#roomsDropdown_item-2")
    private WebElement numRoomTwo_element;
    @FindBy(css = "#bookCarTab")
    private WebElement bookCar_tab;
    @FindBy(css = "#driversAge")
    private WebElement carDriverAge_element;
    @FindBy(xpath = "//span[text()='Primary Driver is 25 or older']")
    private WebElement ageOver25_element;
    @FindBy(css = "input[id=\"bookCarDropoffInput\"]")
    private WebElement carDropOff_element;
    @FindBy(xpath = "//span[text()='Return car to same location']")
    private WebElement returnCar_element;
    @FindBy(css = "[aria-labelledby=\"roomsDropdown_label-0\"] > li")
    private List<WebElement> eightRoom_element;
    @FindBy(css = "#bookCarForm input")
    private List<WebElement> bookCar_fields;
    @FindBy(css = "#bookCarForm button")
    private List<WebElement> bookCar_buttons;
    @FindBy(css = "#bookCarPickupInput")
    private WebElement carPickUp_element;
    @FindBy(css = "#bookCarPickupDate")
    private WebElement carPickUpDate_element;
    @FindBy(css = "[aria-label=\"Thursday, December 16, 2021\"]")
    private WebElement pickUpCarDate_element;
    @FindBy(css = "[aria-label=\"Saturday, December 25, 2021\"]")
    private WebElement dropOffCarDate_element;
    @FindBy(css = "[aria-label=\"Find cars button.\"]")
    private WebElement findCar_button;
    @FindBy(css = "#ct-search-details")
    private WebElement carResult_element;
    @FindBy(css = "#bookCarPickupInput-menu-item-1")
    private WebElement washingtonPickUp_element;
    @FindBy(css = "#bookPackageTab")
    private WebElement bookPackage_tab;
    @FindBy(css = "#containerId")
    private WebElement packageTraveler_element;
    @FindBy(css = "#selectedRooms")
    private WebElement roomCabinet_element;
    @FindBy(xpath = "//*[@id=\"bookVacationForm\"]/div[2]/div[3]")
    private List<WebElement> roomListCabinet_element;
    @FindBy(css = "#radiofield-item-id-packageType-2")
    private WebElement flightAndCar_radioBtn;
    @FindBy(css = "#bookCruiseTab")
    private WebElement cruise_link;
    @FindBy(css = "#bookVacationForm input")
    private List<WebElement> packagesTab_fields;
    @FindBy(css = "div[aria-label=\"2 rooms\"]")
    private WebElement roomSelection_element;
    @FindBy(css = "[aria-labelledby=\"roomDescriptor\"]  li")
    private List<WebElement> numOfRoom_element;
    @FindBy(css = "#statusTab")
    private WebElement status_tab;
    @FindBy(css = "#flightStatusDestinationInput")
    private WebElement statusToFlight_element;
    @FindBy(css = "button[aria-label=\"Search\"]")
    private WebElement statusSearch_Btn;
    @FindBy(css = "#departureTimeLabel")
    private WebElement flightStatus_element;
    @FindBy(css = "[aria-label=\"Flight number\"]")
    private WebElement flightNumber_element;
    @FindBy(css = "div.atm-c-field-note.atm-c-textfield__note")
    private WebElement invalidNumError_element;
    @FindBy(css = "[aria-controls=\"checkInTab-panel\"]")
    private WebElement checkInTab_element;
    @FindBy(css = "#formSubmitBtn")
    private WebElement checkInBtn_element;
    @FindBy(css = "#flightCheckInConfNumber_aria")
    private WebElement checkInErrorMessage_element;
    @FindBy(xpath = "//a[text()='Check-in and Airport Processing Times']")
    private WebElement checkInDetails_link;
    @FindBy(xpath = "//button[text()='Check in with your MileagePlus number']")
    private WebElement checkInMilesPlus_link;
    @FindBy(css = "#tripsTab")
    private WebElement trips_tab;
    @FindBy(css = "a[href=\"/en/US/fly/travel/credit.html\"]")
    private WebElement travelCredits_link;
    @FindBy(css = "#myTripsConfirmationNumber_aria")
    private WebElement myTripsError_element;
    @FindBy(css = "#myTripsSubmitBtn")
    private WebElement myTripsSearch_Btn;
    @FindBy(css = "[aria-label=\"Looking for past or canceled flights?\"]")
    private WebElement myTripsSignIn_link;




    public Booking_Modal() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyTripsSignIn_link() {
        return myTripsSignIn_link;
    }

    public WebElement getMyTripsSearch_Btn() {
        return myTripsSearch_Btn;
    }

    public WebElement getMyTripsError_element() {
        return myTripsError_element;
    }

    public WebElement getTravelCredits_link() {
        return travelCredits_link;
    }

    public WebElement getTrips_tab() {
        return trips_tab;
    }

    public WebElement getCheckInMilesPlus_link() {
        return checkInMilesPlus_link;
    }

    public WebElement getCheckInDetails_link() {
        return checkInDetails_link;
    }

    public WebElement getCheckInErrorMessage_element() {
        return checkInErrorMessage_element;
    }

    public WebElement getCheckInTab_element() {
        return checkInTab_element;
    }

    public WebElement getCheckInBtn_element() {
        return checkInBtn_element;
    }

    public WebElement getFlightNumber_element() {
        return flightNumber_element;
    }

    public WebElement getInvalidNumError_element() {
        return invalidNumError_element;
    }

    public WebElement getFlightAndCar_radioBtn() {
        return flightAndCar_radioBtn;
    }

    public WebElement getFlightStatus_element() {
        return flightStatus_element;
    }

    public WebElement getStatusSearch_element() {
        return statusSearch_Btn;
    }

    public WebElement getStatusToFlight_element() {
        return statusToFlight_element;
    }

    public WebElement getStatus_tab() {
        return status_tab;
    }

    public WebElement getCruise_link() {
        return cruise_link;
    }

    public List<WebElement> getRoomListCabinet_element() {
        return roomListCabinet_element;
    }

    public WebElement getRoomCabinet_element() {
        return roomCabinet_element;
    }

    public WebElement getRoomSelection_element() {
        return roomSelection_element;
    }

    public List<WebElement> getNumOfRoom_element() {
        return numOfRoom_element;
    }

    public WebElement getPackageTraveler_element() {
        return packageTraveler_element;
    }

    public WebElement getBookPackage_tab() {
        return bookPackage_tab;
    }

    public List<WebElement> getPackagesTab_fields() {
        return packagesTab_fields;
    }

    public WebElement getWashingtonPickUp_element() {
        return washingtonPickUp_element;
    }

    public WebElement getCarResult_element() {
        return carResult_element;
    }

    public WebElement getDropOffCarDate_element() {
        return dropOffCarDate_element;
    }

    public WebElement getFindCar_button() {
        return findCar_button;
    }

    public List<WebElement> getBookCar_fields() {
        return bookCar_fields;
    }

    public WebElement getPickUpCarDate_element() {
        return pickUpCarDate_element;
    }

    public WebElement getCarPickUpDate_element() {
        return carPickUpDate_element;
    }

    public WebElement getCarPickUp_element() {
        return carPickUp_element;
    }

    public WebElement getCarDriverAge_element() {
        return carDriverAge_element;
    }

    public WebElement getAgeOver25_element() {
        return ageOver25_element;
    }

    public WebElement getReturnCar_element() {
        return returnCar_element;
    }

    public WebElement getCarDropOff_element() {
        return carDropOff_element;
    }

    public List<WebElement> getBookCar_buttons() {
        return bookCar_buttons;
    }

    public WebElement getBookCar_tab() {
        return bookCar_tab;
    }

    public WebElement getBookHotel_tab() {
        return bookHotel_tab;
    }

    public WebElement getNumRoomTwo_element() {
        return numRoomTwo_element;
    }

    public List<WebElement> getEightRoom_element() {
        return eightRoom_element;
    }

    public WebElement getChildHotel_plusBtn() {
        return childHotel_plusBtn;
    }

    public WebElement getAdultHotel_plusBtn() {
        return adultHotel_plusBtn;
    }

    public WebElement getNumOfRooms_element() {
        return numOfRooms_element;
    }

    public List<WebElement> getHotel_Buttons() {
        return hotel_Buttons;
    }

    public List<WebElement> getHotelInput_fields() {
        return hotelInput_fields;
    }

    public WebElement getNumOfTravelers_hotelElement() {
        return numOfTravelers_hotelElement;
    }

    public WebElement getInfantUnderTwo_plusButton() {
        return infantOnLap_plusButton;
    }

    public WebElement getTraveler_subtractButton() {
        return traveler_subtractButton;
    }

    public WebElement getBusinessFlight_element() {
        return businessFlight_element;
    }

    public WebElement getPremiumFlight_element() {
        return premiumFlight_element;
    }

    public WebElement getEconomyFlight_element() {
        return economyFlight_element;
    }

    public WebElement getRemoveGoingTo_button() {
        return removeGoingTo_button;
    }

    public WebElement getRemoveFrom_button() {
        return removeFrom_button;
    }

    public WebElement getSwitchFlight_icon() {
        return switchFlight_icon;
    }

    public WebElement getChild_plusButton() {
        return child_plusButton;
    }

    public WebElement getChildTwo_plusButton() {
        return childTwo_plusButton;
    }

    public WebElement getChildThree_plusButton() {
        return childThree_plusButton;
    }

    public WebElement getChildFour_plusButton() {
        return childFour_plusButton;
    }

    public WebElement getInfant_plusButton() {
        return infant_plusButton;
    }

    public WebElement getSenior_plusButton() {
        return senior_plusButton;
    }

    public WebElement getDepartDates_element() {
        return departDates_element;
    }

    public WebElement getReturnDates_element() {
        return returnDates_element;
    }

    public WebElement getFlightType_element() {
        return flightType_element;
    }

    public WebElement getMyTrips_tab() {
        return myTrips_tab;
    }

    public List<WebElement> getMyTrips_inputFields() {
        return myTrips_inputFields;
    }

    public List<WebElement> getCheckIn_inputFields() {
        return checkIn_inputFields;
    }

    public WebElement getCheckIn_tab() {
        return checkIn_tab;
    }

    public WebElement getFlightStatus_tab() {
        return flightStatus_tab;
    }

    public List<WebElement> getStatusTab_inputFields() {
        return statusTab_inputFields;
    }

    public List<WebElement> getBookTab_inputFields() {
        return bookTab_inputFields;
    }

    public WebElement getFlight_departureDate() {
        return flight_departureDate;
    }

    public WebElement getRightArrow_button() {
        return rightArrow_button;
    }

    public WebElement getClearFlightDate_button() {
        return clearFlightDate_button;
    }

    public WebElement getFlight_returnDate() {
        return flight_returnDate;
    }

    public WebElement getTraveler_plusButton() {
        return traveler_plusButton;
    }

    public WebElement getTravelers_element() {
        return travelers_element;
    }

    public WebElement getLeftArrow_button() {
        return leftArrow_button;
    }

    public WebElement getDepartDate_selection() {
        return departDate_selection;
    }

    public WebElement getDepartDate_element() {
        return departDate_element;
    }

    public WebElement getOneWay_radioButton() {
        return oneWay_radioButton;
    }

    public WebElement getFlightResults_element() {
        return flightResults_element;
    }

    public WebElement getToDestination_textArea() {
        return toDestination_textArea;
    }

    public WebElement getFromDestination_textArea() {
        return fromDestination_textArea;
    }

    public List<WebElement> getBooking_tabs() {
        return booking_tabs;
    }

    public WebElement getFindFlights_button() {
        return findFlights_button;
    }

    public WebElement getRoundTrip_radioButton() {
        return roundTrip_radioButton;
    }
}

