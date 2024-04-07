package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ModulePage {
    WebDriver driver;
    // Locators
    private By hwfolder_xpath = By.xpath("/html/body/div[3]/div[3]/div/div/section/div/div/ul/li[7]/div[3]/ul/li[1]/div/div/div[2]/div/a/span");

    // Constructor
    public ModulePage(WebDriver driver) {
        this.driver = driver;
    }

    // Functions
    public void click_hwfolder() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(hwfolder_xpath).click();
    }
}
