package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class userLogin extends Base {

	WebDriver driver;
	
	By btnLogin = By.xpath("//a[@class ='theme-btn']");
	By txtboxUsername = By.id("email");
	By txtboxPassword = By.id("password");
	By btnSubmit = By.xpath("//input[@value ='Login']");
	By errorMsg = By.cssSelector("div.auth-flash-error");
	
	public userLogin(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement btnLogin() 
	{
		return driver.findElement(btnLogin);
	}
	
	public WebElement setUsername() 
	{
		return driver.findElement(txtboxUsername);
	}
	
	public WebElement setPassword() 
	{
		return driver.findElement(txtboxPassword);
	}
	
	public WebElement btnSubmit() 
	{
		return driver.findElement(btnSubmit);
	}
	
	public boolean invalidEmail() 
	{
		return driver.findElement(errorMsg).isDisplayed();
	}
	
}
