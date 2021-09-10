package api.cucumber.runner;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/api/cucumber/feature/posts.feature"},
        glue = {"api.cucumber.Steps", "api/cucumber/hooks"},
        plugin = {"pretty", "junit:target/report.xml"}, tags = "@SmokeTest")
       // plugin = {"pretty", "json:target/report.json"})
       // plugin = {"pretty", "html:target/HtmlReports"})
        //dryRun = false)

public class PostRunner {
}
