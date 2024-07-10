package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/Insta/Form.feature",glue = "steps1")
public class simple_runner extends AbstractTestNGCucumberTests {

}

