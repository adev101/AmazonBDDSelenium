package com.Demo.AmazonBDD.teststeps;

import com.demo.amazonbdd.pom.Home;
import com.demo.amazonbdd.pom.ProdSearchResult;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.demo.amazonbdd.core.TestFactory;
import com.demo.amazonbdd.pom.ExcelInput;

public class HomeSteps {

	static String prdName;
	
	@When("^navigate to login page$")
	public void navigate_to_login_page()  {
		try {
			Home obj= new Home();
			obj.hoverSignIn();
			obj.clickSignIn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@When("^user is at home page$")
	public void user_is_at_home_page() {
		TestFactory.navigateToHome();
		Home obj= new Home();
		obj.getTitle();
				
	}

	
	@When("^user searches for the product$")
	public void search_product() {
		try {
			ExcelInput obj= new ExcelInput();
			prdName=obj.read_input_file();
			
			Home objHome= new Home();
			objHome.searchProd(prdName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
    @When("^user hovers on 'Account and Lists' link$")
	public void hover_account_link() {
		try {
			Home obj= new Home();
			obj.hover_account();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    @When("^user clicks on 'your wish list' link$")
	public void click_wish_list() {
		try {
			Home obj=new Home();
			obj.navigateWishList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    

    
    @When("^user clicks on logout link$")
	public void user_click_logout_link() {
		try {
			Home obj= new Home();
			obj.logout();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
    
    @Then("^user successfully logs out$")
	public void user_log_out_success() {
		try {
			Home obj= new Home();
			obj.logoutcheck();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    

	
}
