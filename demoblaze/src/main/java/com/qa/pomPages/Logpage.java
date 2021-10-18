package com.qa.pomPages;


	
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logpage {
	WebDriver d;
	
	
	public Logpage(WebDriver d) {
		
		PageFactory.initElements(d, this);
		
	}

	@FindBy (xpath="//a[@id='login2']") private WebElement login;
	@FindBy(xpath="//input[@id='loginusername']") private WebElement username;
	@FindBy(xpath="//input[@id='loginpassword']")private WebElement pass;
	@FindBy (xpath="//button[contains(text(),'Log in')]")private WebElement logbutton;
	@FindBy (xpath="//a[@id='nameofuser']")private WebElement welcome;
	@FindBy  (xpath="//a[text()='Log out']")private WebElement logout;
	@FindBy  (xpath="(//button[text()='Close'])[3]")private WebElement close;
	@FindBy  (xpath="//body[1]/nav[1]/a[1]")private WebElement refresh;
	
	
	public void refreshing() {
		refresh.click();
	}
	public void clickclose() {
		close.click();
	}
	
	public void Logintab() {
		login.click();
	}
	public void setuname(String uname) {
		username.sendKeys(uname);
	}
	public void setpassword(String password) {
		pass.sendKeys(password);
	}
	public void loginbuttonclick() {
		logbutton.click();
		
	}
	public void verifywelcome() {
	boolean ans =welcome.isDisplayed();
	if (ans==true ) {
	System.out.println("You are succesfully login ");

	
	}else {
		System.out.println("Login is Failed");
	}
	}
	public void clicklogout() {
		logout.click();
		System.out.println("Successfully logout");
	}
	
}

