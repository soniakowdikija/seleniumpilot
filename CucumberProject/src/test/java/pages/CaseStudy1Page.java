package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CaseStudy1Page 
{
	@FindBy(how=How.ID,using = "userName")
	public static WebElement username;
	@FindBy(how=How.ID,using = "password")
	public static WebElement password;
	@FindBy(how=How.CSS,using = "input[value='Login']")
	public static WebElement login;
	
	
	
	@FindBy(how=How.XPATH,using = "/html/body/main/div/div/div/div[2]/button/h4")
	public static WebElement addCategory;
	@FindBy(how=How.ID,using = "catgName")
	public static WebElement categoryName;
	@FindBy(how=How.ID,using = "catgDesc")
	public static WebElement categoryDesc;
	@FindBy(how=How.CSS,using = "input[value='Add']")
	public static WebElement submit1;
	//@FindBy(how=How.XPATH,using = "/html/body/main/div/div/div/form/b/i")
	//public static WebElement verify;
	
	
	
	  @FindBy(how=How.XPATH,using = "/html/body/main/div/div/div/div[3]/button/h4")
	  public static WebElement addASubCategory;
	  
	
	  @FindBy(how=How.ID,using = "subCatgId")
	  public static WebElement category;
	  public static void ab()
	  {
		  Select ctgry=new Select(category);
		  ctgry.selectByValue("11360");
	  }
	  @FindBy(how=How.ID,using = "subCatgName")
	  public static WebElement subcat1;
	 @FindBy(how=How.ID,using = "subCatgDesc")
	  public static WebElement SubCatgDesc;
	 @FindBy(how=How.CSS,using = "input[type='submit']")
	 public static WebElement Submit;
	
	
	
	
	
	
	  @FindBy(how=How.XPATH,using = "/html/body/main/div/div/div/div[1]/button/h4")
	  public static WebElement AddProduct;
	
	  @FindBy(how=How.ID,using = "categorydropid")
	  public static WebElement CategoryName;
	  public static void catname() 
	  {
		  Select cat=new Select(CategoryName);
		  cat.selectByIndex(1);
	 }
	  
	
	
	  @FindBy(how=How.ID,using = "subcategorydropid") 
	  public static WebElement SubCategoryName;
	  public static void subcat() 
	  { 
		  Select catname=new Select(SubCategoryName);
	 	  catname.selectByIndex(2);
	  }
	
	
	
	
	
	
	
	
	
	
	  
	  
	  
	 
	  
	
	  
	  
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
