package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class CheckingIcons {
static WebDriver driver; 
	
	public CheckingIcons(WebDriver driver) {
    	this.driver= driver;
    	PageFactory.initElements(driver, this);
    }
	
    @FindBy(xpath="//input[@type='checkbox']")
    static WebElement checkBox;
    @FindBy(xpath="//span[@class='glyphicon glyphicon-eye-open']")
    static WebElement view;
    @FindBy(xpath="//span[@class='glyphicon glyphicon-pencil']")
	static WebElement update;
    @FindBy(xpath="//span[@class='glyphicon glyphicon-check']")
    static WebElement approve;
    @FindBy(xpath="//button[@type='submit']")
    static WebElement title;
    

    public static boolean getTextOfDisplayedPage() {
    	
    	return title.isDisplayed();
    }
    
    public static boolean checkingIcon() {
    	PageUtility.isElementLoaded(driver, checkBox, 2000);
    	return(checkBox.isDisplayed() && view.isDisplayed() && update.isDisplayed() && approve.isDisplayed());
    }

}
