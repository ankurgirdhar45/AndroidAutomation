package com.gaaana.AndroidAutomation.connect;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class Browser {
	public static AndroidDriver d;
	public WebDriverWait wait;
	@BeforeTest
	public void openApp() throws MalformedURLException {
		
		AndroidLauncher phn = new AndroidLauncher();
		d = phn.launchAndroid();
		setAndroidProperties();
	}
	
	public void setAndroidProperties(){
		d.get("https://www.gaana.com");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(d, 15);
	}
}
