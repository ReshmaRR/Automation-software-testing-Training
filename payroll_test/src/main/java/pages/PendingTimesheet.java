package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingTimesheet {
WebDriver driver; 
	
	public PendingTimesheet(WebDriver driver) {
    	this.driver= driver;
    	PageFactory.initElements(driver, this);
    }
	
    @FindBy(xpath="//a[@href='/payrollapp/timesheet']")
    static  WebElement pending;
    @FindBy(xpath="//button[@type='submit']")
    static  WebElement approveTimesheet;
    
    
    public static boolean approveTimesheetPage() {
    	return approveTimesheet.isDisplayed();
    }
    
    public void pendingTimesheetClick() {
    	pending.click();
    	//String approve=approveTimesheet.getText();
    	
    }

}
