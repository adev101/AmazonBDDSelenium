package com.Demo.AmazonBDD.teststeps;

import com.demo.amazonbdd.pom.Login;
import com.demo.amazonbdd.pom.WishList;

import cucumber.api.java.en.Then;

public class WishListSteps {
	
	@Then("^user navigates to wish list page$")
	public void navigate_wish_list() throws Throwable {
		try {
			WishList obj= new WishList();
			obj.checkWishList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("^print the wish list items on console$")
	public void print_wish_list() throws Throwable {
		try {
			WishList obj= new WishList();
			obj.displayWishList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
