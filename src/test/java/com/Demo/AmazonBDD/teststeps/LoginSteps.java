package com.Demo.AmazonBDD.teststeps;

import com.demo.amazonbdd.pom.Login;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class LoginSteps {

	
	@When("^enter user id$")
	public void enter_user_id() throws Throwable {
		Login obj= new Login();
		Thread.sleep(2000);
		obj.enterUser();
	}

	@When("^enter password and click on submit$")
	public void enter_password() throws Throwable {
		Login obj= new Login();
		obj.enterPassword();
	}

}
