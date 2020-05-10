package com.Demo.AmazonBDD.testRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.demo.amazonbdd.core.TestFactory;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/feature"}
,glue= {"com.Demo.AmazonBDD.teststeps"}
,tags= {"@Sprint100"}
,plugin= {"html:target/cucumber-html-report","json:target/cucumber.json"})



public class TestRunner {
	
	@AfterClass
	public static void cleanup() {
		TestFactory.driver.close();
		TestFactory.driver.quit();
	}
}
