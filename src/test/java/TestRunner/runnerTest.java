package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\features",
		glue="StepDefination",
		dryRun=false,
		plugin={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} 
				)
public class runnerTest {

}
