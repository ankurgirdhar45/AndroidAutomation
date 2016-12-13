package com.gaaana.AndroidAutomation.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gaaana.AndroidAutomation.connect.Browser;

public class RadioTest {

	@Test
	public void testRadio(){
		Browser.d.findElement(By.cssSelector("#lm3>a")).click();	//click radio
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".lastend-container")));
		
		//verify categories count on page : should be 4 viz radio mirchi, gaana radio, news and ad(bottom)
		int categories = Browser.d.findElements(By.cssSelector(".lastend-container>div")).size();
		Assert.assertEquals(categories, 4);
		
		//verify full width ad count on page : should be 1 after radio mirchi section
		Assert.assertEquals(Browser.d.findElements(By.cssSelector(".lastend-container>li")).size(), 1);
		
		//verify no of ads in radio mirchi section :should be 2
		int rmads = Browser.d.findElements(By.cssSelector("#radiomirchi_home>div>ul>li[class^='list columbia']")).size();
		Assert.assertEquals(rmads,2);
		
		//verify no of radio mirchi records appearing : should be 10
		Assert.assertEquals(Browser.d.findElements(By.cssSelector("#radiomirchi_home>div>ul>li")).size()-rmads, 10);
		
		System.out.println("ebi tak pass");
		
		//verify no of radio mirchi records appearing : should be 10
		Assert.assertEquals(Browser.d.findElements(By.cssSelector("#new-release-album>li")).size(), 10);
		
		System.out.println("sab pass 10 mil gye gaana radio");
	}
}
