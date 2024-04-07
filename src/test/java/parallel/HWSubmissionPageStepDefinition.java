package parallel;

import io.cucumber.java.en.When;
import pages.HWSubmissionPage;

public class HWSubmissionPageStepDefinition extends Commons{
    HWSubmissionPage hwsubmission = new HWSubmissionPage(driver);

    @When("user downloads all homework submissions")
    public void user_download_all_hw() {
        hwsubmission.download_all_hw();
    }
}
