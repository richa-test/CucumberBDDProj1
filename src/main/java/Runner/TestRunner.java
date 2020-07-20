package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
 //features = "C:\\selelniumtest\\CucumberBDDProj1\\src\\main\\java\\Features\\login.feature",
features = "C:\\selelniumtest\\CucumberBDDProj1\\src\\main\\java\\Features\\CreateContacts.feature",
//features = "C:\\selelniumtest\\CucumberBDDProj1\\src\\main\\java\\Features\\CreateDealsMap.feature",
 glue={"stepDefinitions"},
 format={"pretty","html:test-output","json:json-output/cucumber.json",
		 "junit:xml-output/cucumber.xml"},//this creates test-output folder  under project for the project
 dryRun=false,
 monochrome=true//to disply console output in readable form
 
 )

public class TestRunner {
}
