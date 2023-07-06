package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(
        features = "src/test/resources/Features", glue = {"StepDefinitions"},
        monochrome = true,
//        plugin = {"pretty", "html:taget/HTMLReports"}
//        plugin = {"pretty", "json:taget/JSONReports/regression_report.json"}
//        plugin = {"pretty", "junit:taget/JUnitReports/report.xml"},
        plugin = {"pretty",
                "junit:taget/JUnitReports/report.xml",
                "json:taget/JSONReports/regression_report.json",
                "html:taget/HTMLReports"
        },
        tags = "@demo"

)
public class TestRunner {
}
