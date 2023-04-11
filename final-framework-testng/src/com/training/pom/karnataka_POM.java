package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class karnataka_POM {
	private WebDriver driver; 
	
	public karnataka_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
//   locating webElement
	@FindBy(id = "nav-menu-item-127106")
//	 creating variable for webElement
	private WebElement expLink; 
	
	
//	
//	@FindBy(name="password")
//	private WebElement password;
//	
//	@FindBy(xpath ="//*[@type='submit']")
//	private WebElement loginBtn; 
//	
	
	
//	creating function for commands
	public void clickonExp() {
		this.expLink.click() ;
	}

//	public void sendPassword(String password) {
//		this.password.clear(); 
//		this.password.sendKeys(password); 
//	}
//	
//	public void clickLoginBtn() {
//		this.loginBtn.click(); 
//	}
}
