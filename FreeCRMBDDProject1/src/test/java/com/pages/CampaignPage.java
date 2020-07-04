package com.pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;
import com.reusablefunctions.SeleniumUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CampaignPage extends Library {
	WebDriver driver;
	public CampaignPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterEmail(String email)
    {
        emailId.sendKeys(email);
       
    }

    public void enterPassword(String pwd)
    {
        password.sendKeys(pwd);
        
    }

    public void enterCredentials(String email, String pwd)
    {
        emailId.sendKeys(email);
        password.sendKeys(pwd);

       
    }

    public void clickLogin()
    {
        login.click();
       
    }
	public void clickCampaign()throws InterruptedException
	{
		campaign.click();
        Thread.sleep(2000);

	}
	public void NewButton() throws InterruptedException
	{
		newButton.click();
        Thread.sleep(2000);

	}
	public void name1(String name2) 
	{
		Name.sendKeys(name2);

		
	}
	public void Transport(String trans)
	{
		
		transport.sendKeys(trans);
	}
	public void TransportID(String transid)
	{
		transportId.sendKeys(transid);
	}
	public void Active()
	{
		active.click();
	}
	public void Schedules()
	{
		schedules.click();
	}
	public void Active1()
	{
		active1.isSelected();
	}
	public void Template()
	{
		template.click();
	}
	public void TempDropDwn(String temp)
	{
		tempdropdown.sendKeys(temp);
	}
	public void Schedule1()
	{
		sch.click();
	}
	public void Add()
	{
		add.click();
	}
	public void options()
	{
		opt.click();
	}
	public void Save()
	{
		save.click();
	}
	public void Edit()
	{
		edit.click();
	}
	@FindBy(name = "email")
     WebElement emailId;

    @FindBy(name = "password")
     WebElement password;

    @FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
     WebElement login;

    @FindBy(xpath = "//*[@id=\"ui\"]/div/div/div[1]/a")
     WebElement forgotPassword;

	@FindBy(xpath="//span[contains(text(),'Campaigns')]")
	WebElement campaign;

	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement newButton;

	@FindBy(name="name")
	WebElement Name;

	@FindBy(xpath="//div[@name='transport_type']")
	WebElement transport;
	
	@FindBy(xpath="//div[@name='transport_id']")
	WebElement transportId;
	
	@FindBy(xpath="//label[contains(text(),'Active')]")
	WebElement active;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/h4")
	WebElement schedules;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/table/thead/tr/th[2]")
	WebElement active1;
	
	@FindBy(xpath="//th[contains(text(),'Template')]")
	WebElement template;
	
	@FindBy(name="template_id")
	WebElement tempdropdown;
	
	@FindBy(xpath="//th[contains(text(),'Schedule')]")
	WebElement sch;
	
	@FindBy(xpath="//th[contains(text(),'Options')]")
	WebElement opt;
	
	@FindBy(xpath="//i[@class='add icon']")
	WebElement add;
	
	@FindBy(xpath="//i[@class='save icon']")
	WebElement save;
	
	@FindBy(xpath="//i[@class='edit icon']")
	WebElement edit;
}
