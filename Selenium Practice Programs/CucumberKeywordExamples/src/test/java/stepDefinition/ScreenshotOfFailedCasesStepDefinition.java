package stepDefinition;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotOfFailedCasesStepDefinition {
    WebDriver driver ;
    String url = "https://www.google.co.in";
    String chromeDriverPath = "C:\\Users\\HP\\Documents\\Study\\Programming\\Selenium Practice Programs\\CucumberKeywordExamples\\src\\test\\resources\\chromedriver.exe";

    @Given("Launch browser window")
    public void launch_browser_window() {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        System.out.println("Instantiate Browser");
    }
    @When("Open google.co.in")
    public void open_google_co_in() {
        System.out.println("Launch URL");
        driver.get(url);
    }
    @Then("fail the scenario and capture the screenshot")
    public void fail_the_scenario_and_capture_the_screenshot() {
        System.out.println("Failing the scenario purposely");
        Assert.fail();
    }

    @AfterStep
    public void captureScreenshot(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println("Scenario Name : "+scenario.getName());
            System.out.println("Scenario ID : "+scenario.getId());
            System.out.println("Scenario Line : "+scenario.getLine());
            System.out.println("Scenario Status : "+scenario.getStatus());
            TakesScreenshot screenshotAs = ((TakesScreenshot)driver);
            File srcFile = screenshotAs.getScreenshotAs(OutputType.FILE);
            File destnFile = new File ("C:\\Users\\HP\\Documents\\Study\\Programming\\Selenium Practice Programs\\CucumberKeywordExamples\\src\\test\\java\\screenshots\\screenshot.png");
            try {
                FileUtils.copyFile(srcFile,destnFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
