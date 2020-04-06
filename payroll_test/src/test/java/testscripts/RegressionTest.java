package testscripts;

import org.testng.annotations.Test;

import pages.Home;
import pages.LogOut;
import pages.Login;
import pages.PendingTimesheet;
import pages.PendingTimesheetSummary;
import pages.PendingTimesheetTableHeading;
import pages.TimeSheetPage;
import pages.UpdateTimesheetPage;
import pages.ViewDetailsPage;
import pages.CheckingButtons;
import pages.CheckingIcons;
import pages.CheckingPayslipButtonInvoiceButton;
import pages.CheckingPendingTimesheets;
import pages.ClickUpdateIcon;
import pages.ClickingViewIcon;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class RegressionTest extends TestHelper{
	
  //@Test
  public void loginTest()  {
	  Login in= new Login(driver);
	  in.login("carol","1q2w3e4r");
	  LogOut out= new LogOut(driver);
	  out.gettingWelcomeText();
	  Assert.assertTrue(LogOut.gettingWelcomeText());
	  out.logout();
  }
  
  //@Test
 public void loadingTimeSheetPage() {
	  Login in= new Login(driver);
	  in.login("carol","1q2w3e4r");
	  Home click= new Home(driver);
	  click.gettingWelcomeText();
	  Assert.assertTrue(Home.gettingWelcomeText());
	  click.clickOnTimesheet();
	  TimeSheetPage timesheet= new TimeSheetPage(driver);
	  timesheet.timesheetPageLoaded();
	  Assert.assertTrue(TimeSheetPage.timesheetPageLoaded());
 }
 
//@Test
 public void checkingButtonOnTimesheetPage() {
	     Login in= new Login(driver);
	     in.login("carol","1q2w3e4r");
	     Home click= new Home(driver);
	     click.gettingWelcomeText();
		 Assert.assertTrue(Home.gettingWelcomeText());
	     click.clickOnTimesheet();	      
		 CheckingButtons button= new CheckingButtons(driver);
		 button.isButtonsDisplayed();
		 Assert.assertTrue(CheckingButtons.isButtonsDisplayed());
  }
  //@Test
  public void loadingPendingTimesheetTest() {
	  Login in= new Login(driver);
      in.login("carol","1q2w3e4r");
      Home click= new Home(driver);
      click.gettingWelcomeText();
	  Assert.assertTrue(Home.gettingWelcomeText());
      click.clickOnTimesheet();	  
	  PendingTimesheet pendingbutton= new PendingTimesheet(driver);
	  pendingbutton.approveTimesheetPage();
	  Assert.assertTrue(PendingTimesheet.approveTimesheetPage());
	  pendingbutton.pendingTimesheetClick();
  }
   //@Test
   public void checkingAnyPendingTimesheet() {
	   Login in= new Login(driver);
	   in.login("carol","1q2w3e4r");	 
	   Home click= new Home(driver);
	   click.gettingWelcomeText();
	   Assert.assertTrue(Home.gettingWelcomeText());
	   click.clickOnTimesheet();	      
	   CheckingPendingTimesheets pendingbutton= new CheckingPendingTimesheets(driver);
	   pendingbutton.checkingPendingTimesheet();
	   
   
   }
   //@Test
   public void checkingTableHeading() {
	   Login in= new Login(driver);
	   in.login("carol","1q2w3e4r");	 
	   Home click= new Home(driver);
	   click.gettingWelcomeText();
	   Assert.assertTrue(Home.gettingWelcomeText());
	   click.clickOnTimesheet();	
	   PendingTimesheetTableHeading heading= new PendingTimesheetTableHeading(driver);
	   heading.getTextOfDisplayedPage();
	   Assert.assertTrue(heading.getTextOfDisplayedPage());
	   heading.checkingPendingTimesheet();
	     
   }
   //@Test
   public void checkingIconIsDisplayed() {
	   Login in= new Login(driver);
	   in.login("carol","1q2w3e4r");	 
	   Home click= new Home(driver);
	   click.gettingWelcomeText();
	   Assert.assertTrue(Home.gettingWelcomeText());
	   click.clickOnTimesheet();	
	   CheckingIcons icon=new CheckingIcons(driver);
	   icon.getTextOfDisplayedPage();
	   Assert.assertTrue(CheckingIcons.getTextOfDisplayedPage());
	   icon.checkingIcon();
	   Assert.assertTrue(CheckingIcons.checkingIcon());
   }
  //@Test
   public void viewDetailsPage() {
	   Login in= new Login(driver);
	   in.login("carol","1q2w3e4r");	 
	   Home click= new Home(driver);
	   click.gettingWelcomeText();
	   Assert.assertTrue(Home.gettingWelcomeText());
	   click.clickOnTimesheet();	
	   ClickingViewIcon press= new ClickingViewIcon(driver);
	   press.clickViewIcon();
	   ViewDetailsPage load=new ViewDetailsPage(driver);
	   load.viewDetailsPageLoaded();
	   Assert.assertTrue(ViewDetailsPage.viewDetailsPageLoaded());
   }
   //@Test
   public void updateDetailsPage() {
	   Login in= new Login(driver);
	   in.login("carol","1q2w3e4r");	 
	   Home click= new Home(driver);
	   click.gettingWelcomeText();
	   Assert.assertTrue(Home.gettingWelcomeText());
	   click.clickOnTimesheet();	
	   ClickUpdateIcon update= new ClickUpdateIcon(driver);
	   update.clickViewIcon();
	   UpdateTimesheetPage loadupdate= new UpdateTimesheetPage(driver);
	   loadupdate.getTextOfDisplayedPage();
	   Assert.assertTrue(UpdateTimesheetPage.getTextOfDisplayedPage());
   }
   //@Test
   public void totalsummaryofpendingsheets() {
	   Login in= new Login(driver);
	   in.login("carol","1q2w3e4r");	 
	   Home click= new Home(driver);
	   click.gettingWelcomeText();
	   Assert.assertTrue(Home.gettingWelcomeText());
	   click.clickOnTimesheet();
	   PendingTimesheetSummary numberofsheets=new PendingTimesheetSummary(driver);
	   numberofsheets.getTextOfDisplayedPage();
	   Assert.assertTrue(PendingTimesheetSummary.getTextOfDisplayedPage());
	   numberofsheets.isSummaryDisplayed();
	   Assert.assertTrue(PendingTimesheetSummary.isSummaryDisplayed());
   }
   //@Test
   public void checkingPayslipAndInvoiceButtonIsDisplayed() {
	   Login in= new Login(driver);
	   in.login("carol","1q2w3e4r");	 
	   Home click= new Home(driver);
	   click.gettingWelcomeText();
	   Assert.assertTrue(Home.gettingWelcomeText());
	   click.clickOnTimesheet();
	   CheckingPayslipButtonInvoiceButton generate= new CheckingPayslipButtonInvoiceButton(driver);
	   generate.getTextOfDisplayedPage();
	   Assert.assertTrue(CheckingPayslipButtonInvoiceButton.getTextOfDisplayedPage());
	   generate.isPayslipInvoiceButtonDisplayed();
	   Assert.assertTrue(generate.isPayslipInvoiceButtonDisplayed());
	   
   }
}
