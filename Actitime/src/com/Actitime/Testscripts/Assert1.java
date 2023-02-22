package com.Actitime.Testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 {
	//hard assert
	
	@Test
	public void demoassertion() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String expectedtitle = "soogle";
		String Actutaltitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, Actutaltitle);
		
		driver.close();
	}

}
