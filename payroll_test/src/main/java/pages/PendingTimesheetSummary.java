package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingTimesheetSummary {
	
WebDriver driver;
	
	public PendingTimesheetSummary(WebDriver driver) {
    	this.driver= driver;
    	PageFactory.initElements(driver, this);
    }
	
	 @FindBy(xpath="//div[@class='summary']")
	 static WebElement sheetNumbers;
	 @FindBy(xpath="//button[@type='submit']")
	    static WebElement approveTimesheets;
	    

	    public static boolean getTextOfDisplayedPage() {
	    	
	    	return approveTimesheets.isDisplayed();
	    }
	 
	 public static boolean isSummaryDisplayed() {
		String sheets= sheetNumbers.getText();
		return sheetNumbers.isDisplayed(); 
	 }

}
