package org.bajaj_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * @return the masterIcon
	 */
	public WebElement getMasterIcon() {
		return masterIcon;
	}

	/**
	 * @return the pcode
	 */
	public WebElement getPcode() {
		return pcode;
	}

	/**
	 * @return the symptom
	 */
	public WebElement getSymptom() {
		return symptom;
	}

	/**
	 * @return the variantMapping
	 */
	public WebElement getVariantMapping() {
		return variantMapping;
	}

	/**
	 * @return the dntnavigationMenu
	 */
	public WebElement getDntnavigationMenu() {
		return dntnavigationMenu;
	}

	/**
	 * @return the preCheck
	 */
	public WebElement getPreCheck() {
		return preCheck;
	}

	@FindBy(xpath="//div[text()='Masters']")
	//@FindBy(xpath="//div[@class='nav-icon nav-settings']")
	private WebElement masterIcon;
	
	@FindBy(xpath="//a[text()='PCode']")
	private WebElement pcode;
	
	@FindBy(xpath="//a[text()='Symptom']")
	private WebElement symptom;
	
	@FindBy(xpath="//a[text()='PCode / Symptom - Variant Mapping']")
	private WebElement variantMapping;
		
	@FindBy(xpath="//a[text()='Pre Check']")
	private WebElement preCheck;
	
	
	@FindBy(xpath="//li[@id='dtmenu']")
	private WebElement dntnavigationMenu;
	
}
