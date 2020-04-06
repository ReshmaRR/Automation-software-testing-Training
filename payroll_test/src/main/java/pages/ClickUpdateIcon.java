package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ClickUpdateIcon {

WebDriver driver; 
	
	public ClickUpdateIcon(WebDriver driver) {
    	this.driver= driver;
    	PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-pencil']")
    WebElement update;

	 
	 public void clickViewIcon() {
		 PageUtility.isElementLoaded(driver, update, 3000);
		  update.click();
		  
	 }

}
