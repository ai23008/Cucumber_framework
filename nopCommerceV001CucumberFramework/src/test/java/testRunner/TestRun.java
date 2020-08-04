package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		         
		         features="C:\\Users\\ASIF\\Desktop\\Cucumber\\nopCommerceV001CucumberFramework\\Features\\Login.feature",
		         glue="stepDefination",
		         dryRun=false,
		         monochrome=true,
		         plugin= {"pretty","html:test-output"}
		
		
		             )


public class TestRun {

}
