package com.crm.tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.NewContactsPage;
import com.crm.util.TestUtil;

public class ContactsPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	NewContactsPage contactsPage;
	ContactsPage contact;
	
	
	public ContactsPageTest() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		initilization();
		contactsPage = new NewContactsPage();
		loginPage = new LoginPage();
		contact = new ContactsPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void addNewContact()
	{
			TestUtil testUtil = new TestUtil();
			testUtil.movetoFrame();
			homePage.clickOnNewContactLink();
			
			WebElement e= contact.getTittle();
			Select select = new Select(e);
			List<WebElement> list = select.getOptions();
			for(WebElement element : list)
			{
				System.out.println("Number of dropdown elements"+element.getText());
				
			}
			testUtil.selectDropDownData(contact.getTittle(), "Sir");
			contact.getFirstName().sendKeys("mahi");
			contact.getMiddleName().sendKeys("Dhoni");
			contact.getSurName().sendKeys("Ganguly");
			testUtil.selectDropDownData(contact.getSuffix(), "IV");
			contact.getNickname().sendKeys("nik");
			contact.getCompany().sendKeys("Tls");
			contact.getDepartment().sendKeys("Comp");
			contact.getAddress().sendKeys("new delhi");
			contact.getAddressTitle().sendKeys("Home");
			contact.getAllowsCallNo().click();
			contact.getAllowsCallYes().click();
			contact.getAssistant().sendKeys("Faizal");
			contact.getSaveBtn();
	}
	//@Test
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
