package com.stepdefnition;

import com.baseclass.BaseClass;
import com.pojo.Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Code extends BaseClass{
	Pojo a;
	@Given("To launch the browser and maximise it")
	public void to_launch_the_browser_and_maximise_it() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of the Faceboook")
	public void to_launch_the_url_of_the_Faceboook() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("To Pass the data in {string} in email field")
	public void to_Pass_the_data_in_in_email_field(String string) {
		a=new Pojo();
	    passText(string, a.getEmail());
	}

	@When("To Pass the data in {string} in password field")
	public void to_Pass_the_data_in_in_password_field(String string) {
		a=new Pojo();
	   passText(string, a.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() throws InterruptedException {
		a=new Pojo();
	    click(a.getLogin());
	    Thread.sleep(10000);
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeEntireBrowser();
	}


}
