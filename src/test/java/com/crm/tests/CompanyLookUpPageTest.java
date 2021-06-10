package com.crm.tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.CompanyLookUpPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.NewContactsPage;
import com.crm.util.TestUtil;
public class CompanyLookUpPageTest extends TestBase{

		LoginPage loginPage;
		HomePage homePage;
		HomePageTest homePagetest;
		TestUtil testUtil;
		NewContactsPage contactsPage;
		CompanyLookUpPage comp_look_up_page;

		CompanyLookUpPageTest(){
			
			super();
		}
		
		@BeforeMethod
		public void setup() throws IOException
		{
			initilization();
			testUtil = new TestUtil();
			contactsPage = new NewContactsPage();
			loginPage = new LoginPage();
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			testUtil.movetoFrame();
			homePage.clickOnNewContactLink();
			contactsPage.clickOncontactLookUp();
			comp_look_up_page = new CompanyLookUpPage();
		}

	@Test
	public void validateSearch() {
		/*ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);*/

		System.out.println("hii");
		comp_look_up_page.putValueForSearch("abc");
		WebElement element = comp_look_up_page.getSearch();
	//	TestUtil.drawBorder(driver, element);
		//TestUtil.takeScreenshot();
		comp_look_up_page.clickOnSearch();
	//	TestUtil.takeScreenshot();
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
