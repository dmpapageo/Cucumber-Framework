package CucumberFramework.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
		//features location
		features = {"src/test/java/CucumberFramework/featureFiles/"},
		//glue: nickname for step files
		glue = {"CucumberFramework.steps"},
		
		monochrome = true,
		//dryRun true will execute the feature file but NOT the Selenium code/	false will execute the code
		dryRun = false,
		//choosing the category of tests to run
		tags = {"@submitValidForm"},
		//pretty is legible format
		plugin = {"pretty", 
				"html:target/cucumber",
				"json:target/cucumber.json", 
				"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)

public class MainRunner {
}
