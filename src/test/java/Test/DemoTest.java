package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest 
{
	@BeforeMethod
	public void setUp()
	{
		
		System.out.println("Before Method Execute..");
	}
	
	@Test
	public void LoginTest()
	{
		int i = 5;
		for(int k=0;k<i;k++)
		{
			System.out.println(k);
		}
		System.out.println("Login Test");
	}
	
	@AfterMethod
	public void TearDown()
	{
		System.out.println("Close the Browser");
	}
}
