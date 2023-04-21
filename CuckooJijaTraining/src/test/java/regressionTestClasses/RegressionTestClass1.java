package regressionTestClasses;

import org.testng.annotations.*;
import utilities.ConfigPropertyReader;

public class RegressionTestClass1 {
    @BeforeSuite
    public void beforeSuiteMethod1(){
        System.out.println("beforeSuiteMethod1 - RegressionTestClass1");
    }

    @AfterSuite
    public void afterSuiteMethod1(){
        System.out.println("afterSuiteMethod1 - RegressionTestClass1");
    }

    @BeforeTest
    public void beforeTestMethod(){
        System.out.println("beforeTestMethod - RegressionTestClass1");
    }

    @AfterTest
    public void afterTestMethod(){
        System.out.println("afterTestMethod - RegressionTestClass1");
    }

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("beforeClassMethod - RegressionTestClass1");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("afterClassMethod - RegressionTestClass1");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod - RegressionTestClass1");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod - RegressionTestClass1");
    }

    @Test (enabled = false)
    public void test1RegressionSuite(){
        System.out.println("Test 1 - Regression Suite");
    }

    @Test (priority = 1)
    public void test2RegressionSuite() {
        String environmentName = ConfigPropertyReader.environment;
        System.out.println("Test 2 - Regression Suite");
        System.out.println("Log in to environment ");
        if(environmentName.equalsIgnoreCase("UAT"))
            System.out.println("Login Success");
        else
            System.out.println("Log in Failure");
    }

    @Test (invocationTimeOut = 2000L)
    public void test3RegressionSuite() throws InterruptedException {
        System.out.println("Test 3 - Regression Suite");
        Thread.sleep(10000);
    }
}
