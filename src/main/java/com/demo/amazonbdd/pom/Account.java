package com.demo.amazonbdd.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.amazonbdd.core.TestException;
import com.demo.amazonbdd.core.TestFactory;

public class Account {

	
	@FindBy(xpath="(//h2[@class='a-spacing-none ya-card__heading--rich a-text-normal'])[2]")
	private WebElement link_loginSecurity;
	
	@FindBy(xpath="(//span[contains(text(),'Account')])[1]")
	private WebElement linkAccountDetails;
	
	public Account(){
		PageFactory.initElements(TestFactory.driver, this);
		}
	
	
	public void clickAccountDetails() throws InterruptedException {
		Thread.sleep(2000);
		
		try {
			TestFactory.clickElementWithWait(linkAccountDetails);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickLoginSecurity() {
		try {
			Thread.sleep(5000);
			TestFactory.webElementClick(link_loginSecurity);
		} catch (TestException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
