package com.demo.amazonbdd.pom;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.amazonbdd.core.TestFactory;

import junit.framework.Assert;

public class WishList {
	
	@FindBy(xpath="//span[@id='profile-list-name']")
	private static WebElement wishList;
	
	
	@FindBy(xpath="//h3[@class='a-size-base']/a")
	private static List<WebElement> wishListItems;
	
	public WishList(){
		PageFactory.initElements(TestFactory.driver, this);
		}
	
	@SuppressWarnings("deprecation")
	public static void checkWishList() {
		try {
			String text= TestFactory.checkElementText(wishList);
			boolean val;
			if (text.contains("Wish List")) 
				val=true;
			else 
				val=false;
			
			Assert.assertEquals(true, val);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void displayWishList() {
		try {
			Iterator<WebElement> itr =wishListItems.iterator();
			
			System.out.println("Wish List Items are as follows: ");
			while (itr.hasNext()) {
				System.out.println(itr.next().getText());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
