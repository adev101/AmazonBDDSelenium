package com.demo.amazonbdd.pom;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.amazonbdd.core.TestException;
import com.demo.amazonbdd.core.TestFactory;

import junit.framework.Assert;

public class Home extends TestFactory{
	
	
	@FindBy(xpath="//a[@data-nav-ref='nav_ya_signin']//span")
	private WebElement linkSignin;
	
	@FindBy(xpath="//a[@data-nav-ref='nav_signin']/span[text()='Sign in']")
	private WebElement btnSignin;
	
	@FindBy(xpath="//a[@data-nav-role='signin']")
	private WebElement linkUserCheck;
	
	@FindBy(xpath="//span[text()='Your Account']")
	private WebElement linkUserAccount;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement accountLink;
	
	@FindBy(xpath="(//span[contains(text(),'Your Wish List')])[2]")
	private WebElement wishListLink;
	
	@FindBy(xpath="//span[contains(text(),'Sign Out')]")
	private WebElement logOutLink;
	
	@FindBy(xpath="//div[@class='a-section']//h1")
	private WebElement logoutCheck;
	
	public Home(){
		PageFactory.initElements(TestFactory.driver, this);
		}
	
	public void hoverSignIn() {
		try {
			Thread.sleep(2000);
			TestFactory.hoverOnElement(linkSignin);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void clickSignIn() {
		try {
			Thread.sleep(2000);
			TestFactory.webElementClick(btnSignin);
		} catch (TestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void hoverUser() {
		try {
			Actions act= new Actions(driver);
			act.moveToElement(linkUserCheck).build().perform();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickUserAccount() throws InterruptedException {
		try {
			Thread.sleep(2000);
			TestFactory.webElementClick(linkUserAccount);
		} catch (TestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void searchProd(String prdName) {
		try {
			TestFactory.elementSendKeys(searchBox, prdName);
			TestFactory.elementSendKeys(searchBox, Keys.ENTER);
		} catch (TestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	public void getTitle() {
		try {
			String url=null;
			url=TestFactory.checkURL();
			Assert.assertEquals("https://www.amazon.in/", url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void hover_account() {
		TestFactory.hoverOnElement(accountLink);
	}
	
	public void navigateWishList() {
		try {
			Thread.sleep(3000);
			TestFactory.webElementClick(wishListLink);
		} catch (TestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public void logout() {
		try {
			Thread.sleep(2000);
			TestFactory.webElementClick(logOutLink);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	public void logoutcheck() {
		try {
			Thread.sleep(2000);
			String text=TestFactory.checkElementText(logoutCheck);
			boolean check;
			
			if (text.contains("Login"))
				check=true;
			else
				check=false;
			
			Assert.assertEquals(true, check);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
