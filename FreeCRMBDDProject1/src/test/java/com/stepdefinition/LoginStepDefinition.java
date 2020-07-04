/*package com.stepdefinition;

import java.io.IOException;

import com.baseclass.Library;
import com.pages.LoginPage;
import com.reusablefunctions.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends Library{
	   LoginPage login;
	  SeleniumUtility seleniumutility;

	    
	 
	
	@Given("^User is already on Loginpage$")
	public void user_is_already_on_Loginpage() throws IOException  {
		   launchApplication();
	   
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM()  {
		seleniumutility = new SeleniumUtility(driver);
		seleniumutility.getTitle();
	    
	}


	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String pwd)  {
		login = new LoginPage(driver);
		login.enterEmail(email);
		login.enterPassword(pwd);
	    
	}

	@Then("^user clicks on loginbutton$")
	public void user_clicks_on_loginbutton()  {
		login.clickLogin();
	    
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() {
	    
	}



}*/
