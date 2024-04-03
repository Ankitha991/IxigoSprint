package Runner2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="Features",glue="StepDefinitions",plugin={"pretty","junit:target/cucumberReports.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"json:target/cucumberReports.json"})

public class Runner4 extends AbstractTestNGCucumberTests{

}
