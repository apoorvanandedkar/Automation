package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
//import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.activation.FileTypeMap;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	
	WebDriver driver;
	public Properties prop;
	
	public WebDriver openBrowser() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\MyWork\\Git\\Automation\\SeleniumFramework\\SeleniumFramework\\src\\main\\java\\resources\\data.propreties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\MyWork\\chromedriver_win32\\chromedriver.exe");			
			driver = new ChromeDriver();
			driver.get("https://courses.rahulshettyacademy.com/");
			//https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Fgitlogin
			//https://www.rahulshettyacademy.com/AutomationPractice/
			//https://courses.rahulshettyacademy.com/
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
		}	
		
		return driver;
	}
	
	public void getURL() throws Exception 
	{
		driver.get("http://qaclickacademy.com");
	}
	
	public String takeScreenshot(String testCaseName, WebDriver driver) throws IOException 
	{
		TakesScreenshot shot = (TakesScreenshot)driver;
		File src =  shot.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\report\\"+testCaseName+".png";
		org.apache.commons.io.FileUtils.copyFile(src, new File (destinationFile));
		return destinationFile;
	}
}
