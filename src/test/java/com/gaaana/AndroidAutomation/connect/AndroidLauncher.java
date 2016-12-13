package com.gaaana.AndroidAutomation.connect;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.gaaana.AndroidAutomation.config.DeviceConf;

import io.appium.java_client.android.AndroidDriver;

public class AndroidLauncher {
	public AndroidDriver driver;
	DeviceConf dev;
	
	public AndroidDriver launchAndroid() throws MalformedURLException{
		dev = new DeviceConf();
		 DesiredCapabilities cap = dev.setDevice();
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}
}
