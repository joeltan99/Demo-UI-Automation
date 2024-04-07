package parallel;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;


public class LoginPageStepDefinition extends Commons{

    LoginPage login = null;

    @Before
    public void browserSetUp() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://distance3.sg.digipen.edu/2021sg-fall/login/index.php");
//        driver.manage().window().maximize();
    }

    @After
    public void browserShutDown() {
        driver.close();
        driver.quit();
    }

    @Given("user is on moodle login page")
    public void loginPage() {
        login = new LoginPage(driver);
    }

    @When("user enters valid username using {string}")
    public void user_enters_valid_username(String userNm) {
        login.enter_valid_username(userNm);
    }

    @And("user enters valid password using {string}")
    public void user_enters_valid_password(String pW) {
        login.enter_valid_password(pW);
    }

    @When("user enters invalid username using {string}")
    public void user_enters_invalid_username(String userNm) {
        login.enter_invalid_username(userNm);
    }

    @And("user enters invalid password using {string}")
    public void user_enters_invalid_password(String pW) {
        login.enter_invalid_password(pW);
    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button() {
        login.click_login();
    }

    @Then("user should enter the homepage")
    public void validate_homepage() {
        WebElement textHeader = login.verify_header();

        if (textHeader.isDisplayed()) {
            System.out.println("[VALIDATION] Log In Successfully: Home Page Text Header is displayed.");
        } else {
            System.out.println("[VALIDATION] Log In Successfully: Home Page Text Header is not displayed.");
        }
    }

    @Then("error message should be displayed")
    public void validate_homepage_err_messsage() {
        WebElement errMessage = login.verify_errmsg();

        if (errMessage.isDisplayed()) {
            System.out.println("[VALIDATION] Failed to Log In: Error Message is displayed.");
        } else {
            System.out.println("[VALIDATION] Failed to Log In: Error Message is not displayed.");
        }
    }
}