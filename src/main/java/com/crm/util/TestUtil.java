package com.crm.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.crm.base.TestBase;
import com.google.common.io.Files;

public class TestUtil extends TestBase{

	public static int implicit_Timeout = 20;
	static Workbook book;
	static Sheet sheet;
	static int no;
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\CRC\\eclipse-workspace\\freeCRM\\src\\main\\java\\com\\crm\\data\\newConatct.xlsx";
	public static Select select;
	
	
	//For switching to frame
	public  void movetoFrame()
	{
		driver.switchTo().frame("mainpanel");
	}
	// For reading excel data
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		 System.out.println(sheet.getLastRowNum() + "--------" +
		sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				 System.out.println(data[i][k]);
			}
		}
		return data;
	}
	//Taking screen shots
	public static void takeScreenshot()
	{
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
			Files.copy(screenshotFile, new File("C:\\Users\\CRC\\eclipse-workspace\\freeCRM\\Screen-Shots\\SoftwareTestingMaterial"+no+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// Snaputil
	public static File getsanp()
	{
		File tempSnap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File FileDest = new File("C:\\Users\\CRC\\eclipse-workspace\\freeCRM\\Screen-Shots\\SoftwareTestingMaterial"+no+++".png");
		
		try {
			Files.move(tempSnap, FileDest);
			return FileDest;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error occured while saving snap");
			return null;
		}
	}
	//Drawing border
	public static void drawBorder(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	//Highlight the webElement
	public static void highlightWebElemnet()
	{
		
	}
	// Current date and time
	public static String dateTime()
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
	// For selection of value by index
	public void selectDropDownData(WebElement element, String data)
	{
		select = new Select(element);
		select.selectByVisibleText(data);
	}
	
}
