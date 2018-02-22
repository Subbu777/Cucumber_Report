package TestMethods;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class) 


@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
        features = { "D:\\Sel\\MVN\\src\\test\\java\\FeaturesFiles\\cucumberJava.feature" },
        glue = { "TestMethods" }, tags={"@Login_data"})



















/*@CucumberOptions(
		features = "D:\\Sel\\MVN\\src\\test\\java\\FeaturesFiles\\cucumberJava.feature"
		,glue={"TestMethods"},
				 plugin = { "pretty", "html:target/site/cucumber-reports","json:target/cucumber.json" }
		)
*/
public class runTest {

}
