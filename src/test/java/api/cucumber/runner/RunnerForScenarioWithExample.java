package api.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/api/cucumber/feature/loginwithexample.feature"}, glue = {"api.cucumber.Steps"}, dryRun = false)

public class RunnerForScenarioWithExample {
}
