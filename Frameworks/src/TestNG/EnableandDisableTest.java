package TestNG;

import org.testng.annotations.Test;

public class EnableandDisableTest {
	@Test(enabled=true)
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(enabled=false)
	public void test3()
	{
		System.out.println("test3");
	}
@Test(enabled=true, description="login test with valid data")
	public void test2()
	{
		System.out.println("test2");
	}

}
