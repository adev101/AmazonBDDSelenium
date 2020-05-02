package com.Demo.AmazonBDD.teststeps;

import java.io.IOException;

import com.demo.amazonbdd.core.TestFactory;
import com.demo.amazonbdd.utilities.TestConfig;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class LaunchSteps {

	@Given("^Amazon portal is launched$")
	public void amazon_portal_is_launched() {
	    String browser;
		try {
			browser = TestConfig.getConfigDetails().get("browser");
			TestFactory.getURL(browser);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
