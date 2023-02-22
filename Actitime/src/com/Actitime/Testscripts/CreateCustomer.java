package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.Generic.library.Baseclass;
import com.Actitime.Generic.library.FileLibrary;
import com.Actitime.pom.Homepage;
import com.Actitime.pom.TaskPage;

public class CreateCustomer extends Baseclass {
	FileLibrary flib=new FileLibrary();
	
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Homepage hp= new Homepage(driver);
		hp.getTasklnk().click();
		
		TaskPage tp = new TaskPage(driver);
		String Custname = flib.readDataFromExcelFile("Sheet1", 4, 1);
		String description = flib.readDataFromExcelFile("Sheet1", 1, 2);
		tp.completetask(Custname, description);
		
		String expected = Custname;
		String actualdate = driver.findElement(By.xpath("//div[@title='"+Custname+"']")).getText();
		SoftAssert s= new SoftAssert();
		s.assertEquals(expected, actualdate);
		
		Reporter.log("assertion pass",true);
		s.assertAll();
		
	}

}
