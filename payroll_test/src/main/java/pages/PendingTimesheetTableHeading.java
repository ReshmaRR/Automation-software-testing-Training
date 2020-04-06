package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingTimesheetTableHeading {
	
WebDriver driver;
	
	public PendingTimesheetTableHeading(WebDriver driver) {
    	this.driver= driver;
    	PageFactory.initElements(driver, this);
    }

	 @FindBy(xpath="//button[@type='submit']")
	 static WebElement title;
	 @FindBy(xpath="//*[@id=\"grid\"]/table/thead/tr/th")
	 List<WebElement>c;
	 @FindBy(tagName="th")
	 List<WebElement>currentrow; 
	    

	   public boolean getTextOfDisplayedPage() {
	    	
	    	return title.isDisplayed();
	    }
	 
	 public void checkingPendingTimesheet() {
			
		 int column=c.size();
		  System.out.println(column);
			  
			  for(int j=0;j<column;j++)  {
				  String text=currentrow.get(j).getText();
				  System.out.println(text);
			  }
		  System.out.println();
	    System.out.println("------------------------------------");
		  }

	
}




