package com.crm.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.NewContactsPage;
import com.crm.pages.TasksPage;
import com.crm.util.TestUtil;
//@Listeners(value=ExtentReportListener.class)
public class TaskPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil = new TestUtil();
	NewContactsPage contactsPage;
	TasksPage taskPage; 
	
	TaskPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		initilization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	/*@Test
	public void verifyWebTableData()
	{
		String name = "Full Search Form";
		testUtil.movetoFrame();
		//driver.switchTo().frame("mainpanel");
		List<WebElement> list = homePage.getNumSubMenuTasks();
		//info("Number of dropdown items for tasks");
		for(WebElement element : list)
		{
			System.out.println("The number of element"+element.getText());
		}
		//info("Select Full Search");
		System.out.println("Size of list"+list.size());
		for(WebElement element: list )
		{
			if(element.getText().equalsIgnoreCase(name))
			{
				element.click();
				break;
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		TasksPage taskPage = new TasksPage(); 
		WebElement e=taskPage.getTastSearch();
		e.click();
	}
	*/
	@Test
	public void getWebTableDataTask() 
	{
		String name = "Full Search Form";
		testUtil.movetoFrame();
		List<WebElement> list = homePage.getNumSubMenuTasks();
		for(WebElement element: list )
		{
			if(element.getText().equalsIgnoreCase(name))
			{
				element.click();
				break;
			}
		}
		TasksPage taskPage = new TasksPage();
		WebElement element= taskPage.getTastSearch();
		element.click();	
		/*String BeforeXpath = "//html//body//table[2]//tbody//tr[1]//td[2]//table//tbody//tr//td//form//table[2]//tbody//tr[";
		String afterPath = "]/td[2]";
		List<WebElement> end_number =driver.findElements(By.xpath(BeforeXpath));
		int size = end_number.size();
		System.out.println(size);*/
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
