package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.MyAccountPage;

public class MyAccountStepsDefinitions {
    private BaseStepDefinitions context;
    private WebDriver browser;
    private MyAccountPage myAccountPage;

    public MyAccountStepsDefinitions(BaseStepDefinitions context) {
        this.context = context;
        browser = this.context.browser;
        myAccountPage = new MyAccountPage(browser);
    }

    @Then("^should I view the page name (.*) in the My account page$")
    public void nameMyAccountPage(String namePage){
        Assert.assertEquals(namePage, myAccountPage.captureMyAccountPage());
    }

    @Then("^should I view the name (.*) in the user logged in$")
    public void nameUser(String userName){
        Assert.assertEquals(userName, myAccountPage.captureUsername());
    }
}
