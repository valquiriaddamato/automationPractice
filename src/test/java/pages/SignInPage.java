package pages;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage{

    public SignInPage(WebDriver browser) {
        super(browser);
    }

    public SignInPage emailSignInForm (String email){
        //Fill in the email form 'Create an account'
        browser.findElement(By.id("email_create")).sendKeys(email);

        return this;
    }

    public SignInFormPage clickOnCreateAnAccount (){
        //Click the 'Create an account' button
        browser.findElement(By.id("SubmitCreate")).click();

        return new SignInFormPage(browser);
    }

    @And("^fill in the email form 'Create an account'|I click the 'Create an account' button$")
    public SignInFormPage startRegistration(String email){
        emailSignInForm(email);
        clickOnCreateAnAccount();

        return new SignInFormPage(browser);
    }

    public SignInPage emailLoginForm (String emailLogin){
        //Fill in the email form Already registered
        browser.findElement(By.id("email")).sendKeys(emailLogin);

        return this;
    }

    public SignInPage passwordLoginForm (String passwordLogin){
        //Fill in the password form Already registered
        browser.findElement(By.id("passwd")).sendKeys(passwordLogin);

        return this;
    }

    public MyAccountPage clickOnSignInFormLogin (){
        //Click click the 'Sign In' button
        browser.findElement(By.id("SubmitLogin")).click();

        return new MyAccountPage(browser);
    }

    @And("^fill in the email form 'Already registered'|fill in the password|I click the 'Sign In' button$")
    public MyAccountPage login(String email, String password){
        emailLoginForm(email);
        passwordLoginForm(password);
        clickOnSignInFormLogin();

        return new MyAccountPage(browser);
    }
}
