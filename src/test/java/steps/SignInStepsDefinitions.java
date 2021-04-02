package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SignInPage;
import steps.BaseStepDefinitions;

public class SignInStepsDefinitions {

    private BaseStepDefinitions context;
    private WebDriver browser;
    private SignInPage signInPage;

    public SignInStepsDefinitions(BaseStepDefinitions context) {
        this.context = context;
        browser = this.context.browser;
        signInPage = new SignInPage(browser);
    }

    @Given("^I click in Sign In Link$")
    public void clickOnSignInLink(){
        signInPage.clickOnSignIn();

    }

    @When("^I login with the email (.*) and password (.*)$")
    public void login(String email, String password){
        signInPage.emailLoginForm(email);
        signInPage.passwordLoginForm(password);
        signInPage.clickOnSignInFormLogin();
    }
}
