package pageObject;


import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class GreenKart extends Base
{
	public WebDriver driver;
	
	By product = By.cssSelector("h4.product-name");
	By buttonAddToCart = By.xpath("//div[@class ='product-action']/button");
	
	public GreenKart(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void addProduct() 
	{
		//String[] addItem = {""};
		
		List<WebElement> productList = driver.findElements(product);
		System.out.println(productList.size());
		int c = productList.size();
		 
		for(int i=0; i<c;i++) 
		{
			String name = productList.get(i).getText();
			
			if(name.equalsIgnoreCase("Brocolli - 1 Kg"))
			{
				driver.findElements(buttonAddToCart).get(i).click();
			}				
		}
		
		String cartCount = driver.findElement(By.xpath("//span[@class= 'cart-count']")).getText();
		assertEquals(cartCount, "1");
	}
	
}
