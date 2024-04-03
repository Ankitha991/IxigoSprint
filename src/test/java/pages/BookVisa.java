package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookVisa {
	@FindBy(xpath = "//p[text()='Book Visa']")
    private WebElement bookVisaElement;
	public BookVisa(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 public void clickOnBookVisa() {
	        bookVisaElement.click();
	    }
}
