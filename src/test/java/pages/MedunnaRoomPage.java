package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaRoomPage {

    public MedunnaRoomPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "jh-create-entity")
    public WebElement createNewRoomButton;

    @FindBy(id = "room-roomNumber")
    public WebElement roomNumberInput;

    @FindBy(id = "room-roomType")
    public WebElement roomTypeDropdown;

    @FindBy(id = "statusLabel")
    public WebElement statusCheckbox;

    @FindBy(id = "room-price")
    public WebElement roomPriceInput;

    @FindBy(id = "room-description")
    public WebElement descriptionInput;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//span[.='Created Date']")
    public WebElement createDate;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement firstRoomNUmber;

}
