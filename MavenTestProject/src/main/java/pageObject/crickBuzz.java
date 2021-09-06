package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.Timeout;
import resources.Base;

public class crickBuzz extends Base {
	
	WebDriver driver;
	
	By matchLink = By.linkText("SOM vs HAM - SOM Won");
	//WebElement scoreBoard = driver.findElement(By.linkText("Scorecard"));
	
	public crickBuzz(WebDriver driver) 
	{
		this.driver = driver;
		
	}
	
	public void maxValue() 
	{
		driver.findElement(matchLink).click();
		WebDriverWait wait = new WebDriverWait(driver, 20000);
		WebElement scoreBoard = driver.findElement(By.linkText("Scorecard"));
		wait.until(ExpectedConditions.visibilityOf(scoreBoard));
		scoreBoard.click();
		
		List items = driver.findElements(By.xpath("//div[@class ='cb-col cb-col-100 cb-scrd-itms']"));
		System.out.println(items.size());
		
	}

	
}
