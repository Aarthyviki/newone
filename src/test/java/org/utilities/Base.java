package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	
	public static WebDriver driver;

	public static void launchChrome() {
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
	}
	
	public static void loadUrl(String url) {
       driver.getCurrentUrl();
	}
	
	public static void winMax() {
        driver.manage().window().maximize();
	}
	
	public static void printTitle() {
       String title=driver.getTitle();
       System.out.println(title);
	}                                                                                                                                                                                                                                                                                                                                                                                               
	      
	public static void printCurrentUrl() {
		String title=driver.getCurrentUrl();
	}
	String value;
	public static void fill(WebElement ele,String value){
		
		ele.sendKeys();
	}
	
	public static void btnclick(WebElement ele) {
		ele.click();
	}
	
	public static String  getData(int rowNumber,int cellNumber) throws IOException {
          
		File f=new File("C:\\Users\\91978\\eclipse-workspace\\BrowserLaunch\\Details\\Framework.xlsx");
		
		FileInputStream fin= new FileInputStream(f);
		
		Workbook  w=new XSSFWorkbook(fin);
		 
		Sheet sheet=w.getSheet("Greens");
		
		Row row=sheet.getRow(rowNumber);
		
		org.apache.poi.ss.usermodel.Cell cell=row.getCell(cellNumber);
		
		int cellType= cell.getCellType();
		
		String value="";
		
		if(cellType==1) {
			value=cell.getStringCellValue();
		}
		
		else if (cellType==0) {
			
			if (DateUtil.isCellDateFormatted(cell)) {
				Date d=cell.getDateCellValue();
				
				SimpleDateFormat sim=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
				value=sim.format(d);
				
			}
			else {
				double d=cell.getNumericCellValue();
				
				long l=(long)d;
				value=String.valueOf(1);
			}
			
		}
		return value;
		
		
}
	
	public static void closeChromeBrowser() {
		driver.close();
	}
		
	
	

public static void screenshots(String name) throws IOException{
	
TakesScreenshot tk=(TakesScreenshot)driver;

File src=tk.getScreenshotAs(OutputType.FILE);
File des=new File("C:\\Users\\91978\\eclipse-workspace\\Testing\\target"+name+".jpg");

FileUtils.copyFile(src, des);

}}