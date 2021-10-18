package com.qa.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver d;
	
	
	public Loginpage(WebDriver d) {
		
		PageFactory.initElements(d, this);
		
	}

	@FindBy (xpath="//a[@id='login2']") private WebElement login;
	@FindBy(xpath="//input[@id='loginusername']") private WebElement username;
	@FindBy(xpath="//input[@id='loginpassword']")private WebElement pass;
	@FindBy (xpath="//button[contains(text(),'Log in')]")private WebElement logbutton;
	
	public void Logintab() {
		login.click();
	}
	public void setuname() {
		username.sendKeys("9404712394");
	}
	public void setpassword() {
		pass.sendKeys("9404712394");
	}
	public void loginbuttonclick() {
		logbutton.click();
	}
	
}
