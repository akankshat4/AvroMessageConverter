package sanityTestClasses;

import org.testng.annotations.Test;
import utilities.ConfigPropertyReader;

public class SanityTestSet1 {
    @Test (priority = 1, groups = {"Group1"})
    public void test1SanitySuite(){
        System.out.println("Test 1 - Sanity Suite");
    }

    @Test (dependsOnGroups = {"Group1"}, groups = {"Group2"}, alwaysRun = true)
    public void test2SanitySuite(){
        System.out.println("Test 2 - Sanity Suite");
        System.out.println(ConfigPropertyReader.testSheetName);
    }

    @Test (dependsOnGroups = {"Group2"})
    public void test3SanitySuite(){
        System.out.println("Test 3 - Sanity Suite");
    }

    @Test (groups = {"Group1"})
    public void test4SanitySuite(){
        System.out.println("Test 4 - Sanity Suite");
    }
}
