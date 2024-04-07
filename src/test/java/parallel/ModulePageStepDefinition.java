package parallel;

import io.cucumber.java.en.When;
import pages.ModulePage;

public class ModulePageStepDefinition extends Commons{

    ModulePage module = new ModulePage(driver);
    @When("user clicks on HW 4 - E")
    public void user_clicks_on_hw_folder() {
        module.click_hwfolder();
    }
}
