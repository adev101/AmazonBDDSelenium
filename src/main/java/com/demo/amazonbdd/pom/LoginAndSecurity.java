package com.demo.amazonbdd.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demo.amazonbdd.core.TestFactory;
import com.demo.amazonbdd.utilities.TestConfig;

import junit.framework.Assert;

public class LoginAndSecurity {

	String userlabeltext, userConfig, result;
	
	@FindBy(xpath="//div[@class='a-row' and contains(text(),'@')]")
	private WebElement userLabel;
	
	
	@SuppressWarnings("deprecation")
	public void validateUser() {
		try {
			userConfig=TestConfig.getConfigDetails().get("userId");
			result=TestFactory.searchTextOnPage(userConfig);
			Assert.assertEquals("Login Success", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//		
//		
//		System.out.println(userlabeltext);
//		try {
//			userConfig=TestConfig.getConfigDetails().get("userId");
//			System.out.println(userConfig);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		if (userConfig.contentEquals(userlabeltext)) {
//			System.out.println("User logged in successfully");
//		}
//		else
//			System.out.println("Login not successful");
//	}
}
