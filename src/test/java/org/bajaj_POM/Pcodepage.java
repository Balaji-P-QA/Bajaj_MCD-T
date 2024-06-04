package org.bajaj_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pcodepage {

	WebDriver driver;
	
	public Pcodepage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//div[@id='pcode-add-btn']")
	private WebElement pcodeCreateBtn;
	
	@FindBy(xpath = "//div[@class ='btn-primary-dandt']")
	private WebElement pcodeDeleteBtn;
	
	
	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * @return the pcodeCreateBtn
	 */
	public WebElement getPcodeCreateBtn() {
		return pcodeCreateBtn;
	}

	/**
	 * @return the pcodeDeleteBtn
	 */
	public WebElement getPcodeDeleteBtn() {
		return pcodeDeleteBtn;
	}

	/**
	 * @return the pcodeSearch
	 */
	public WebElement getPcodeSearch() {
		return pcodeSearch;
	}

	/**
	 * @return the checkbox
	 */
	public WebElement getCheckbox() {
		return checkbox;
	}

	/**
	 * @return the editIcon
	 */
	public List<WebElement> getEditIcon() {
		return editIcon;
	}

	/**
	 * @return the viewIcon
	 */
	public List<WebElement> getViewIcon() {
		return viewIcon;
	}

	/**
	 * @return the translateIcon
	 */
	public List<WebElement> getTranslateIcon() {
		return translateIcon;
	}

	/**
	 * @return the enterPcode
	 */
	public WebElement getEnterPcode() {
		return enterPcode;
	}

	/**
	 * @return the enterDescription
	 */
	public WebElement getEnterDescription() {
		return enterDescription;
	}

	/**
	 * @return the enterOverviewTitle
	 */
	public WebElement getEnterOverviewTitle() {
		return enterOverviewTitle;
	}

	/**
	 * @return the enterOverciewDescription
	 */
	public WebElement getEnterOverciewDescription() {
		return enterOverciewDescription;
	}

	/**
	 * @return the addBtn
	 */
	public WebElement getAddBtn() {
		return addBtn;
	}

	/**
	 * @return the submitBtn
	 */
	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	@FindBy(xpath="//input[@type='search']")
	private WebElement pcodeSearch;
	
	@FindBy(xpath="//span[@class='checkmark']")
	private WebElement checkbox;
	
	@FindBy(xpath="//i[@title='Edit']")
	private List<WebElement> editIcon;
	
	@FindBy(xpath="//i[@title='View']")
	private List<WebElement> viewIcon;
	
	@FindBy(xpath="//i[@title='Translate']")
	private List<WebElement> translateIcon;


	//
	
	/**
	 * @return the warningMsg
	 */
	public WebElement getWarningMsg() {
		return warningMsg;
	}

	/**
	 * @return the successMsg
	 */
	public WebElement getSuccessMsg() {
		return successMsg;
	}

	@FindBy(xpath="//div[text()='PCode already exist.']")
	private WebElement warningMsg;
	
	@FindBy(xpath="//div[text()='PCode sdf has been added successfully.']")
	private WebElement successMsg;
	
	/**
	 * @return the pcodeVerifying
	 */
	public List<WebElement> getPcodeVerifying() {
		return pcodeVerifying;
	}

	/**
	 * @return the deleteSuccessMSg
	 */
	public WebElement getDeleteSuccessMSg() {
		return deleteSuccessMSg;
	}

	/**
	 * @return the nextPageLink
	 */
	public WebElement getNextPageLink() {
		return nextPageLink;
	}

	@FindBy(xpath = "//input[@id='pcode']")
	private WebElement enterPcode;
	
	@FindBy(xpath = "//input[@id='Description']")
	private WebElement enterDescription;
	
	@FindBy(xpath="//input[@id='OverViewKey']")
	private WebElement enterOverviewTitle;
	
	@FindBy(xpath="//body[@class='mce-content-body ']")
	private WebElement enterOverciewDescription;
		
	@FindBy(xpath="//button[@id='addOverview']")
	private WebElement addBtn;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath="//tr[@role='row']")
	private List<WebElement> pcodeVerifying;
	
	@FindBy(xpath="//div[text()='PCode has been deleted successfully.']")
	private WebElement deleteSuccessMSg;
	
	@FindBy(xpath="(//a[@class='page-link'])[2]")
	private WebElement nextPageLink;
	
	
}
