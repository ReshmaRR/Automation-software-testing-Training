package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateTimesheetPage {

WebDriver driver; 
	
	public UpdateTimesheetPage(WebDriver driver) {
    	this.driver= driver;
    	PageFactory.initElements(driver, this);
    }
	
	 @FindBy(xpath="//div[@class='col-sm-6 page-title']")
	static  WebElement view;
	 
	 public static boolean getTextOfDisplayedPage() {
		
		return view.isDisplayed();
	 }
}
