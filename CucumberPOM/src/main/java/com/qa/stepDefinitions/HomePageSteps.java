package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	    TestBase.initialization();
	}

	@Then("^user is on login Page$")
	public void user_is_on_login_Page() throws Throwable {
		loginPage=new LoginPage();
	    String title=loginPage.validateLoginPageTitle();
	    Assert.assertEquals("Cogmento CRM", title);
	}
	

	@Then("^user login to app$")
	public void user_login_to_app() throws Throwable {
		
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	
	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
		String title=homePage.verifyHomePageTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
	    boolean flag=homePage.verifyCorrectUserName();
	    Assert.assertTrue(flag);
	}

}
