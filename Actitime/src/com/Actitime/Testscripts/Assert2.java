package com.Actitime.Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert2 {
	//seft assert
	
	@Test
	public void demoasserting() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String expectedtitle = "soogle";
		String Actutaltitle = driver.getTitle();
		
		SoftAssert s= new SoftAssert();
		s.assertEquals(expectedtitle, Actutaltitle);
		driver.close();
		
		s.assertAll();
	}

}
