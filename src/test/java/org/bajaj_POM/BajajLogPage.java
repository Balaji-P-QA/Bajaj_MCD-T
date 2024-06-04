package org.bajaj_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BajajLogPage {

	public WebDriver driver;
	
	public BajajLogPage(WebDriver driver) {
		
	PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(name = "UserName")
	private WebElement Usernametxtbox;
	
	@FindBy(id = "passwordInput")
	private WebElement Passwordtxtbox;
	
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement signinBtn;

	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * @return the usernametxtbox
	 */
	public WebElement getUsernametxtbox() {
		return Usernametxtbox;
	}

	/**
	 * @return the passwordtxtbox
	 */
	public WebElement getPasswordtxtbox() {
		return Passwordtxtbox;
	}

	/**
	 * @return the signinBtn
	 */
	public WebElement getSigninBtn() {
		return signinBtn;
	}
	
	
	
	
}
