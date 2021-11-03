package org.stepdefinition;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.utilities.Base;

import gherkin.ast.Scenario;

public class HookClass extends Base{
	
	@Before(order=1)
	public void BeforeScenario() {
    System.out.println("Scenario Start");
    launchChrome();
    loadUrl("https://www.faceook.com");
    winMax();
	}
	
	@After(order=1)
	public void afterScenario() {
		closeChromeBrowser();
		System.out.println("Scenario ends");
	}
	
	
	
	@Before(order=2)
	public void startTime() {
		System.out.println(new Date());
	}
	
	@After(order=2)
	public void endTime() {
		System.out.println(new Date());
	}
	
	@Before(order=3)
	public void beforeSce() {
		System.out.println("Before Testing");
	}
	
	@After(order=3)
	public void afterSce(Scenario s) throws IOException {
		String name=s.getName();
		String fileName=name.replace(" ","_");
		screenshot(fileName);
			System.out.println("After Testing");
	}

	private void screenshot(String fileName) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
	
}
