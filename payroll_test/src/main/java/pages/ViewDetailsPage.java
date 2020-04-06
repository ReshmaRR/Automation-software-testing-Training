package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ViewDetailsPage {

static WebDriver driver; 
	
	public ViewDetailsPage(WebDriver driver) {
    	this.driver= driver;
    	PageFactory.initElements(driver, this);
    }
	
	 @FindBy(xpath="//div[@class='col-sm-6 page-title']")
	static  WebElement view;
	 
	 public static boolean viewDetailsPageLoaded() {
		 PageUtility.isElementLoaded(driver, view, 2000);
		return view.isDisplayed();
	 }

}
