package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerServices {
	 @FindBy(xpath = "//p[text()='Customer Service']")
	    private WebElement customerServiceElement;
	 public CustomerServices(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	 public void clickOnCustomerServices() throws InterruptedException {
	        customerServiceElement.click();
	        Thread.sleep(3000);
	    }
}
