package org.bajaj_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MicLoginpage {

	public WebDriver driver;
	
	public MicLoginpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}	
	
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement nextBtn;

	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * @return the email
	 */
	public WebElement getEmail() {
		return email;
	}

	/**
	 * @return the nextBtn
	 */
	public WebElement getNextBtn() {
		return nextBtn;
	}
	
	
}
