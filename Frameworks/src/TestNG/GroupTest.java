package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupTest {
	@BeforeClass(groups={"Sanity","Regression","database"})
	public void setup()
	{
		System.out.println("Setup()");
	}
	@Test(groups={"Sanity", "functional"})
	public void test1()
	{
		System.out.println("groups={Sanity}");
	}
	@Test(groups={"Sanity","database"})
	public void test2()
	{
		System.out.println("groups={Sanity,database}");
	}
	@Test(groups={"Regression"})
	public void test3()
	{
		System.out.println("groups={Regression}");
	}
	@Test(groups={"database"})
	public void test4()
	{
		System.out.println("groups={database}");
	}
	@Test(groups={"Sanity","Regression"})
	public void test5()
	{
		System.out.println("groups={Sanity,Regression}");
	}

}
