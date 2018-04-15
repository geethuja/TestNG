package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("BeforeSuite()");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Beforeclass()");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod()");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest()");
	}
	@BeforeGroups
	public void beforeGroups()
	{
		System.out.println("BeforeGroups()");
	}
	@AfterGroups
	public void afterGroups()
	{
		System.out.println("AfterGroups()");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite()");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass()");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod()");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest()");
	}
	@Test
	public void Test1()
	{
		System.out.println("Test1");
	}
	@Test
	public void Test2()
	{
		System.out.println("Test2");
	}

}
