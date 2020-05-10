package com.demo.amazonbdd.pom;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.amazonbdd.core.TestFactory;
import com.demo.amazonbdd.pom.ExcelInput;
import com.demo.amazonbdd.core.TestException;

public class ProdSearchResult {

	static String price_string=null;
	static float number=0;
	static boolean flag=false;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-none']/h2//span")
	private List<WebElement> results;
	
	@FindBy(xpath="//div[@id='brandsRefinements']/ul/li/span/a/span")
	private List<WebElement> filters;
	
	@FindBy(xpath="//span[@class='a-price-whole']")
	private List<WebElement> prices;
	
	public ProdSearchResult(){
		PageFactory.initElements(TestFactory.driver, this);
		}
	
	
	public void List() {	
		Iterator<WebElement> itr =results.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
		
		ExcelInput obj= new ExcelInput();
		obj.save_results(results);
		
	}
	

	public void ListMin() {	
		Iterator<WebElement> it1 =prices.iterator();

		TreeMap<Float, String> tree_map = new TreeMap<Float, String>();
		
		while (it1.hasNext()) {
			price_string = it1.next().getText();
			if (!(price_string=="")) {
				//System.out.println(price_string);
				if (price_string.contains(",")) {			
					price_string=price_string.replaceAll(",", "");
					}
				 number = Integer.parseInt(price_string.trim());
				 //text=it2.next().getText();
				 
				 tree_map.put(number, "INR");
			}
		}
		
		System.out.println("Lowest price item is: " + tree_map.firstEntry());
		
	}
	
	public void apply_filter(String filterval) {
		try {
			Iterator<WebElement> itr =filters.iterator();
			
			while (itr.hasNext()) {
				WebElement e= itr.next();
				
				if (e.getText().contains(filterval)) {
					TestFactory.webElementClick(e);
					flag= true;
					break;
				}
				

				assertTrue("No applicable filter available", flag);
				
			}
		} catch (TestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
