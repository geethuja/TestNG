package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TrackingShipmentDependency {

    static String trackingNum = null;

    @Test
    public void createShipment()
    {
        System.out.println("create shipment()");
        trackingNum ="ABC123";
    }

    @Test(dependsOnMethods = {"createShipment"}, alwaysRun = true, ignoreMissingDependencies = true)
    public void trackShipment() throws Exception {
        if(trackingNum != null)
            System.out.println("Track shipment()");
        else
            throw new Exception("Invalid tracking number");
    }

    @Test(dependsOnMethods = {"createShipment"})
    public void cancelShipment() throws Exception {
        if(trackingNum != null)
            System.out.println("cancel shipment()");
        else
            throw new Exception("Invalid tracking number");
    }


}
