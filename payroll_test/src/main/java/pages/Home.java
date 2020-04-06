package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class Home {
	
	static WebDriver driver;
	
	 public Home(WebDriver driver)
	    {
	    	this.driver= driver;
	    	PageFactory.initElements(driver, this);
	    }
	 
	
    @FindBy(xpath="//*[@id='w1']/li[6]/a")
    WebElement timeSheet;
    @FindBy(xpath="//div[@class='col-lg-12 col-sm-12']//following::p[1]")
	static WebElement welcomePayroll;
    
    
    public static boolean gettingWelcomeText() {
    	PageUtility.isElementLoaded(driver, welcomePayroll, 2000);
    	return welcomePayroll.isDisplayed();
    }
    
    public void clickOnTimesheet()  {
    	PageUtility.isElementLoaded(driver, timeSheet, 3000);
    	timeSheet.click();
    	//System.out.println("Time sheet");
    }
    
   
}
