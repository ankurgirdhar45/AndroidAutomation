package com.gaaana.AndroidAutomation.Tests;

import java.net.MalformedURLException;

import com.gaaana.AndroidAutomation.connect.Browser;

public class MyBrowser {
	Browser br;
	public void setup() throws MalformedURLException{
		br=new Browser();
		br.openApp();
		//driver = br.d;
	}
}