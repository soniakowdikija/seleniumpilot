package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.utility.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CaseStudy1Page;

public class CaseStudy1StepDefinition 
{
	WebDriver driver;
	//@Before
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
	@When("add category")
	public void add_category()
	{
		CaseStudy1Page.addCategory.click();
		CaseStudy1Page.categoryName.sendKeys("Laptop12$");
		CaseStudy1Page.categoryDesc.sendKeys("asdgbcd");
		CaseStudy1Page.submit1.click();
		driver.navigate().back();
		driver.navigate().back();
	}

	
	  @When("add subcategory")
	 
	  public void add_subcategory() 
	  {
		  CaseStudy1Page.addASubCategory.click();
		  CaseStudy1Page.ab();
		  CaseStudy1Page.subcat1.sendKeys("hp12");
		  CaseStudy1Page.SubCatgDesc.sendKeys("tfukyg");
		  CaseStudy1Page.Submit.click();
		  driver.navigate().back();
	  }
	 

	@When("add a product")
	public void add_a_product()
	{
		CaseStudy1Page.AddProduct.click();
		CaseStudy1Page.catname();
		//Select catname=new Select(CaseStudy1Page.SubCategoryName);
		//catname.selectByIndex(2);
		CaseStudy1Page.subcat();
		CaseStudy1Page.ProductName.sendKeys("HP laptop");
		CaseStudy1Page.Price.sendKeys("30000");
		CaseStudy1Page.Quantity.sendKeys("2");
		CaseStudy1Page.brand.sendKeys("hp");
		CaseStudy1Page.description.sendKeys("fgmjygvkuh");
		CaseStudy1Page.submit.click();
	}

	@Then("product is added successfully")
	public void product_is_added_successfully() {
	   
		String msg=driver.findElement(By.xpath("/html/body/main/div/div/div/form/b/i")).getText();
		Assert.assertTrue(msg.contains("HP is added Succesfully"));
	}
}
