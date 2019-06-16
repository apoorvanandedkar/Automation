package seleniumTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BankXYZ {
  
	 WebDriver driver;
	 
	 public void Wait() 
	 {
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
  
	 @BeforeTest
	 public void openBrowser() 
	 {
	  
		 System.setProperty("webdriver.chrome.driver","D:\\MyWork\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 Wait();
		 driver.get("http://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		 Wait();
	 }
  
	 @Test
	 public void customerLogin() 
	 {
		 
	  driver.findElement(By.xpath("//button[contains(.,'Customer Login')]"));
	  Wait();
	 }
  
	 @AfterTest
	 public void closeBrowser() 
	 {
		// driver.close();
	 }

}
