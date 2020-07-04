package com.reusablefunctions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Library;

public class SeleniumUtility extends  Library {
	
WebDriver driver;
	
	public SeleniumUtility(WebDriver driver) {
		this.driver=driver;
		
	}
	public void to_take_screenshot(String path) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source,new File(path));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void getTitle() {
		
		System.out.println(driver.getTitle());
	
	}
	
		
		
	public void Explicitlywait(String Locator) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locator))));
		
	}
	/*public void dropdown1(String dropdown)
	{
		List <WebElement> listings = driver.findElements(By.xpath(dropdown));
		Random r = new Random();
		int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
		listings.get(randomValue).click(); //Clicking on the random item in the list.
	}
	/*public void checkBox(String val1){
		driver.findElement(By.xpath(val1)).click();
	}*/
	
	public void quit() {
		driver.close();

	}

}
