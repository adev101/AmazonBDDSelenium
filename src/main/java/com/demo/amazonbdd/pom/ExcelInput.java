package com.demo.amazonbdd.pom;

import cucumber.api.java.en.Given;
import junit.framework.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;



public class ExcelInput {
	
	static String path=null;
	static String prodName= null;
	
	@SuppressWarnings("deprecation")
	public void check_input_file(){
		try {
			path=System.getProperty("user.dir");
			File tmpDir = new File(path+"//src//test//resources//input//product.xlsx");
			boolean exists = tmpDir.exists();
			
			if (exists==true)
				System.out.println("File exists");
			else
				System.out.println("File does not exists");
			
			Assert.assertEquals(true, exists);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String read_input_file(){
		try {
			path=System.getProperty("user.dir");
			FileInputStream fis=new FileInputStream(new File(path+"//src//test//resources//input//product.xlsx"));  
			XSSFWorkbook wb=new XSSFWorkbook(fis);    
			XSSFSheet sheet=wb.getSheetAt(0);
					
			prodName=sheet.getRow(1).getCell(1).toString();
			
			//System.out.println("Product to be searched is: " +prodName);
			wb.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prodName;  
		
	}
	
	public void save_results(List<WebElement> results) {
		
		try {
			path=System.getProperty("user.dir");
			File file=new File(path+"//src//test//resources//input//product.xlsx");
			 
			FileInputStream fis=new FileInputStream(file);  
			XSSFWorkbook wb=new XSSFWorkbook(fis);   
			
			 if (wb.getSheetName(1).equals("Results"))
				 wb.removeSheetAt(1);
			 
			 
			//XSSFSheet sheet=wb.getSheetAt(0);
			XSSFSheet sh = wb.createSheet("Results");
			sh.createRow(0).createCell(0).setCellValue("Results");
			
			//Iterator itr= results.iterator();
			
			for (int i=0; i<results.size(); i++) {
				sh.createRow(i+1);
				sh.getRow(i+1).createCell(0);
				sh.getRow(i+1).getCell(0).setCellValue(results.get(i).getText());	
			}
			
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
