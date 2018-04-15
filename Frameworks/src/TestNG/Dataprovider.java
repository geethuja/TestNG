package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	
	@DataProvider(name="data")
	public Object[][] login_data()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="neethu";
		obj[0][1]="Juan";
		
		obj[1][0]="Geethu";
		obj[1][1]="Juan";
		 return obj;
	}
	
	@Test(dataProvider="data")
	public void test1(String username,String password)
	{
		System.out.println("username"+"password");
	}

}
