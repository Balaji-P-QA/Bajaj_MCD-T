package org.bajaj_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen {

	WebDriver driver;

	@FindBy(xpath = "//button[@value='BAL Login']")
	private WebElement balBtn;

	@FindBy(xpath = "//input[@name='UserId']")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(className = "login-btn")
	private WebElement letsgoBtn;

	@FindBy(xpath = "//a[text()='Forgot Password?']")
	private WebElement Forgotpasswordlink;

	public LoginScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/**
	 * @return the balBtn
	 */
	public WebElement getBalBtn() {
		return balBtn;
	}

	/**
	 * @return the username
	 */
	public WebElement getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return password;
	}

	/**
	 * @return the letsgoBtn
	 */
	public WebElement getLetsgoBtn() {
		return letsgoBtn;
	}

	/**
	 * @return the forgotpasswordlink
	 */
	public WebElement getForgotpasswordlink() {
		return Forgotpasswordlink;
	}

}
