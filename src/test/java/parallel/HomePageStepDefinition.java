package parallel;

import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageStepDefinition extends Commons{
    HomePage home = new HomePage(driver);

    @When("user clicks on csd-1240-e")
    public void user_clicks_on_module() {
        home.click_module();
    }
}
