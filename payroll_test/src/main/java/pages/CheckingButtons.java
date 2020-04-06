package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckingButtons {

	WebDriver driver; 
	
	public CheckingButtons(WebDriver driver)
    {
    	this.driver= driver;
    	PageFactory.initElements(driver, this);
    }
	
    @FindBy(xpath="//a[@href='/payrollapp/timesheet']")
    static  WebElement pendingButton ;
    @FindBy(xpath="/html/body/section/div/div/div[1]/ul/li[2]/a")
    static WebElement approvedButton;
    @FindBy(xpath="/html/body/section/div/div/div[1]/ul/li[3]/a")
    static WebElement createButton;
    
    public static  boolean isButtonsDisplayed() {
    	//boolean pendingButton =pending.isDisplayed();
    	//System.out.println("pending Timesheet Button is displayed -"+pendingButton);
    	//String pendingsheet= pending.getText();
		return (pendingButton.isDisplayed() && approvedButton.isDisplayed() && createButton.isDisplayed());
    }
   
    
}
