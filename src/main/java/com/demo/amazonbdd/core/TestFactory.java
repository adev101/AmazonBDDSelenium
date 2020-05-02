package com.demo.amazonbdd.core;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.amazonbdd.utilities.TestCapture;
import com.demo.amazonbdd.utilities.TestConfig;

public class TestFactory {
	static String path= null;
	public static WebDriver driver;
	static String url= null;
	static String currURL=null;
	
	public static void getURL(String browser) throws IOException {
		
		path=System.getProperty("user.dir");
		
		switch (browser)
		{
		case "chrome": 
			System.setProperty("webdriver.chrome.driver", path+"//src//main//resources//drivers//chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "IE": 
			System.setProperty("webdriver.edge.driver", path+"//src//main//resources//drivers//IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", path+"//src//main//resources//drivers//geckodriver.exe");
			driver= new FirefoxDriver();
			break;
		default:
			System.out.println("Wrong Browser");
			break;
		}
		
		url=TestConfig.getConfigDetails().get("baseURL");
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}
	
	
	public static void webElementClick(WebElement element) throws TestException {
		if (!element.isEnabled()) {
			throw new TestException(element.getText()+ " is not clicked as it is disabled");
		}
		
		try {
			element.click();
		} catch (Exception e) {
			TestCapture.captureScreenshot(driver, element.getText());
			e.printStackTrace();
		}	
	}
	
	public static void clickElementWithWait (WebElement element) {
		//WebDriverWait wait = new WebDriverWait (driver, 15);
		try {
			//wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void elementSendKeys(WebElement element, String text) throws TestException {
		if (!element.isEnabled()) {
			throw new TestException(element.getText()+ " is disabled");	
		}
		
		try {
			element.sendKeys(text);
		} catch (Exception e) {
			TestCapture.captureScreenshot(driver, element.getText());
		}	
	}
	
	public static void elementSendKeys(WebElement element, Keys key) throws TestException {
		if (!element.isEnabled()) {
			throw new TestException(element.getText()+ " is disabled");	
		}
		
		try {
			element.sendKeys(key);
		} catch (Exception e) {
			TestCapture.captureScreenshot(driver, element.getText());
		}	
	}
	
	public static String searchTextOnPage(String text) {
		if(driver.getPageSource().contains(text)) {
		    System.out.println("Login Successful");
		    return "Login Success";
		}
		else {
			System.out.println("Login not successful");
			return "Login Not Success";
		}
	}
	
	public static String checkURL() {
		currURL= driver.getCurrentUrl();	
		return currURL;
	}
	
	public static void navigateToHome() {
		driver.get(url);
	}
	
	public static void hoverOnElement(WebElement element) {
		try {
			Actions act= new Actions(driver);
			act.moveToElement(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String checkElementText(WebElement element) {
		String text=null;
		
			try {
				text=element.getText();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return text;
	}
	
}
