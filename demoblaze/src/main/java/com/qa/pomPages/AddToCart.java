package com.qa.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	WebDriver d;
	
	
	public AddToCart(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//a[text()='Samsung galaxy s6']") private WebElement samsunggalaxys6;
	@FindBy(xpath="//a[text()='Add to cart']")private WebElement addtocartbutton;
	@FindBy(xpath="//a[text()='Cart']")private WebElement cartTab;
	@FindBy(xpath="//a[text()='Log out']")private WebElement logout;
	public void addtoCartsamsung() {
		boolean ans =samsunggalaxys6.isDisplayed();
		if(ans==true) {
			System.out.println("ITem is Displayed");
			samsunggalaxys6.click();
		}
		}
	public void verifyaddtocartbutton() {
		boolean ans=addtocartbutton.isDisplayed();
		if (ans==true) {
			System.out.println("Button is displayed");
		}else
			System.out.println("Button is Not Diaplayed");
	}
	public void verifyaddtocartbuttonclick() {
		
		boolean ans= addtocartbutton.isSelected();
		if (ans==true ) {
			System.out.println("Button is already Selected NOT Possible TO WORK");
		}else {
			addtocartbutton.click();
			System.out.println("ADD TO Cart buttton operates Fine");
			
		}
		
	}
	public void clickOncartTab() {
		boolean ans=cartTab.isDisplayed();
		if (ans==true) {
			System.out.println("Cart Tab is Available");
			cartTab.click();
			System.out.println("Product is avialabel inn Cart");
		}else {
			System.out.println("Cart is Missing Senario is Failed ");
		}
	}
	public void logoutSoft() {
		boolean ans=logout.isDisplayed();
	if (ans==true) {
		System.out.println("Log Out is Available ");
		logout.click();
	}else {
		System.out.println("Logout not Availbel ");
	}
	
	}
	
	

}
