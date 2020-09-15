package software_assignment1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "test_cases",
                 plugin = "html:target/cucumber/wikipedia.html",
                 monochrome = true,
                 snippets = SnippetType.CAMELCASE,
                 glue = {"software_assignment1"},
                 strict = true)


public class AcceptanceTests {

}
