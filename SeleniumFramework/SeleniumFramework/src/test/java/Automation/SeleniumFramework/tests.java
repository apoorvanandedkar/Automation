package Automation.SeleniumFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.dropdwonPage;
import pageObjects.multiWindow;
import pageObjects.userLogin;
import resources.Base;

public class tests extends Base {
	
	WebDriver driver;
	userLogin login;
	
	@BeforeTest
	public void initalizeBrowser() throws IOException 
	{
		driver = openBrowser();
	}
	
	@Test(dataProvider = "getData")
	public void Login(String username, String password) throws IOException 
	{

		login = new userLogin(driver);
		login.btnLogin().click();
		login.setUsername().sendKeys("username");
		login.setPassword().sendKeys("password");
		login.btnSubmit().click();
		Assert.assertTrue(login.invalidEmail());
	}
	
	@Test(groups = {"PracticeTest"},enabled = false)
	public void selectBtn() throws IOException, InterruptedException
	{
		driver = openBrowser();
		dropdwonPage dp = new dropdwonPage(driver);
		dp.selectRadioBtn();
		dp.enterText();
		dp.selectDropdownValue();		
	}
	
	@Test(groups = {"PracticeTest"},enabled = false)
	public void windowOperations() throws Exception
	{
		driver = openBrowser();
		multiWindow win = new multiWindow(driver);
		win.openMultiWindow();
		win.openTab();
		win.openLinksInNewTab();
		win.switchToAlert();
	}

	
	@DataProvider
	public Object[][] getData() 
	{
		Object[][] data = new Object[1][2];
		
		data[0][0] = "abc";
		data[0][1] = "abc123";
					
		
		return data;
		
	}
	

	
	

}
