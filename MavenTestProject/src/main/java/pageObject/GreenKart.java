package pageObject;


import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
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
		String[] addItem = {"Cucumber","Brocolli","Beetroot"};
		
//		ArrayList al = new ArrayList();
//		al.add(0, "a");
//		System.out.println(al.get(0));
		
		
		List<WebElement> productList = driver.findElements(product);
		System.out.println(productList.size());
		int c = productList.size();
		 
		for(int i=0; i<c;i++) 
		{
			String name[] = productList.get(i).getText().split("-");
			String exactName = name[0].trim();
			
			
			List itemNeeded = Arrays.asList(addItem);
			
			if(itemNeeded.contains(exactName))
			{
				driver.findElements(buttonAddToCart).get(i).click();
			}				
		}
		
		String cartCount = driver.findElement(By.xpath("//div[@class= 'cart-info']/table/tbody/tr[1]/td[3]/strong")).getText();
		assertEquals(cartCount, "3");
	}
	
}
