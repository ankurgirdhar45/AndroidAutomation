package com.gaaana.AndroidAutomation.config;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class DeviceConf{
	public DesiredCapabilities cap;
		
	public DesiredCapabilities setDevice(){
		cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "ONE E1003");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersoin", "6.0.1");
		cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability("appPackage", "com.android.chrome");
	    cap.setCapability("appActivity","com.google.android.apps.chrome.ChromeTabbedActivity");
		return cap;
	}
}