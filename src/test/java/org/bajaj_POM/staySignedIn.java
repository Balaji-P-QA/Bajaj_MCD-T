package org.bajaj_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class staySignedIn {

	WebDriver driver;
	
	
	public staySignedIn(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}


	/**
	 * @return the yesBtn
	 */
	public WebElement getYesBtn() {
		return yesBtn;
	}


	/**
	 * @return the dontshowCheckbox
	 */
	public WebElement getDontshowCheckbox() {
		return dontshowCheckbox;
	}


	/**
	 * @return the noBtn
	 */
	public WebElement getNoBtn() {
		return noBtn;
	}

	
	@FindBy(xpath="//input[@value='Yes']")
	private WebElement yesBtn;

	@FindBy(name="DontShowAgain")
	private WebElement dontshowCheckbox;
	
	
	@FindBy(xpath="//input[@value='No']")
	private WebElement noBtn;
	
	
	
}
