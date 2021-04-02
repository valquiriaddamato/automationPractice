package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class RegisterCustomerTest {
    private WebDriver browser;

    @Before

    @Test
    public void testRegisterCustomer(){
        /*Integer numeroRandom = new Random().nextInt();
        String emailRandom = "val"+numeroRandom+"@teste.com";

        String captureTextUsername = new SignInPage(browser)
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
    */}

    @After
    public void tearDown(){
       browser.quit();
    }
}
