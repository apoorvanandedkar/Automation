package qaclick.MavenTestProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.GreenKart;
import pageObject.LoginPage;
import pageObject.crickBuzz;
import resources.Base;

public class TestM extends Base {

	//LandingPage l = new LandingPage(driver);
	
	
	@Test
	public void addProduct() throws Exception 
	{
		driver = initializeBrowser();
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		GreenKart gk = new GreenKart(driver);
		gk.addProduct();
	}	
	

	
}
