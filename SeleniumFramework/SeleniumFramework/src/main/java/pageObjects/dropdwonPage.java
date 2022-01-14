package pageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import resources.Base;

public class dropdwonPage extends Base {
	
	WebDriver driver;
	
	By radioBtn1 = By.xpath("//input[@value='radio1']");
	By autoTextbox = By.xpath("//input[@id='autocomplete']");
	By dropDown = By.xpath("//select[@id='dropdown-class-example']");
	
	public dropdwonPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void selectRadioBtn()
	{
		driver.findElement(radioBtn1).click();
	}
	
	public void enterText() throws InterruptedException
	{
		WebElement textbox = driver.findElement(autoTextbox);
		textbox.sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		for(WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
	}
	
	public void selectDropdownValue()
	{
		WebElement dropdwn = driver.findElement(dropDown);
		Select option = new Select(dropdwn);
		option.selectByIndex(2);
		System.out.println(option.getFirstSelectedOption().getText());
	}
	
};
