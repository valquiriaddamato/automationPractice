package pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver browser) {
        super(browser);
    }

    @And("^I have registration$")
    @When("^I click on 'Sign In'$")
    public SignInPage clickOnSignIn(){
        //Click on 'Sign In'
        browser.findElement(By.linkText("Sign in")).click();

        return new SignInPage(browser);
    }
}
