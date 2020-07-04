/*package com.stepdefinition;

import com.baseclass.Library;
import com.pages.CalenderPage;
import com.pages.LoginPage;
import com.reusablefunctions.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CalenderStepDefinition extends Library{
	
	CalenderPage cpage;
	  SeleniumUtility seleniumutility;
	
	
	@Given("^User is on homepage$")
	public void user_is_on_homepage()  {
		System.out.println("user is on homepage");
		
	   
	}


	@When("^User clicks on Calender$")
	public void click_on_Calender() throws InterruptedException  {
		cpage= new CalenderPage(driver);
		cpage.clickCalender();
		
		
	    
	}

	@Then("^User clicks on New$")
	public void click_on_New() throws InterruptedException  {
		cpage.clickNew();
	  
	}



}*/
