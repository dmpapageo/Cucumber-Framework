package CucumberFramework.steps;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps {
	
WebDriver driver;
	
	@Before()
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/CucumberFramework/resources/chromedriver");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}
	
	@After()
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
	@Given("^I access webdriveruniversity$")
	public void i_access_webdriveruniversity() throws Throwable {
		driver.get("http://www.webdriveruniversity.com");
	}

	@When("^I click on the contact us button$")
	public void i_click_on_the_contact_us_button() throws Throwable {
		driver.findElement(By.id("contact-us")).click();	}

	@When("^I enter a valid first name$")
	public void i_enter_a_valid_first_name(DataTable arg1) throws Throwable {
		
//		//store current window handle
//		@SuppressWarnings("unused")
//		String winHandleBefore = driver.getWindowHandle();
//		//perform click that opens the new window
//		//switch to new window
//		for (String winHandle : driver.getWindowHandles()) {
//			driver.switchTo().window(winHandle);
//		}
//		
//		List<List<String>> data = arg1.raw();
//		driver.findElement(By.id("//*[@id=\"contact_form\"]/input[1]")).sendKeys(data.get(0).get(1));
	}

	@When("^I enter a valid last name$")
	public void i_enter_a_valid_last_name() throws Throwable {
		System.out.println("I enter a valid last name");
	}

	@When("^I enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Throwable {
		System.out.println("I enter a valid email address");
	}

	@When("^I enter comments$")
	public void i_enter_comments() throws Throwable {
		System.out.println("I enter a valid email address");
	}

	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Throwable {
		System.out.println("I click on the submit button");
	}

	@Then("^the information should successfully be submitted via the contact us form$")
	public void the_information_should_successfully_be_submitted_via_the_contact_us_form() throws Throwable {
		System.out.println("the information should successfully be submitted via the contact us form");
	}

	@When("^I enter a non valid first name$")
	public void i_enter_a_non_valid_first_name() throws Throwable {
		System.out.println("I enter a non valid first name");
	}

	@When("^I enter a non valid last name$")
	public void i_enter_a_non_valid_last_name() throws Throwable {
		System.out.println("I enter a non valid last name");
	}

	@When("^I enter a non valid email address$")
	public void i_enter_a_non_valid_email_address() throws Throwable {
		System.out.println("I enter a non valid email address");
	}

	@When("^I enter no comments$")
	public void i_enter_no_comments() throws Throwable {
		System.out.println("I enter no comments");
	}

	@Then("^the information should not be successfully be submitted via the contact us form$")
	public void the_information_should_not_be_successfully_be_submitted_via_the_contact_us_form() throws Throwable {
		System.out.println("the information should not be successfully be submitted via the contact us form");
	}

	@Then("^the user should also be notified of the problem$")
	public void the_user_should_also_be_notified_of_the_problem() throws Throwable {
		System.out.println("the user should also be notified of the problem");
	}
}
