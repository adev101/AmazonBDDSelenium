package com.demo.amazonbdd.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.amazonbdd.core.TestException;
import com.demo.amazonbdd.core.TestFactory;
import com.demo.amazonbdd.utilities.TestCapture;
import com.demo.amazonbdd.utilities.TestConfig;


public class Login extends TestFactory{

	static String user, pwd;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement userId;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement btn_continue;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement btn_login;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement btn_authCont;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btn_submit;
	
	public Login(){
		PageFactory.initElements(TestFactory.driver, this);
		}
	
	
	public void enterUser() throws TestException {
		try {
			user=TestConfig.getConfigDetails().get("userId");
			TestFactory.elementSendKeys(userId, user);
			TestFactory.webElementClick(btn_continue);
		} catch (IOException | TestException e) {
			TestCapture.captureScreenshot(driver,"login");
			e.printStackTrace();
			throw new TestException(user,"entered Wrong Value");
		}
		
	}
	
	public void enterPassword() {
		try {
			pwd=TestConfig.getConfigDetails().get("password");
			TestFactory.elementSendKeys(password, pwd);
			
			try {
				if (btn_authCont.isDisplayed()) {
					btn_authCont.click();
					Thread.sleep(20000);
					btn_submit.click();
					}
			} catch (InterruptedException e) {
				TestCapture.captureScreenshot(driver,"login");
				e.printStackTrace();
				throw new TestException(pwd,"entered Wrong Value");
			}
			
			//TestFactory.webElementClick(btn_login);
			//System.out.println("Clicked on btn login");
		} catch (IOException | TestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
}
