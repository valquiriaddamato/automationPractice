package support;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    @Given("^that I access the 'Automation practice' page$")
    public static WebDriver createChrome(){
        // Opening the browser
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        browser.manage().window().maximize();

        //Navigating to the automation practice page
        browser.get("http://www.automationpractice.com/index.php");
        browser.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        return browser;
    }
}
