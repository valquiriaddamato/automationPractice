package tests;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.MyAccountPage;
import support.Web;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class RegisterCustomerTest {
    private WebDriver browser;

    @Before
    public void setUp(){
        browser = Web.createChrome();
    }

    @Test
    @Then("^the system must successfully register$")
    @And("^should I view the 'My account' page$")
    public void testRegisterCustomer(){
        Integer numeroRandom = new Random().nextInt();
        String emailRandom = "val"+numeroRandom+"@teste.com";

        String captureTextUsername = new HomePage(browser)
                .clickOnSignIn()
                .startRegistration(emailRandom)
                .registerCustomer("Val", "DAmato",emailRandom , "123456","6",
                        "12", "1990", "Val", "DAmato", "XPTO",
                        "Times Square, 1020","New York","New York","10036", "United States",
                        "+1543456789","Fifth Avenue, 2000").captureUsername();
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
