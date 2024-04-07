package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HWSummaryPage {
    WebDriver driver;
    // Locators
    private By hwsummary_xpath = By.xpath("/html/body/div[2]/div[3]/div/div/section/div[2]/div[2]/center/div/a[1]");

    // Constructor
    public HWSummaryPage (WebDriver driver) {
        this.driver = driver;
    }

    // Functions
    public void click_hwsummary() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(hwsummary_xpath).click();
    }
}
