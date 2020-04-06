package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ClickingViewIcon {
	
WebDriver driver; 
	
	public ClickingViewIcon(WebDriver driver) {
    	this.driver= driver;
    	PageFactory.initElements(driver, this);
    }
	
	 @FindBy(xpath="//span[@class='glyphicon glyphicon-eye-open']")
	    WebElement view;
	 
	 public void clickViewIcon() {
		 PageUtility.isElementLoaded(driver, view, 2000);
		 view.click();
	 }

}
