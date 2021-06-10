package com.crm.tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.NewContactsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.util.TestUtil;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	NewContactsPage contactsPage;

	public HomePageTest() {
		super();
	}

		
	@BeforeMethod
	public void setUp() throws Exception {
		initilization();
		testUtil = new TestUtil();
		contactsPage = new NewContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=2)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO","Home page title not matched");
	}
	
	
	@Test(priority=1)
	public void verifyContactsLinkTest(){
		testUtil.movetoFrame();
		contactsPage = homePage.clickOnContactsLink();
	}
	
	@Test(priority=3)
	public void validateNewContactLinktest()
	{	
		driver.switchTo().frame("mainpanel");
		homePage.clickOnNewContactLink();
	}
	@Test(priority=4)
	public void validateDeals()
	{
		testUtil.movetoFrame();
		homePage.clickOnNewDealsLink();
	}
	@Test(priority=5)
	public void validateTasks()
	{
		testUtil.movetoFrame();
		homePage.clickOnNewTasksLink();
	}
	@Test(priority=6)
	public void validateContactSubmenuOption()
	{
		testUtil.movetoFrame();
		List<WebElement> list = homePage.getNumSubMenuContacts();
		for(WebElement element : list)
		{
			System.out.println("The number of element"+element.getText());
		}
		
	}
	@Test(priority=7)
	public void validateDealSubmenuOption()
	{
		testUtil.movetoFrame();
		List<WebElement> list = homePage.getNumSubMenuDeals();
		for(WebElement element : list)
		{
			System.out.println("The number of element"+element.getText());
		}
		
	}
	@Test(priority=8)
	public void validateTaskSubmenuOption()
	{
		testUtil.movetoFrame();
		List<WebElement> list = homePage.getNumSubMenuTasks();
		for(WebElement element : list)
		{
			System.out.println("The number of element"+element.getText());
		}
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
