package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LoginPage extends Base {
	
	public WebDriver driver;
	
	//URL : http://automationpractice.com/index.php
	
	By btnSignIN = By.xpath("//a[@class ='login']");
	By enterEmail = By.id("email_create");
	By btnSubmit = By.id("SubmitCreate");
	By radioBtnFemale = By.id("uniform-id_gender1");
	By radioBtnMale = By.id("uniform-id_gender2");
	
	By custFirstName = By.id("customer_firstname");
	By custLasttName = By.id("customer_lastname");
	By custEmail = By.id("email");
	By custPWD = By.id("passwd");
	
	By firstName = By.id("firstname");
	By lastName = By.id("lastname");
	By address = By.id("address1");
	By city = By.id("city");
	By state = By.id("id_state");
	By postcode = By.id("postcode");
	By country = By.id("id_country");
	By mobile = By.id("phone_mobile");
	By submitAccount = By.id("submitAccount");
	
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	
	public WebElement submitAccount() 
	{
		return driver.findElement(submitAccount);
	}
	
	public WebElement SignIN() 
	{
		return driver.findElement(btnSignIN);
	}
	
	public WebElement checkEmail() 
	{
		return driver.findElement(enterEmail);
	}
	
	public WebElement Submit() 
	{
		return driver.findElement(btnSubmit);
		
	}

	public WebElement RBtnFemale() 
	{
		return driver.findElement(radioBtnFemale);
		
	}
	
	public WebElement RBtnMale() 
	{
		return driver.findElement(radioBtnMale);
		
	}
	
	public WebElement custFirstName() 
	{
		return driver.findElement(custFirstName);
		
	}
	
	public WebElement custLasttName() 
	{
		return driver.findElement(custLasttName);
		
	}
	
	public WebElement custEmail() 
	{
		return driver.findElement(custEmail);
		
	}
	
	public WebElement custPWD() 
	{
		return driver.findElement(custPWD);
		
	}
	
	public WebElement firstName() 
	{
		return driver.findElement(firstName);
		
	}
	
	public WebElement lastName() 
	{
		return driver.findElement(lastName);
		
	}
	
	public WebElement address() 
	{
		return driver.findElement(address);
		
	}
	
	public WebElement city() 
	{
		return driver.findElement(city);
		
	}
	
	public WebElement state() 
	{
		return driver.findElement(state);
		
	}
	
	public WebElement country() 
	{
		return driver.findElement(country);
		
	}
	
	public WebElement mobile() 
	{
		return driver.findElement(mobile);
		
	}
	

}
