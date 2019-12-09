package tests;

import io.cucumber.java.en.Then;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.MyAccountPage;
import support.Web;

import static org.junit.Assert.assertEquals;

public class LoginTest {
    private WebDriver browser;

    @Before
    public void setUp(){
        browser = Web.createChrome();
    }

    @Test
    @Then("^the system must login successfully$")
    public void testLogin(){
        String captureTextUsername = new HomePage(browser)
                .clickOnSignIn()
                .login("val2@teste.com", "123456")
                .captureUsername();
        assertEquals(captureTextUsername,"Val DAmato" );

        String captureTextMyAccount = new MyAccountPage(browser)
                .captureMyAccountPage();
        assertEquals(captureTextMyAccount,"MY ACCOUNT");
    }

    @After
    public void tearDown(){
    browser.quit();
    }
}