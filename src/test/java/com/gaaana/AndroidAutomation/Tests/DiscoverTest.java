package com.gaaana.AndroidAutomation.Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gaaana.AndroidAutomation.connect.Browser;

import io.appium.java_client.MobileElement;

public class DiscoverTest{
	
	//Browser br; 
	//AndroidDriver driver;
	
	
	@Test
	public void testDiscover() {		
		
		
		d.findElement(By.cssSelector("#lm2>a")).click();	//click discover
		
		//find all the categories in discover
		br.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#main_middle_content>div:nth-child(3)")));
		List<MobileElement> categories = Browser.d.findElements(By.cssSelector("#main_middle_content>div:nth-child(3)>ul>li"));
		
		//verify the count of categories		
		Assert.assertEquals(categories.size(), 26);		
		System.out.println("Test continues");
	}
	
	
	
}