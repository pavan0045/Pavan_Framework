package com.qa.pomPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver d;

	public Homepage(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
	}

	@FindBy(xpath = "//body/nav[@id='narvbarx']/a[@id='nava']/img[1]")
	private WebElement logo;
	@FindBy(xpath = "//body[1]/nav[1]/a[1]")
	private WebElement prostore;

	public void verifylogo() {
		boolean ans = logo.isDisplayed();
		System.out.println(ans);
		if (ans == true) {
			System.out.println("Logo is displayed");
		}
	}
	
	public void verifyRefreshing() {
		boolean ans=prostore.isDisplayed();
		if(ans==true){
			System.out.println("prostore is Displayed");
			prostore.click();
			System.out.println("Page is Refreshed");
		}
	}
	
	public void verifytile() {
		
		String Etitle="STORE";
		String Atitle=d.getTitle();
		System.out.println("Actual Title = "+Atitle);
		if (Atitle.equals(Etitle)) {
			System.out.println("Tltle is Correct");
		}else {
			System.out.println("Title is Wrong");
		}
	}
}
