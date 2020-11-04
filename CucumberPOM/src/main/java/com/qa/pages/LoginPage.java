package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.pages.HomePage;
import com.qa.util.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
			@FindBy(xpath="//input[@name='email']")
			WebElement username;
			
			@FindBy(xpath="//input[@name='password']")
			WebElement password;
			
			@FindBy(xpath="//div[text()='Login']")
			WebElement loginBtn;			
					
			//Initializing the Page Objects:
			public LoginPage(){
				PageFactory.initElements(driver, this);
			}
			
			//Actions:
			
			public String validateLoginPageTitle()
			{
				return driver.getTitle();
			}
				
			public HomePage login(String usrname, String pwd) throws InterruptedException{
				
				username.sendKeys(usrname);
				password.sendKeys(pwd);
				loginBtn.click();
				return new HomePage();
			}

}
