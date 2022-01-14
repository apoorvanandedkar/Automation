package Automation.SeleniumFramework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demoTests {
	

	
	@Test
	public void testMethod()
	{
		System.out.println("testMethod");
	}
	
	@Test(enabled = false)
	public void reverseString()
	{
		String value = "I love Pune";
		String rev = "";
		
		String[] s = value.split("\\s+");
//		System.out.println(s[0]);
//		System.out.println(s[1]);
//		System.out.println(s.length);
		
		for(int i=s.length-1; i>=0; i--) 
		{
			rev = rev + s[i];
			
		}
		System.out.println(rev);
	}

}
