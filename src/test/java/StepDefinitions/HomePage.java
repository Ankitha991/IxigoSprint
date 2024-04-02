package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BookVisa;
import pages.CustomerServices;
import pages.GroupBooking;
import pages.Plan;

public class HomePage {
	WebDriver driver;
	@Given("I am on the Ixigo Website")
	public void i_am_on_the_ixigo_website() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 550)");
	}

	@When("I click on more")
	public void i_click_on_more() throws InterruptedException {
		  Thread.sleep(4000);
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		  WebElement more =wait.until(ExpectedConditions.elementToBeClickable
				 (By.xpath("//p[text()='More']")));
		 
		  Point p = more.getLocation(); 
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("arguments[0].scrollIntoViewIfNeeded()", more);
		  more.click();
	}

	@When("I click on Plan")
	public void i_click_on_plan() throws InterruptedException {
		Plan obj=new Plan(driver);
		obj.clickOnPlan();
	}

	@Then("it will redirect to the plan page")
	public void it_will_redirect_to_the_plan_page() {
		 WebElement planpage = driver.findElement(By.xpath("//p[text()='Plan']"));
		 Assert.assertTrue(planpage.isDisplayed());
		 System.out.println("Plan Page is Displayed");
	}

	@When("I click on Group Booking")
	public void i_click_on_group_booking() throws InterruptedException {
		GroupBooking obj=new GroupBooking(driver);
		obj.clickOnGroupBooking();
	}

	@Then("it will redirect to the group booking page")
	public void it_will_redirect_to_the_group_booking_page() {
		 WebElement groupbookingpage = driver.findElement(By.xpath("//p[text()='Group Booking']"));
		 Assert.assertTrue(groupbookingpage.isDisplayed());
		 System.out.println("Group Booking Page is Displayed");
	}
	
	@When("I click on Book Visa")
	public void i_click_on_book_visa() throws InterruptedException{
		BookVisa obj=new BookVisa(driver);
		obj.clickOnBookVisa();
	}

	@Then("it will redirect to the Book Visa Page")
	public void it_will_redirect_to_the_book_visa_page() {
		WebElement visapage = driver.findElement(By.xpath("//p[text()='Book Visa']"));
		 Assert.assertTrue(visapage.isDisplayed());
		 System.out.println("Book Visa Page is Displayed");
	}

	@When("I click on Customer Service")
	public void i_click_on_customer_service() throws InterruptedException {
		CustomerServices obj=new CustomerServices(driver);
		obj.clickOnCustomerServices();
	}

	@Then("it will redirect to the Customer Service Page")
	public void it_will_redirect_to_the_customer_service_page() {
		System.out.println("Customer Service Page is Displayed");
	}

}
