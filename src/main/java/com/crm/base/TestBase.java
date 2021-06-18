package com.crm.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		prop = new Properties();
		String dirPath = System.getProperty("user.dir");
		String path =System.getProperty("user.dir")+"\\src\\main\\java\\com"
						+ "\\crm\\config\\config.properties";
		prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream(path);
			
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
public static void initilization()
{
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chetan Folder\\chromedriver.exe");
	String broswername =prop.getProperty("browserName");
	driver= new ChromeDriver();
	driver.get("https://www.freecrm.com/index.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(com.crm.util.TestUtil.implicit_Timeout,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();	
}
	
}

