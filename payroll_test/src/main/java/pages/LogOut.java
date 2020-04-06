package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LogOut {
	
	
	static WebDriver driver;
	
	  public LogOut(WebDriver driver)
	    {
	    	this.driver= driver;
	    	PageFactory.initElements(driver, this);
	    }
	
	    @FindBy(xpath="//a[@href='#']")
	    WebElement settings;
	    @FindBy(xpath="//a[@class='logout-btn']")
	    WebElement logOut;
	    @FindBy(xpath="//div[@class='col-lg-12 col-sm-12']//following::p[1]")
		static WebElement welcomePayroll;
	    
	    public static boolean gettingWelcomeText() {
	    	PageUtility.isElementLoaded(driver, welcomePayroll, 2000);
	    	//String title=payroll.getText();
	    	return welcomePayroll.isDisplayed();
	    }
	    
	    public void logout() {
	    	
	    	settings.click();
	    	logOut.click();
	    }

}
