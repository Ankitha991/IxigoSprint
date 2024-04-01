package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Plan {
	@FindBy(xpath = "//p[text()='Plan']")
    private WebElement planElement;
	public Plan(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnPlan() throws InterruptedException {
        planElement.click();
        Thread.sleep(3000);
    }

}
