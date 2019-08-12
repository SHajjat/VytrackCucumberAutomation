package com.vytrack.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "html:target/defualt-cucumber-reporting" ,
	    features = "src/test/resources/com/vytrack/feature",
		glue = "com.vytrack.step_definetions",
		tags = "@VYC5-32" ,
		dryRun = false
		
		
)


public class cukesRunner {
}
