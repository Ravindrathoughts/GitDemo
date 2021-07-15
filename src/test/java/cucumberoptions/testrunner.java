package cucumberoptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="src/test/java/features",glue={"stepDefinitions"})
public class testrunner {
	
	//MyStepDefinitions md=new MyStepDefinitions();  no need to create object/instance of a class

	

}
