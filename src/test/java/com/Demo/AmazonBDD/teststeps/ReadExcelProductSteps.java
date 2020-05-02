package com.Demo.AmazonBDD.teststeps;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import com.demo.amazonbdd.pom.ExcelInput;


public class ReadExcelProductSteps {

	

	@Given("^input file is available at the path$")
	public void check_input_file(){
		ExcelInput obj= new ExcelInput();
		obj.check_input_file();
	}
	

	
	
}
