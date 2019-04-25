package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.utility.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegisterPage;

public class DemoWebShopRegistrationStepDef 
{
	WebDriver driver;
	//@Before
	
	public void before()
	{
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, RegisterPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	@Given("url of the demowebshop")
	public void url_of_the_demowebshop() {

	    driver.get("http://demowebshop.tricentis.com/register");
	}

	@When("user enters the data for the registration")
	public void user_enters_the_data_for_the_registration() {
		RegisterPage.gender.click();
		RegisterPage.firstname.sendKeys("sonia");
		RegisterPage.lastname.sendKeys("kj");
		RegisterPage.email.sendKeys("soniakowdki@gmail.com");
		RegisterPage.password.sendKeys("sonia@123");
		RegisterPage.confirmPassword.sendKeys("sonia@123");
		RegisterPage.RegisterButton.click();
	}

	@Then("user is registered succesfully")
	public void user_is_registered_succesfully() {
	   
	}
	
	
	
	
	
	
	
	
}
