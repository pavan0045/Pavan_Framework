package com.qa.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.Testbase.TestBaseClass;

import com.qa.pomPages.Homepage;

import demo.Log4jclass;

@Listeners(com.qa.Utility.ListnerClass.class)
public class HomepageTest extends TestBaseClass {
	 static Logger log =LogManager.getLogger(Log4jclass.class);

	Homepage home;
      
      
      
      
      
	public HomepageTest() throws IOException {
		super();

	}

	@BeforeClass
	public void setup() throws IOException {
		TestBaseClass.initilization();
		home = new Homepage(d);
		log.info("info message");
		
   //d.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void validatelogo() throws InterruptedException {
		
		log.info("info message");
		Thread.sleep(3000);
		home.verifylogo();
	}
// Scripttimeout Exception
//	@Test(priority = 5)
//	public void Scrolling() throws InterruptedException {
//		verifyScrolling();
//	}
	
	@Test 
	public void verifyRefresh() throws IOException {
		home.verifyRefreshing();
	Screenshot(d,randomname());
	
	}
	
	@Test 
	public void verifytitle() {
		home.verifytile();
	}

	@AfterClass
	public void shutdown() {
		d.quit();
	}
}
