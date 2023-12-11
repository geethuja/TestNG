package TestNG;

import org.testng.annotations.Test;

public class DataProviderClasstest {

    @Test(dataProvider = "String_data", dataProviderClass = DataSupplier.class)
    public void StringArray(String s) throws Exception {
        System.out.println("single dimensional array"+ s);
    }

    @Test(dataProvider = "DP2", dataProviderClass = DataSupplier.class)
    public void MulidataProviderTest(String s) throws Exception {
        System.out.println("single dimensional array"+ s);
    }

}
