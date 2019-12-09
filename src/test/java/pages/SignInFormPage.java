package pages;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class SignInFormPage extends BasePage{
    public SignInFormPage(WebDriver browser) {
        super(browser);
    }
    public SignInFormPage selectTitle(){
        //Select title
        browser.findElement(By.id("id_gender2")).click();

        return this;
    }

    public SignInFormPage firstName(String firstName){
        //Fill in first name
        browser.findElement(By.id("customer_firstname")).sendKeys(firstName);

        return this;
    }

    public SignInFormPage lastName(String lastName){
        //Fill in last name
        browser.findElement(By.id("customer_lastname")).sendKeys(lastName);

        return this;
    }

    public SignInFormPage checkEmailFilled(String emailFilled){
        //Checks if the email has already been filled
        String validEmail = browser.findElement(By.id("email")).getAttribute("value");
        assertEquals(emailFilled, validEmail);

        return this;
    }

    public SignInFormPage password(String password){
        //Fill in password
        browser.findElement(By.id("passwd")).sendKeys(password);

        return this;
    }

    public SignInFormPage dayOfBirth(String day){
        //Select day of birth
        WebElement selectDays = browser.findElement(By.id("days"));
        new Select(selectDays).selectByValue(day);

        return this;
    }

    public SignInFormPage monthOfBirth(String month){
        //Select month of birth
        WebElement selectMonth = browser.findElement(By.id("months"));
        new Select(selectMonth).selectByValue(month);

        return this;
    }

    public SignInFormPage YearOfBirth(String year){
        //Select year of birth
        WebElement selectYear = browser.findElement(By.id("years"));
        new Select(selectYear).selectByValue(year);

        return this;
    }

    public SignInFormPage selectNewsletter(){
        //Select newsletter
        browser.findElement(By.id("newsletter")).click();

        return this;
    }

    public SignInFormPage firstNameAddress(String firstNameAddress){
        //Fill in first name address
        browser.findElement(By.id("firstname")).clear();
        browser.findElement(By.id("firstname")).sendKeys(firstNameAddress);

        return this;
    }

    public SignInFormPage lastNameAddress(String lastNameAddress){
        //Fill in last name address
        browser.findElement(By.id("lastname")).clear();
        browser.findElement(By.id("lastname")).sendKeys(lastNameAddress);

        return this;
    }

    public SignInFormPage companyName(String company){
        //Fill in company name
        browser.findElement(By.id("company")).sendKeys(company);

        return this;
    }

    public SignInFormPage address(String address){
        //Fill in address
        browser.findElement(By.id("address1")).sendKeys(address);

        return this;
    }

    public SignInFormPage city(String city){
        //Fill in city
        browser.findElement(By.id("city")).sendKeys(city);

        return this;
    }

    public SignInFormPage state(String state){
        //Select state
        WebElement selectState = browser.findElement(By.id("id_state"));
        new Select(selectState).selectByVisibleText(state);

        return this;
    }

    public SignInFormPage postalCode(String postalCode){
        //Fill in postal code
        browser.findElement(By.id("postcode")).sendKeys(postalCode);

        return this;
    }

    public SignInFormPage country(String country){
        //Select country
        WebElement selectCountry = browser.findElement(By.id("id_country"));
        new Select(selectCountry).selectByVisibleText(country);

        return this;
    }

    public SignInFormPage mobilePhone(String mobilePhone){
        //Fill in mobile phone
        browser.findElement(By.id("phone_mobile")).sendKeys(mobilePhone);

        return this;
    }

    public SignInFormPage addressAlias(String addressAlias){
        //Fill an address alias
        browser.findElement(By.id("alias")).clear();
        browser.findElement(By.id("alias")).sendKeys(addressAlias);

        return this;
    }

    @And("^I click the 'Register' button$")
    public MyAccountPage clickOnRegister(){
        //Click the 'Register' button
        browser.findElement(By.id("submitAccount")).click();

        return new MyAccountPage(browser);
    }

    @And("^fill in the required data of my user$")
   public MyAccountPage registerCustomer(String firstName, String lastName, String emailFilled, String password, String day,
                                      String month, String year, String firstNameAddress, String lastNameAddress, String company,
                                      String address, String city, String state, String postalCode, String country, String mobilePhone,
                                      String addressAlias){
        selectTitle();
        firstName(firstName);
        lastName(lastName);
        checkEmailFilled(emailFilled);
        password(password);
        dayOfBirth(day);
        monthOfBirth(month);
        YearOfBirth(year);
        selectNewsletter();
        firstNameAddress(firstNameAddress);
        lastNameAddress(lastNameAddress);
        companyName(company);
        address(address);
        city(city);
        state(state);
        postalCode(postalCode);
        country(country);
        mobilePhone(mobilePhone);
        addressAlias(addressAlias);
        clickOnRegister();

        return new MyAccountPage(browser);
    }
}
