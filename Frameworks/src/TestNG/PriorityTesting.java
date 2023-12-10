package TestNG;

import org.testng.annotations.Test;

public class PriorityTesting {

    /*
    Fight booking system
		1. Sign up
		2. Login
		3. Search for the fight
		4. Book flight
		5. Save ticket
		6. Logout
     */

    @Test(priority = 1)
    public void signUp(){
        System.out.println("1. SignUp");
    }

    @Test(priority = 2)
    public void Login(){
        System.out.println("2. Login");
    }

    @Test(priority = 3)
    public void searchForTheFlight(){
        System.out.println("3. Search for the fight");
    }

    @Test(priority = 4)
    public void bookTheFlight(){
        System.out.println("4. Book flight");
    }

    @Test(priority = 5)
    public void saveTicket(){
        System.out.println("5. Save ticket");
    }

    @Test(priority = 6)
    public void logout(){
        System.out.println("6. Logout");
    }

}
