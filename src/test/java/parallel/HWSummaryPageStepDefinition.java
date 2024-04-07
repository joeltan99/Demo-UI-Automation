package parallel;

import io.cucumber.java.en.When;
import pages.HWSummaryPage;

public class HWSummaryPageStepDefinition extends Commons {

    HWSummaryPage hwsummary = new HWSummaryPage(driver);
    @When("user clicks on View all submissions")
    public void user_clicks_on_view_all_submissions() {
        hwsummary.click_hwsummary();
    }
}
