package testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestHelper {
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","F:\\maven\\chromedriver_win32\\chromedriver.exe"); 
	  driver=new ChromeDriver();
	  driver.get("http://www.qabible.in/payrollapp/site/login");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
