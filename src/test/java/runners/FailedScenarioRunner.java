package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        monochrome=false,
        features = "@target/failed.txt",
        glue = {"stepdefinitions", "hooks"},
        dryRun = false

)
public class FailedScenarioRunner {

}

/*
This runner class is used to run only failedRerun.txt file
That file only has failed scenarios if any scenario fails
That file will be empty if no scenario fails
We do not use tag or path of the features folder
 */

/*
1. How do we run only failed scenarios?
        I have rerun plugin in the runner that generates the lines for only failed scenarios
2. If all our tests passed, do we see any scenario on the .txt file?
        No b/c rerun text file stores only failed scenario lines
3. What happens when we try to rerun the failedRunner if there is no failed scenarios
last time?
        No tests will run cause the text file is empty
 */
