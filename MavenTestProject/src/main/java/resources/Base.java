package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.Timeout;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver initializeBrowser() throws IOException, Exception 
	{
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("D:\\MyWork\\Git\\Automation\\MavenTestProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver","D:\\MyWork\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://rahulshettyacademy.com/seleniumPractise/");
			 driver.manage().window().maximize();
			
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));				 
		}
		else 
		{
			System.out.println("HHH");
		}
		
		return driver;
	}
	
	public void getURL() throws Exception 
	{
		driver.get("http://qaclickacademy.com");
	
	}

}
