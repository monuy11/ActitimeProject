package com.Actitime.Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assert {
	//demo
	@Test
	public void demoassertion() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String expectedtitle = "soogle";
		String Actulaltitle = driver.getTitle();
		if (expectedtitle.equals(Actulaltitle)) {
			
			System.out.println("titile is matching");
			
		} else {

			System.out.println("title is not matching");
		}
	}

}
