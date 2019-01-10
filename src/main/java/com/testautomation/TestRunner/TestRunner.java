package com.testautomation.TestRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features="src\\main\\java\\com\\testautomation\\features"   //\\freeCRM-ScOutline.feature" // to run all or specific feature file
		,glue= {"com.testautomation.StepDef"}  //package/folder for steps
		,plugin= {"pretty","html:target\\site\\cucumber-pretty", "json:target\\cucumber.json"}   //reporting formats e.g.: , "junit:junit_xml\\cucumber.xml"
		,monochrome= true  //display the console output: readable format				
		,strict=false  //if true: undefined steps fail entire execution
		,dryRun= false   // change to true to verify if all step = method mappings exists
		,tags= {"@UATTesting"}  //"tag1,tag2"="or","tag1" , "tag2"="and", ~tag=all but,  ; selected tag scenarios in feature file
		)
public class TestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;
	

	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][] features(){
		return testNGCucumberRunner.provideFeatures();
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		testNGCucumberRunner.finish();
	}
}
