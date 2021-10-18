package com.qa.TestClasses;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Testbase.TestBaseClass;
import com.qa.pomPages.ContactPage;


public class ContactPageTest extends TestBaseClass{
	ContactPage con;

	public ContactPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public void launchbrowser() {
		TestBaseClass.initilization();
        con= new ContactPage(d);
		}
	@Test
	public void ContactpageTest() {
		con.verifyContactTab();
		con.verifycontactEmail();
		con.verifycontactName();
		con.verifymessage();
		con.verifyclosebutton();
	
	}
//	@Test
//	public void veri() {
//		con.verifycontactEmail();
//	}
	
	@AfterClass
	public void closebrowser() {
		d.close();
	}

}
