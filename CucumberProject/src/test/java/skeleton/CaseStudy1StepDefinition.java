package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utility.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CaseStudy1Page;

public class CaseStudy1StepDefinition 
{
	WebDriver driver;
	@Before
	public void before()
	{
		 driver=DriverUtility.getDriver("chrome");
		 PageFactory.initElements(driver, CaseStudy1Page.class);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("The Url of the TestMeApp")
	public void the_Url_of_the_TestMeApp() {
	  
	   driver.get("http://10.232.237.143:443/TestMeApp/loginhere.htm");
	   
	}

	@When("login with a valid credentials")
	public void login_with_a_valid_credentials() {
		CaseStudy1Page.username.sendKeys("admin");
		CaseStudy1Page.password.sendKeys("Password456");
		CaseStudy1Page.login.click();
		
		
		
	}

	@When("add a product")
	public void add_a_product() {
		CaseStudy1Page.AddProduct.click();
		Select cat=new Select(CaseStudy1Page.CategoryName);
		cat.selectByIndex(1);
		Select catname=new Select(CaseStudy1Page.SubCategoryName);
		catname.selectByIndex(2);
		CaseStudy1Page.ProductName.sendKeys("HP");
		CaseStudy1Page.Price.sendKeys("30000");
		CaseStudy1Page.Quantity.sendKeys("2");
		CaseStudy1Page.brand.sendKeys("Lenova");
		CaseStudy1Page.description.sendKeys("fgmjygvkuh");
		CaseStudy1Page.submit.click();
	}

	@Then("product is added successfully")
	public void product_is_added_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
}
