package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/parallel",glue={"parallel"},
                monochrome = true,
                plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                tags="@Regression")
public class TestRunner {
}



// Single Tag
// tags="@Positive"

// Multiple Tags with AND OR conditions
// tags = {"@Positive" or @smoke and @Regression}

// Skip/Ignore Tags
// tags = {"@Positive" or @smoke and not @Regression}



//@CucumberOptions(features="src/test/resources/parallel",glue={"parallel"},
//        monochrome = true, plugin = {"pretty", "html:target/HTMLReports",
//        "json:target/JSONReports/report.json",
//        "junit:target/JUnitReports/report.xml"},
//        tags="@Positive")