package com.demo.amazonbdd.pom;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.amazonbdd.core.TestFactory;
import com.demo.amazonbdd.pom.ExcelInput;

public class ProdSearchResult {

	@FindBy(xpath="//div[@class='a-section a-spacing-none']/h2//span")
	private List<WebElement> results;
	
	
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
	
	
	
}
