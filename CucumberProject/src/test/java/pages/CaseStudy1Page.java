package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CaseStudy1Page 
{
	@FindBy(how=How.ID,using = "userName")
	public static WebElement username;
	@FindBy(how=How.ID,using = "password")
	public static WebElement password;
	@FindBy(how=How.CSS,using = "input[value='Login']")
	public static WebElement login;
	@FindBy(how=How.XPATH,using = "/html/body/main/div/div/div/div[1]/button/h4")
	public static WebElement AddProduct;
	@FindBy(how=How.ID,using = "categorydropid")
	public static WebElement CategoryName;
	@FindBy(how=How.ID,using = "subcategorydropid")
	public static WebElement SubCategoryName;
	@FindBy(how=How.ID,using = "prodid")
	public static WebElement ProductName;
	@FindBy(how=How.ID,using = "priceid")
	public static WebElement Price;
	@FindBy(how=How.ID,using = "quantityid")
	public static WebElement Quantity;
	@FindBy(how=How.ID,using = "brandid")
	public static WebElement brand;
	@FindBy(how=How.ID,using = "description")
	public static WebElement description;
	@FindBy(how=How.CSS,using = "input[type='submit']")
	public static WebElement submit;
}
