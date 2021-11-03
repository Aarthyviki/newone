package org.runner;

import org.junit.After;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.stepdefinition",dryRun=false,
strict=false, snippets= SnippetType.CAMELCASE, tags= {"not @sanity"}, plugin="pretty", plugin="usage")
public class TestRunnerclass {
	
	
	@After
	public static void report() {
			
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Report\\FBLanding.Json");
	}

}
