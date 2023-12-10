package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
// @Ignore
public class IgnoreTest {

    @Ignore
    @Test
    public void signUp(){
        System.out.println("1. SignUp");
    }


    @Test
    public void Login(){
        System.out.println("2. Login");
    }

    @Test
    public void searchForTheFlight(){
        System.out.println("3. Search for the fight");
    }

    @Test
    public void bookTheFlight(){
        System.out.println("4. Book flight");
    }

    @Test
    public void saveTicket(){
        System.out.println("5. Save ticket");
    }

    @Test(enabled = false)
    public void logout(){
        System.out.println("6. Logout");
    }
}
