package com.testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		//features = "src/test/resources/Features/login.feature",
		features = "src/test/resources/Features/campaigns.feature",

		plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		glue = {"com.stepdefinition"}
)
public class TestRunner 
{
	 @AfterClass
     public static void extendReport()
   {
       Reporter.loadXMLConfig("src/test/resources/TestData/extent-config.xml");
       Reporter.setSystemInfo("user", System.getProperty("user.name"));
       Reporter.setSystemInfo("os", "Windows");
       Reporter.setTestRunnerOutput("Sample test runner output message");
   }


}
