package com.qa.TestClasses;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Testbase.TestBaseClass;
import com.qa.Utility.XLUtils;
import com.qa.pomPages.Logpage;

public class TestDataVerifyClass extends TestBaseClass {

	public TestDataVerifyClass() throws IOException {
		super();

	}

	Logpage log;

	@BeforeClass
	public void browsrLaunch() {
		TestBaseClass.initilization();
		log = new Logpage(d);
		log.Logintab();

	}

	@Test(dataProvider = "DemoblazeTestData")
	public void testData(String uname, String pass) throws InterruptedException, IOException {
		log.setuname(uname);
		Thread.sleep(3000);
		log.setpassword(pass);
		Thread.sleep(3000);
		log.loginbuttonclick();
		Thread.sleep(3000);
//		log.verifywelcome();
//		System.out.println("Test Data is Pass");

		if (isAlertpresent() == true) {
			d.switchTo().alert().accept();
			d.switchTo().defaultContent();
			Assert.assertTrue(false);
			System.out.println("Test data is Wrong");
			log.clickclose();
			log.refreshing();
			Screenshot(d,randomname() );

		} else {
			Assert.assertTrue(true);
			log.clicklogout();
			System.out.println("Test DATA is correct");

		}

	}

	public boolean isAlertpresent() {
		try {
			d.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			System.out.println(e);
			return false;
		}
	}

	@DataProvider(name = "DemoblazeTestData")
	String[][] getdata() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/qa/Testdata/DemoblazeTestData.xlsx";

		int rowcount = XLUtils.getRowCount(path, "Sheet1");
		int clocount = XLUtils.getCellCount(path, "Sheet1", 1);

		String logData[][] = new String[rowcount][clocount];
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < clocount; j++) {
				logData[i][j] = XLUtils.getCellData(path, "Sheet1", i, j);

			}
		}
		return logData;
	}

//	@AfterClass
//	public void closebrowser() {
//		d.close();
//
//	}

}
