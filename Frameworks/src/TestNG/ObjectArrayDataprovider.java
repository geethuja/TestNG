package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.*;

public class ObjectArrayDataprovider {

/*
    @Test(dataProvider = "String_data")
    public void StringArray(String s) throws Exception {
        System.out.println("single dimensional array"+ s);
    }

    @DataProvider
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

 // integer Array
@Test(dataProvider = "Integer_data")
public void IntegerArray(Integer i) throws Exception {
    System.out.println("single dimensional array"+ i);
}

    @DataProvider
    public Integer[] Integer_data()
    {
        Integer[] data = new Integer[]{
                100,
                20,
                6,
                140
        };
        return  data;
    }

    // Object Array
@Test(dataProvider = "DP1")
public void ObjectArray(Object i) throws Exception {
    System.out.println("single dimensional array"+ i);
}

    @DataProvider
    public Object[] DP1()
    {
        Object[] data = new Object[]{
                100,
                "Geethuja",
                6,
                "Berlin"
        };
        return  data;
    }

    // Two dimensional array
@Test(dataProvider = "DP1")
public void MultiArray(String[] i) throws Exception {
    System.out.println(i[0]+" >> "+ i[1]);
}

    @DataProvider
    public String[][] DP1()
    {
        String[][] data = new String[][]{
                {"100", "Maths"},
                {"50","Science"},
                {"49","English"},
                {"99","Deutsch"}
        };
        return  data;
    }

// Jagged Array
@Test(dataProvider = "DP1")
public void JaggedArray(Object[] s) throws Exception {
    for (int i = 0; i < s.length; i++){
        System.out.println( s[i]);
    }
}

    @DataProvider
    public Object[][] DP1() {
        Object[][] data = new Object[][] {
                {"100", 123, 23, "Maths"},
                {"50","Science"},
                {"49","English", 675, 87},
                {"99",34, "Deutsch"}
        };
        return  data;
    }

    // Iterator (collections : List)
@Test(dataProvider = "DP1")
public void IteratorObject(String s) throws Exception {
        System.out.println(s);
}
    @DataProvider()
    public Iterator<String> DP1() {
        List<String> data = new ArrayList<>();
        data.add("geethuja");
        data.add("tom");
        return  data.iterator();
}
// sets
@Test(dataProvider = "DP1")
public void IteratorObject(String s) throws Exception {
        System.out.println(s);
}
    @DataProvider()
    public Iterator<String> DP1() {
        Set<String> data = new HashSet<>();
        data.add("geethuja");
        data.add("tom");
        return  data.iterator();
}

// iterator<object[]>

@Test(dataProvider = "DP1")
public void IteratorObject(String[] s) throws Exception {
    System.out.println(s[0]+ ">>" + s[1]);
}
    @DataProvider()
    public Iterator<String[]> DP1() {
        Set<String[]> data = new HashSet<>();
        data.add(new String[] {"Tom","geethuja"});
        data.add(new String[] {"tom", "Maria"});
        return  data.iterator();
    }

    //indices
  */
@Test(dataProvider = "String_data")
public void StringArray(String s) throws Exception {
    System.out.println("single dimensional array"+ s);
}

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
}

