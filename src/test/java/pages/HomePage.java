package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver browser) {
        super(browser);
    }

    /*public SignInPage clickOnSignIn(){
        //Click on 'Sign In'
        browser.findElement(By.linkText("Sign in")).click();

        return new SignInPage(browser);
    }*/
}
