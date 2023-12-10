package TestNG;

import org.testng.annotations.Test;

public class TestGroupDependency {

    static String trackingNum = null;
    @Test(groups = "smoke")
    public void test1()
    {
        System.out.println("smoke");
    }

    @Test(groups = "sanity")
    public void test2()
    {
        System.out.println("sanity");
    }

    @Test(groups = "regression")
    public void test3()
    {
        System.out.println("regression");
    }

    @Test(groups = "sanity")
    public void test4()
    {
        System.out.println("sanity");
    }

    @Test
    public void test5()
    {
        System.out.println("test5");
    }

    @Test
    public void test6()
    {
        System.out.println("test6");
    }

    @Test(groups = "regression")
    public void maintest()
    {
        System.out.println("main test()");
    }


}
