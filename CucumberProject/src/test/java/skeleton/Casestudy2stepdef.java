package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.utility.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CaseStudy2Page;



public class Casestudy2stepdef 
{
	WebDriver driver;
	@Before
	public void before()
	{

		
		driver=DriverUtility.getDriver("chrome");
		 PageFactory.initElements(driver, CaseStudy2Page.class);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		 
	}
	@Given("login with valid credentials")
	public void login_with_valid_credentials() {
		
		 CaseStudy2Page.usrname.sendKeys("Lalitha");
		 CaseStudy2Page.pasword.sendKeys("Password123");
		 CaseStudy2Page.login.click();
	}

	@When("Larry added a headphone to the cart")
	public void larry_added_a_headphone_to_the_cart() {
		
	}

	@When("checkout for the payment")
	public void checkout_for_the_payment() {
	   
	}

	@When("fills transaction details")
	public void fills_transaction_details() {
	 
	}

	@Then("the product is successfully ordered")
	public void the_product_is_successfully_ordered() {
	 
	}
}
