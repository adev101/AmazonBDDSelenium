package com.Demo.AmazonBDD.teststeps;

import com.demo.amazonbdd.pom.Account;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class AccountSteps {
	
	@Then("^user clicks on profile$")
	public void user_clicks_on_profile()  {
		try {
			Thread.sleep(2000);
			Account obj= new Account();
			obj.clickAccountDetails();
			Thread.sleep(2000);
			obj.clickLoginSecurity();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
