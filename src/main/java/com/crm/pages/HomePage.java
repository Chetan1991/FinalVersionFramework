package com.crm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;;


public class HomePage extends TestBase{

	@FindBy(xpath= "//*[text()= 'Contacts']")
	WebElement conatct;
	
	@FindBy(xpath= "//*[@title='New Contact' and @href=\"https://www.freecrm.com/system/index.cfm?action=contact&sub=load&edit=1\"]")
	WebElement newConatct;
	
	@FindBy(xpath = "//*[text()='Deals' and @href=\"https://www.freecrm.com/system/index.cfm?action=prospect\"]")
	WebElement deals;

	@FindBy(xpath = "//*[@title='New Deal' and @href='https://www.freecrm.com/system/index.cfm?action=prospect&sub=load&edit=1']")
	WebElement dealsLink;
	
	@FindBy(xpath = "//*[contains(text(),'Tasks')]")
	WebElement tasks;
	
	@FindBy(xpath = "//*[@title='New Task' and @href='https://www.freecrm.com/system/index.cfm?action=task&sub=load&edit=1']")
	WebElement tasksLink;
	
	//driver = new FirforxDriver();
	HomePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public NewContactsPage clickOnContactsLink(){
		conatct.click();
		return new NewContactsPage();
	}
	
	public DealsPage clickOnNewDealsLink(){
		Actions action = new Actions(driver);
		action.moveToElement(deals).build().perform();
		System.out.println("deal");
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnNewTasksLink(){
		Actions action = new Actions(driver);
		action.moveToElement(tasks).build().perform();
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(conatct).build().perform();
		newConatct.click();
		
	}
	
	public List<WebElement> getNumSubMenuContacts()
	{
		Actions action = new Actions(driver);
		action.moveToElement(conatct).build().perform();
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='navmenu']/ul/li[4]//ul/li/a"));
		return list;
	}
	public List<WebElement> getNumSubMenuDeals()
	{
		Actions action = new Actions(driver);
		action.moveToElement(deals).build().perform();
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='navmenu']/ul/li[5]//ul/li/a"));
		return list;
	}
	public List<WebElement> getNumSubMenuTasks()
	{
		Actions action = new Actions(driver);
		action.moveToElement(tasks).build().perform();
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='navmenu']/ul/li[6]//ul/li/a"));
		return list;
	
	}
}
