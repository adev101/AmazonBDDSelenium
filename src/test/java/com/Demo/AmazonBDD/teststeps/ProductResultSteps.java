package com.Demo.AmazonBDD.teststeps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.demo.amazonbdd.core.TestFactory;
import com.demo.amazonbdd.pom.ProdSearchResult;


public class ProductResultSteps {
		
		
		@Then("^Lists all result on first page and saves the result price in same excel$")
		public void list_all_results() {
			try {
				Thread.sleep(5000);
				ProdSearchResult obj= new ProdSearchResult();
				obj.List();
				TestFactory.driver.close();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		@When("^User filters for \"([^\"]*)\" in step$")
		public void apply_filter(String filter_name) {
			ProdSearchResult obj= new ProdSearchResult();
			obj.apply_filter(filter_name);
		}
		


		@Then("^Lists result with minimum price on first page$")
		public void list_min_results() {
			try {
				Thread.sleep(5000);
				ProdSearchResult obj= new ProdSearchResult();
				obj.ListMin();
				TestFactory.driver.close();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
