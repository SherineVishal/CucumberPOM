package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//span[text()='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath = "//span[text()='Sherine  Thomas']")
	WebElement userNameLabel;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName()
	{
		return userNameLabel.isDisplayed();
	}

	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}

}

