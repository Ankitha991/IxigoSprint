package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroupBooking {
	 @FindBy(xpath = "//p[text()='Group Booking']")
	    private WebElement groupBookingElement;
	 public GroupBooking(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	 public void clickOnGroupBooking() {
	        groupBookingElement.click();
	    }
}
