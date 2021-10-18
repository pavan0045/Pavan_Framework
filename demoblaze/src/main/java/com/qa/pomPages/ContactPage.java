package com.qa.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	WebDriver d;

	public  ContactPage (WebDriver d) {
		PageFactory.initElements(d, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Contact')]")
	private WebElement contactTab;
	@FindBy(xpath = "//input[@id='recipient-email']")
	private WebElement contactEmail;
	@FindBy(xpath = "//input[@id='recipient-name']")
	private WebElement contactName;
	@FindBy(xpath = "//textarea[@id='message-text']")
	private WebElement message;
	@FindBy(xpath = "(//button[text()='Close'])[1]")
	private WebElement close;

	public void verifyContactTab() {
		boolean ans = contactTab.isDisplayed();
		if (ans == true) {
			System.out.println("COntact tab is Available ");
			contactTab.click();
		} else {
			System.out.println("Conatct tab is Not Avaialble");
		}
	}

	public void verifycontactEmail() {
		boolean ans = contactEmail.isDisplayed();
		if (ans == true) {
			System.out.println("contactmail is enabled");
			contactEmail.sendKeys("xyz@gmail.com");
		} else {
			System.out.println("ContactEmail Is Disabled");
		}

	}

	public void verifycontactName() {
		boolean ans = contactName.isEnabled();
		if (ans == true) {
			System.out.println("contactName is Enabled ");
			contactName.sendKeys("Pavan Pawar");
		}
	}

	public void verifymessage() {
		boolean ans = message.isEnabled();
		if (ans == true) {
			System.out.println("message is Enabled ");
			message.sendKeys("Hey hii ");
		} else {
			System.out.println("message is DisaBled");
		}
	}
   public void verifyclosebutton() {
	 boolean  ans =close.isDisplayed();
	 if (ans==true) {
		 System.out.println("closeButton is displayed");
		 close.click();
	 }else {
		 System.out.println("Close Button is Not Available");
	 }
	   
   }

}
