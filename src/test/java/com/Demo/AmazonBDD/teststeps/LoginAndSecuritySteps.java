package com.Demo.AmazonBDD.teststeps;

import com.demo.amazonbdd.pom.LoginAndSecurity;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class LoginAndSecuritySteps {

	@Then("^user is able to login successfully$")
	public void user_is_able_to_login_successfully()  {
	    try {
			LoginAndSecurity obj= new LoginAndSecurity();
			obj.validateUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
