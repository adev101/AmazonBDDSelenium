package com.Demo.AmazonBDD.teststeps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.demo.amazonbdd.pom.ProdSearchResult;


public class ProductResultSteps {
		
		
		@Then("^Lists all result on first page and saves the result price in same excel$")
		public void list_all_results() {
			try {
				Thread.sleep(5000);
				ProdSearchResult obj= new ProdSearchResult();
				obj.List();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

}
