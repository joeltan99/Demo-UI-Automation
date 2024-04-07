package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

    WebDriver driver;
    // Locators
    private By userName_id = By.id("username");
    private By passWord_id = By.id("password");
    private By loginBtn_id = By.id("loginbtn");
    private By header_id = By.id("instance-15100-header");
    private By errmsg_id = By.id("loginerrormessage");


    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Functions
    public void enter_valid_username(String userNm) {
        String envUsername = System.getProperty("username");
        if(envUsername != null)
        {
            userNm = envUsername;
            driver.findElement(userName_id).sendKeys(userNm);
        }
    }

    public void enter_valid_password(String pW) {
        String envPassword = System.getProperty("password");
        if(envPassword != null)
        {
            pW = envPassword;
            driver.findElement(passWord_id).sendKeys(pW);
        }
    }

    public void enter_invalid_username(String userNm) {
        driver.findElement(userName_id).sendKeys(userNm);
    }

    public void enter_invalid_password(String pW) {
        driver.findElement(passWord_id).sendKeys(pW);
    }

    public void click_login() {
        driver.findElement(loginBtn_id).click();
    }

    public WebElement verify_header() {
        return driver.findElement(header_id);
    }

    public WebElement verify_errmsg() {
        return driver.findElement(errmsg_id);
    }
}
