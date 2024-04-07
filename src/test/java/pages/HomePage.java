package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;
    // Locators
    private By module_xpath = By.xpath("/html/body/div[3]/div[3]/div/div/section[1]/div/aside/section/div/div/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div/div[1]/a/span[3]");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Functions
    public void click_module() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(module_xpath).click();
    }
}
