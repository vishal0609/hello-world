package runnerpack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"."},
		glue= {"stepDefinitions"}
		,format= "pretty"
		,monochrome=true
		,plugin={"html:target/cucumber-html-report","rerun:target/rerun.txt"}
		//,dryRun=true
		,tags= {"@same1"}
		)
public class Runner {

}
