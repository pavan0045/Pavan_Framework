package com.qa.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	WebDriver d;

	public SignupPage() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//a[text()='Sign up']")private WebElement SignuTab; 
@FindBy	(xpath="//input[@id='sign-username']") private WebElement  signuname;
	
	
	public void verifysignuptab() {
		SignuTab.click();
		
	}

}
