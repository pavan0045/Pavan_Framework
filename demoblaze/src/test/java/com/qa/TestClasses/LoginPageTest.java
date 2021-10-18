package com.qa.TestClasses;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Testbase.TestBaseClass;
import com.qa.pomPages.Homepage;
import com.qa.pomPages.Loginpage;

public class LoginPageTest extends TestBaseClass {

	Loginpage log;
	// Homepage home;

	public LoginPageTest() throws IOException {
		super();

	}

	@BeforeClass
	public void launchbrowser() {
		TestBaseClass.initilization();
		log = new Loginpage(d);
	}
	@Test
	public void loginTest() throws InterruptedException {
		log.Logintab();
		Thread.sleep(5);
		log.setuname();
		log.setpassword();
		log.loginbuttonclick();
		System.out.println("Succesfully Login");
	}
	
	
	@AfterClass
	
	public void closebrowser() {
		d.close();
	}

}
