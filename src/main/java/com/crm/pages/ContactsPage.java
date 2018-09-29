package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class ContactsPage extends TestBase{

	@FindBy(xpath="//*[@value='Search Contacts']")
	WebElement searchContact;
	
	@FindBy(xpath="//*[@name='title']")
	WebElement tittle;
	
	@FindBy(xpath = "//*[@id='contactForm']/table/tbody/tr[1]/td/input[2]")
	WebElement saveBtn;
	
	@FindBy(id = "first_name")
	WebElement firstName;
	
	@FindBy(id = "middle_initial")
	WebElement middleName;
	
	@FindBy(id = "surname")
	WebElement surName;

	@FindBy(xpath="//*[@name='suffix']")
	WebElement suffix;
	
	@FindBy(name="nickname")
	WebElement nickname;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(id = "company_position")
	WebElement position;
	
	@FindBy(id = "department")
	WebElement department;
	
	@FindBy(name="contact_lookup_sup")
	WebElement supervisor;
	
	@FindBy(name = "contact_lookup_ass")
	WebElement assistant;
	
	@FindBy(name = "contact_lookup_ref")
	WebElement referredBy;
	
	@FindBy(id = "owner_user_id")
	WebElement owner;
	
	@FindBy(xpath ="//*[@name='category']")
	WebElement category;
	
	@FindBy(xpath ="//*[@name='status']")
	WebElement status;
	
	@FindBy(xpath ="//*[@id='phone']")
	WebElement phone;
	
	@FindBy(xpath ="//*[@id='mobile']")
	WebElement mobilePhone;
	
	@FindBy(xpath ="//*[@id='home_phone']")
	WebElement homePhone;
	
	@FindBy(xpath ="//*[@id='fax']")
	WebElement fax;
	
	@FindBy(xpath ="//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath ="//*[@id='email_alt']")
	WebElement emailAlt;
	
	@FindBy(xpath ="//*[@name='receive_email' and @value='Y']")
	WebElement receiveEmailYes;
	
	@FindBy(xpath ="//*[@name='receive_email' and @value='N']")
	WebElement receiveEmailNo;
	
	@FindBy(xpath ="//*[@name='receive_sms' and @value='Y']")
	WebElement receiveSmsYes;
	
	@FindBy(xpath ="//*[@name='receive_sms' and @value='N']")
	WebElement receiveSmsNo;
	
	@FindBy(xpath ="//*[@name='allows_call' and @value='Y']")
	WebElement allowsCallYes;
	
	@FindBy(xpath ="//*[@name='allows_call' and @value='N']")
	WebElement allowsCallNo;
	
	@FindBy(xpath ="//*[@id='im_id']")
	WebElement messangerId;
	
	@FindBy(xpath ="//*[@id='fieldId_birthday']")
	WebElement bday;
// Address	
	@FindBy(xpath ="//*[@name='address_title']")
	WebElement addressTitle;
	
	@FindBy(xpath ="//*[@name='type' and @onchange='setAddress(this);']")
	WebElement type;
	
	@FindBy(xpath ="//*[@name='address']")
	WebElement address;
	
	@FindBy(xpath ="//*[@name='city']")
	WebElement city;
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}


	public WebElement getSearchContact() {
		return searchContact;
	}


	public WebElement getTittle() {
		return tittle;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getMiddleName() {
		return middleName;
	}


	public WebElement getSurName() {
		return surName;
	}


	public WebElement getSuffix() {
		return suffix;
	}


	public WebElement getNickname() {
		return nickname;
	}


	public WebElement getCompany() {
		return company;
	}


	public WebElement getPosition() {
		return position;
	}


	public WebElement getDepartment() {
		return department;
	}


	public WebElement getSupervisor() {
		return supervisor;
	}


	public WebElement getAssistant() {
		return assistant;
	}


	public WebElement getReferredBy() {
		return referredBy;
	}


	public WebElement getOwner() {
		return owner;
	}


	public WebElement getCategory() {
		return category;
	}


	public WebElement getStatus() {
		return status;
	}


	public WebElement getPhone() {
		return phone;
	}


	public WebElement getMobilePhone() {
		return mobilePhone;
	}


	public WebElement getHomePhone() {
		return homePhone;
	}


	public WebElement getFax() {
		return fax;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getEmailAlt() {
		return emailAlt;
	}


	public WebElement getReceiveEmailYes() {
		return receiveEmailYes;
	}


	public WebElement getReceiveEmailNo() {
		return receiveEmailNo;
	}


	public WebElement getReceiveSmsYes() {
		return receiveSmsYes;
	}


	public WebElement getReceiveSmsNo() {
		return receiveSmsNo;
	}


	public WebElement getAllowsCallYes() {
		return allowsCallYes;
	}


	public WebElement getAllowsCallNo() {
		return allowsCallNo;
	}


	public WebElement getMessangerId() {
		return messangerId;
	}


	public WebElement getBday() {
		return bday;
	}


	public WebElement getAddressTitle() {
		return addressTitle;
	}


	public WebElement getType() {
		return type;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCity() {
		return city;
	}
	
	
}
