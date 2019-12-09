package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver browser) {
        super(browser);
    }

    public String captureMyAccountPage(){
        //Capture my account page
        return browser.findElement(By.xpath("//div[@class=\"columns-container\"]/div/div[3]/div[@id=\"center_column\"]/h1")).getText();
    }
}