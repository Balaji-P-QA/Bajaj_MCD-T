package org.bajaj_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreviewPage {

	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * @return the pcodeInfoIcon
	 */
	public WebElement getPcodeInfoIcon() {
		return pcodeInfoIcon;
	}

	/**
	 * @return the allMappings
	 */
	public WebElement getAllMappings() {
		return allMappings;
	}

	/**
	 * @return the sendForConfirBtn
	 */
	public WebElement getSendForConfirBtn() {
		return sendForConfirBtn;
	}

	/**
	 * @return the expanCollapseAllBtn
	 */
	public WebElement getExpanCollapseAllBtn() {
		return ExpanCollapseAllBtn;
	}

	/**
	 * @return the backBtn
	 */
	public WebElement getBackBtn() {
		return backBtn;
	}

	/**
	 * @return the popupCloseBtn
	 */
	public WebElement getPopupCloseBtn() {
		return popupCloseBtn;
	}

	/**
	 * @return the confirSuccessToaster
	 */
	public WebElement getConfirSuccessToaster() {
		return confirSuccessToaster;
	}

	/**
	 * @return the searchPcodeorSymptom
	 */
	public WebElement getSearchPcodeorSymptom() {
		return searchPcodeorSymptom;
	}

	/**
	 * @return the actionEyeIcon
	 */
	public WebElement getActionEyeIcon() {
		return actionEyeIcon;
	}



	WebDriver driver;
	
	public PreviewPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	

	@FindBy(xpath="//i[@id='tool']")
	private WebElement pcodeInfoIcon;
	
	@FindBy(xpath="//input[@id='Ispcodecheck']")
	private WebElement allMappings;
	
	/**
	 * @return the translateflow
	 */
	public WebElement getTranslateflow() {
		return translateflow;
	}



	@FindBy(xpath="//input[@id='Ispcodecheck']")
	private WebElement sendForConfirBtn;
	
	@FindBy(xpath="(//div[@class='btn-primary-dandt'])[1]")
	private WebElement ExpanCollapseAllBtn;
	
	/**
	 * @return the dnTnavigationMenu
	 */
	public WebElement getDnTnavigationMenu() {
		return dnTnavigationMenu;
	}



	@FindBy(xpath="(//div[@class='btn-primary-dandt'])[2]")
	private WebElement backBtn;
	
	
	@FindBy(xpath="(//div[contains(@class,'popupClose')])[1]")
	private WebElement popupCloseBtn;
	
	@FindBy(xpath="//div[@class='toast toast-success']")
	private WebElement confirSuccessToaster;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchPcodeorSymptom;
	
	@FindBy(xpath="//i[@class='fa fa-eye mr-2']")
	private WebElement actionEyeIcon;
	
	@FindBy(xpath="//a[text()='Translate Flow'] ")
	private WebElement translateflow;
	
	@FindBy(xpath="//div[@class='nav-icon nav-DandT']")
	private WebElement dnTnavigationMenu;
	
	
	
	
	
}
