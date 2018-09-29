/**
 * 
 */
package com.crm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

/**
 * @author CRC
 *
 */
public class TasksPage extends TestBase {


	@FindBy(xpath = "//*[contains(text(),'Tasks')]")
	WebElement tasks;
	
	@FindBy(xpath = "//*[@value='Search Tasks']")
	WebElement tastSearch;
	
	public TasksPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getTasks() {
		return tasks;
	}

	public WebElement getTastSearch() {
		return tastSearch;
	}
}
