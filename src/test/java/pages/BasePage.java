package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage{
    protected WebDriver browser;

    public BasePage(WebDriver browser){
        this.browser = browser;
    }

    public String captureUsername(){
        //Capture username
        return browser.findElement(By.xpath("//div[@class=\"header_user_info\"]/a[@class=\"account\"]")).getText();
    }
}
