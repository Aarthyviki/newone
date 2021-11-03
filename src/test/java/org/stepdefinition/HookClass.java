package org.stepdefinition;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.Base;

import gherkin.ast.Scenario;

public class HookClass extends Base{
	
	@Before
	public void BeforeScenario() {
    System.out.println("Scenario Start");
    launchChrome();
    loadUrl("https://www.faceook.com");
    winMax();
	}
	
	@After
	public void afterScenario() {
		closeChromeBrowser();
		System.out.println("Scenario ends");
	}
	
	
	
	@Before
	public void startTime() {
		System.out.println(new Date());
	}
	
	@After
	public void endTime() {
		System.out.println(new Date());
	}
	
	@Before
	public void beforeSce() {
		System.out.println("Before Testing");
	}
	
	@After
	public void afterSce(Scenario s) throws IOException {
		
		String name=s.getName();
		String fileName=name.replace(" ","_");
		screenshot(fileName);
		
		if (s.getName() != null) {
			
			TakesScreenshot tk=(TakesScreenshot)driver;
			tk.getScreenshotAs(OutputType.BYTES);
			
			
		}
			System.out.println("After Testing");
			
			
			
	}

	private void screenshot(String fileName) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
	
}
