package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class multiWindow {
	
	WebDriver driver;
	
	By openWindow = By.id("openwindow");
	By openTab = By.id("opentab");
	By btnAlert = By.id("alertbtn");
	
	
	public multiWindow(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void openMultiWindow()
	{
		driver.findElement(openWindow).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		Iterator<String>It = win.iterator();
		while(It.hasNext())
		{
			String child = It.next();
			//driver.switchTo().window(child);
			System.out.println(driver.switchTo().window(child).getTitle());
		}
		System.out.println(driver.switchTo().window(parentWindow).getTitle());
	}
	
	public void openTab()
	{
		driver.findElement(openTab).click();
		Set<String> win = driver.getWindowHandles();
		Iterator<String>it = win.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}
	
	public void openLinksInNewTab()
	{
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		WebElement firstColumn = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]"));
		int totalLinks = firstColumn.findElements(By.tagName("a")).size();
		for(int i=0; i<totalLinks;i++)
		{
			String ctrlClick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstColumn.findElements(By.tagName("a")).get(i).sendKeys(ctrlClick);
		}
		
		Set<String> win = driver.getWindowHandles();
		Iterator<String>it = win.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	 }
	
	public void switchToAlert() throws Exception
	{
		driver.findElement(btnAlert).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.accept();	
	}	

}
