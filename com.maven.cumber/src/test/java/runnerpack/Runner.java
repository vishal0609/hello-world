package runnerpack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Feature"},
		glue= {"stepDefinitions"}
		,format= "pretty"
		,monochrome=true
		,plugin={"html:target/cucumber-html-report"}
		//,dryRun=true
		)
public class Runner {

}
