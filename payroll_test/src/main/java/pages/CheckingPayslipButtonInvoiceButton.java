package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class CheckingPayslipButtonInvoiceButton {
WebDriver driver;
	
	public CheckingPayslipButtonInvoiceButton(WebDriver driver) {
    	this.driver= driver;
    	PageFactory.initElements(driver, this);
    }
	
	 @FindBy(xpath="//button[@class='btn btn-warning btn-responsive playslip']")
	 WebElement playslip;
	 @FindBy(xpath="//button[@class='btn btn-warning btn-responsive invoice']")
	 WebElement invoice;
	 @FindBy(xpath="//button[@type='submit']")
	    static WebElement title;
	    

	 public static boolean getTextOfDisplayedPage() {
	    	//String text= title.getText();
			return title.isDisplayed();
	        
	    	
	    }
	 
	 public  boolean isPayslipInvoiceButtonDisplayed() {
		 PageUtility.isElementLoaded(driver, invoice, 2000);
		return (playslip.isDisplayed() && invoice.isDisplayed());

	}
    	
	
		
    		
    
}
