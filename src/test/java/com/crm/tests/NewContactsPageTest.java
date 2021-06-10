package com.crm.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.NewContactsPage;
import com.crm.util.TestUtil;
import com.crm.tests.HomePageTest;

public class NewContactsPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	HomePageTest homePagetest;
	TestUtil testUtil;
	NewContactsPage contactsPage;

	NewContactsPageTest(){
		
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
	}
/*	@Test//(dependsOnMethods = {"validateNewContactLinktest"}) 
	public void addNewContact()
	{
		System.out.println("Creating new contact");
		contactsPage.createNewContact("Mr.", "Ayush", "vardhan","Tyagi", "No");
	}
	*/
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData("NewConact");
		return data;
	}
	
	@Test(dataProvider="getCRMTestData")
	public void addNumNewContact(String tittle, String firstName, String middleName, String lastName, String receiveSms)
	{
		contactsPage.createNewContact(tittle, firstName, middleName, lastName, receiveSms);
	}
	@Test
	public void validateCompanyLookUp()
	{
		contactsPage.clickOncontactLookUp();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
