package com.qa.TestClasses;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.Testbase.TestBaseClass;
import com.qa.pomPages.AddToCart;
import com.qa.pomPages.Loginpage;
@Listeners(com.qa.Utility.ListnerClass.class)
public class AddToCartTest extends TestBaseClass {
	AddToCart cart;
	Loginpage log;

	public AddToCartTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void lauchbrowser() {
		initilization(); // no Need create obj
		log = new Loginpage(d);
		cart = new AddToCart(d);

	}

	@BeforeMethod
	public void loginApp() throws InterruptedException {
		log.Logintab();
		log.setuname();
		log.setpassword();
		log.loginbuttonclick();
		Thread.sleep(4000);
	}

	@Test
	public void TestAddToCart() throws InterruptedException {
		cart.addtoCartsamsung();
		Thread.sleep(4000);
		cart.verifyaddtocartbutton();
		cart.verifyaddtocartbuttonclick();
		cart.clickOncartTab();

	}

	@AfterMethod
	public void loggingOut() {
		cart.logoutSoft();
	}

	@AfterClass
	public void closebrowser() {
		d.close();
	}
}
