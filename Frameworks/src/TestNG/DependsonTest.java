package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonTest {
	
	
	@Test
	public void login()
	{
		System.out.println("login()");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods={"login","logout"})
	public void test1()
	{
		System.out.println("test1");
	
	}
	@Test(dependsOnMethods={"login"})
	public void logout()
	{
		System.out.println("logout()");
	}
	

}
