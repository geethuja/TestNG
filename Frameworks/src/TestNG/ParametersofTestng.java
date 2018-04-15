package TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersofTestng {
	
	@Test
	@Parameters({"username","password"})
	public void login(@Optional("Usernameoptional") String username,@Optional("Passwordoptional") String password)
	{
		System.out.println("Username:"+username+" ,Password:"+password);
	}

}
