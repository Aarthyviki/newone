package org.stepdefinition;




import org.utilities.Base;
import org.utilities.FBloginPagePojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;

public class Fbstepdefinition extends Base {

	
	@Given("The user should launch the chrome browser")
	public void the_user_should_launch_the_chrome_browser() {
         launchChrome();
	    
	}

	@When("The user should type the url")
	public void the_user_should_type_the_url() {
	   loadUrl("https://www.facebook.com");
	}

	@When("The user should maximise the window")
	public void the_user_should_maximise_the_window() {
	   winMax();
	}

	@When("The user should type the invalid username {string}and invalid password {string}")
	public void the_user_should_type_the_invalid_username_and_invalid_password(String string, String string2) {
		FBloginPagePojo f= new FBloginPagePojo();
		
	fill(f.getTxtUser(), string);
	fill(f.getTxtPass(), string2);
	}

	@When("The user should click the login button")
	public void the_user_should_click_the_login_button() throws InterruptedException {
		FBloginPagePojo f= new FBloginPagePojo();
	    btnclick(f.getBtnLogin());
	    Thread.sleep(3000);
	}

	@Then("The user should navigate to incorrect credential page")
	public void the_user_should_navigate_to_incorrect_credential_page() {
	   printTitle();
	}


}
