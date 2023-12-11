package TestNG;

import org.testng.annotations.DataProvider;

public class DataSupplier {

    @DataProvider(indices = {0,2})
    public String[] String_data()
    {
        String[] data = new String[]{
                "Geethu",
                "neethu",
                "Rahul",
                "Savio"
        };
        return  data;
    }

    @DataProvider(indices = {0,2})
    public String[] DP2()
    {
        String[] data = new String[]{
                "Savio",
                "Alex",
                "Paru",
                "jerry"
        };
        return  data;
    }
}
