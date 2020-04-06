package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;


public class TimeSheetPage {

	static WebDriver driver;
	
	public TimeSheetPage(WebDriver driver)
    {
    	this.driver= driver;
    	PageFactory.initElements(driver, this);
    }
	
    @FindBy(xpath="/html/body/header/div[3]/div/div/div[1]/h1")
    static WebElement timeSheet;
    
    
    public static boolean timesheetPageLoaded() {
    	PageUtility.isElementLoaded(driver, timeSheet, 3000);
    	return timeSheet.isDisplayed();
		
    }
    
}
