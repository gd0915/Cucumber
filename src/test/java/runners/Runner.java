package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        dryRun = false,
        tags = "@parameterizing1"

)

public class Runner {
}
/*
 features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
 glue = "stepdefinitions", //PATH OF STEP DEFINITIONS
 dryRun = false //IF dryRun = true. RUN DRY. JUST GIVE ME THE MISSING STEP DEFINITIONS. DON'T RUN THE TEST CASES.
 dryRun= false when we are doing test execution. dryRun=true when we are generation missing step definitions
 dryRun = true : RUN DRY! Just give me the step definitions. Do not run test cases. It will save time.
 */

/*
@RunWith is used to run the class. Without this, Runner class will not be runnable
@CucumberOptions is used to add feature path, step definition path,tags, dryRun, report plug ins
tags : this marks which feature file to run. We add this tag in the feature files to run specific test cases.
 */

/*
When you run Runner, it will go to feature file, and start execution from top to bottom.
If there is any step matching, Java will find that matching 'step definition', and it will be executed.
If there is no match then Cucumber will generate template for us in the console.
 */
