package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;

import com.baseclass.Library;
import com.pages.CampaignPage;
import com.pages.LoginPage;
import com.reusablefunctions.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CampaignStepDefinition extends Library {
	LoginPage login;
	CampaignPage cpage;
	SeleniumUtility seleniumutility;

	@Given("^To open the browser and navigate to the URL$")
public void to_open_the_browser_and_navigate_to_the_URL() throws IOException {
		launchApplication();
}



	
	@When("^the title of login page is FreeCRM$")
	public void the_title_of_login_page_is_FreeCRM() 
	{
		seleniumutility=new SeleniumUtility(driver);
		seleniumutility.getTitle();
	}


	@When("^the user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and(String EMail ,String password) 
	
	{
		login=new LoginPage(driver);
		login.enterEmail(EMail);
		login.enterPassword(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()
	{
		login.clickLogin();
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() 
	{
		System.out.println("The user is on HOMEPAGE");
	}

	@Given("^User is on homepage$")
	public void user_is_on_homepage1() 
	{
		System.out.println("The user is on HOMEPAGE1 and clicking the Campaign ");
	}

	@When("^User clicks on Campaigns$")
	public void user_clicks_on_Campaigns() throws InterruptedException 
	{
		cpage=new CampaignPage(driver);
		cpage.clickCampaign();
	}

	@Then("^User clicks on New$")
	public void user_clicks_on_New() throws InterruptedException 
	
	{
		
		cpage.NewButton();
		cpage.name1("Viji");
		cpage.Transport("Email");
		
		cpage.TransportID("0");
		System.out.println("No Transport Id element is Present");

		
		cpage.Active();
		cpage.Schedules();
		cpage.Active1();
		cpage.Template();
		cpage.TempDropDwn("0");
		cpage.Schedule1();
		cpage.Add();
		cpage.options();
		cpage.Save();
		cpage.Edit();
		
		


	}

	

}



