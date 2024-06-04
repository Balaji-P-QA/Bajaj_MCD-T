package org.bajaj_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlowPage {

	WebDriver driver;
		
	public FlowPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@id='userDetails-srh-btn']")
	private WebElement searchFlowDetailsBtn;
	
	@FindBy(xpath="//span[@id='select2-modelId-container']")
	private WebElement modelDropdown;
	
	@FindBy(xpath="//span[@id='select2-variantId-container']")
	private WebElement variantDropdown;
	
	@FindBy(xpath="//label[text()='Symptom']")
	private WebElement symptomRadioBtn;
	
	@FindBy(xpath="(//span[@class='select2-selection__rendered'])[5]")
	private WebElement Pcodedropdown;
	
	
	@FindBy(xpath="(//span[@class='select2-selection__rendered'])[6]")
	private WebElement Symptomdropdown;
	
	@FindBy(xpath="//button[text()='Show']")
	private WebElement showBtn;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	private WebElement dropdownsearchbox;

	@FindBy(xpath="(//li[@role='option'])[1]")
	private WebElement chooseoption;
	
	@FindBy(xpath="//div[text()='Data is not available']")
	private WebElement noFlowMsg;
	
	@FindBy(xpath="//div[@onClick='AddMainStepBtn()']")
	private WebElement addMainstepBtn;
	
	@FindBy(xpath="//iframe[@id='mainStepText_ifr']")
	private WebElement mainstepCreateTxtbox;
	

	@FindBy(xpath="(//button[text()='Save Details '])[3]")
	private WebElement MainstepSaveDetailsBtn;
	
	/**
	 * @return the flownavigationMenu
	 */
	public WebElement getFlownavigationMenu() {
		return flownavigationMenu;
	}

	@FindBy(xpath="//button[@class='addsubstep']")
	private List<WebElement> addSubstepBtn;
	
	@FindBy(xpath="//iframe[@id='subStepText_ifr']")
	private WebElement substepCreateTxtbox;
	
	
	@FindBy(xpath="//a[text()='Flow Details']")
	private WebElement flownavigationMenu;
	
	
	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * @return the searchFlowDetailsBtn
	 */
	public WebElement getSearchFlowDetailsBtn() {
		return searchFlowDetailsBtn;
	}

	/**
	 * @return the modelDropdown
	 */
	public WebElement getModelDropdown() {
		return modelDropdown;
	}

	/**
	 * @return the variantDropdown
	 */
	public WebElement getVariantDropdown() {
		return variantDropdown;
	}

	/**
	 * @return the symptomRadioBtn
	 */
	public WebElement getSymptomRadioBtn() {
		return symptomRadioBtn;
	}

	

	/**
	 * @return the pcodedropdown
	 */
	public WebElement getPcodedropdown() {
		return Pcodedropdown;
	}

	/**
	 * @return the symptomdropdown
	 */
	public WebElement getSymptomdropdown() {
		return Symptomdropdown;
	}

	/**
	 * @return the showBtn
	 */
	public WebElement getShowBtn() {
		return showBtn;
	}

	/**
	 * @return the dropdownsearchbox
	 */
	public WebElement getDropdownsearchbox() {
		return dropdownsearchbox;
	}

	/**
	 * @return the chooseoption
	 */
	public WebElement getChooseoption() {
		return chooseoption;
	}

	/**
	 * @return the noFlowMsg
	 */
	public WebElement getNoFlowMsg() {
		return noFlowMsg;
	}

	/**
	 * @return the addMainstepBtn
	 */
	public WebElement getAddMainstepBtn() {
		return addMainstepBtn;
	}

	/**
	 * @return the mainstepCreateTxtbox
	 */
	public WebElement getMainstepCreateTxtbox() {
		return mainstepCreateTxtbox;
	}

	/**
	 * @return the mainstepSaveDetailsBtn
	 */
	public WebElement getMainstepSaveDetailsBtn() {
		return MainstepSaveDetailsBtn;
	}

	/**
	 * @return the addSubstepBtn
	 */
	public List<WebElement> getAddSubstepBtn() {
		return addSubstepBtn;
	}

	/**
	 * @return the substepCreateTxtbox
	 */
	public WebElement getSubstepCreateTxtbox() {
		return substepCreateTxtbox;
	}

	/**
	 * @return the addBtn
	 */
	public WebElement getAddBtn() {
		return addBtn;
	}

	/**
	 * @return the substepSaveDetailsBtn
	 */
	public WebElement getSubstepSaveDetailsBtn() {
		return substepSaveDetailsBtn;
	}

	/**
	 * @return the addActionPlusBtn
	 */
	public List<WebElement> getAddActionPlusBtn() {
		return addActionPlusBtn;
	}

	/**
	 * @return the subAttachmentIcon
	 */
	public List<WebElement> getSubAttachmentIcon() {
		return subAttachmentIcon;
	}

	/**
	 * @return the subParameterIcon
	 */
	public List<WebElement> getSubParameterIcon() {
		return subParameterIcon;
	}

	/**
	 * @return the deleteIcon
	 */
	public List<WebElement> getDeleteIcon() {
		return deleteIcon;
	}

	@FindBy(xpath="//button[text()='Add ']")
	private WebElement addBtn;
	
	/**
	 * @return the nonePrecheck
	 */
	public WebElement getNonePrecheck() {
		return nonePrecheck;
	}

	/**
	 * @return the precheckOkBtn
	 */
	public WebElement getPrecheckOkBtn() {
		return precheckOkBtn;
	}

	@FindBy(xpath="//button[@onClick='SaveSubSteps()']")
	private WebElement substepSaveDetailsBtn;
	
	/**
	 * @return the substepAddingBtn
	 */
	public WebElement getSubstepAddingBtn() {
		return substepAddingBtn;
	}

	/**
	 * @return the expandallBtn
	 */
	public WebElement getExpandallBtn() {
		return expandallBtn;
	}

	@FindBy(xpath="//i[@class='fa fa-action-plus']")
	private List<WebElement> addActionPlusBtn;
	
	@FindBy(xpath="//button[@class='attach attach-button']")
	private List<WebElement> subAttachmentIcon;
	
	@FindBy(xpath="//i[@class='fa fa-tag']")
	private List<WebElement> subParameterIcon;
	
	@FindBy(xpath="//i[@class='fa fa-remove j-remove']")
	private List<WebElement> deleteIcon;
	
	@FindBy(xpath="//div[@id='noneprecheck']")
	private WebElement nonePrecheck;
	
	@FindBy(xpath="//button[text()='Ok']")
	private WebElement precheckOkBtn;
	
	@FindBy(xpath="//button[text()='Add ']")
	private WebElement substepAddingBtn;
	
	@FindBy(xpath="(//div[@class='btn-secondary-dandt'])[2]")
	private WebElement expandallBtn;
	
	@FindBy(xpath="//input[@id='yesText']")
	private WebElement yesMsgtxtline;
	
	/**
	 * @return the yesMsgtxtline
	 */
	public WebElement getYesMsgtxtline() {
		return yesMsgtxtline;
	}

	/**
	 * @return the noMsgtxtline
	 */
	public WebElement getNoMsgtxtline() {
		return noMsgtxtline;
	}

	/**
	 * @return the actionAddingBtn
	 */
	public WebElement getActionAddingBtn() {
		return actionAddingBtn;
	}

	/**
	 * @return the laststepChkbox
	 */
	public WebElement getLaststepChkbox() {
		return laststepChkbox;
	}

	/**
	 * @return the yesGotostep
	 */
	public WebElement getYesGotostep() {
		return yesGotostep;
	}

	/**
	 * @return the noGotostep
	 */
	public WebElement getNoGotostep() {
		return noGotostep;
	}

	/**
	 * @return the actionAddsubbtn
	 */
	public WebElement getActionAddsubbtn() {
		return actionAddsubbtn;
	}

	/**
	 * @return the actionSavebtn
	 */
	public WebElement getActionSavebtn() {
		return actionSavebtn;
	}

	@FindBy(xpath="//input[@id='noText']")
	private WebElement noMsgtxtline;
	
	@FindBy(xpath="//button[@onClick='AddActionList()']")
	private WebElement actionAddingBtn;
	
	@FindBy(xpath="//input[@name='myCheck']")
	private WebElement laststepChkbox;
	
	/**
	 * @return the sendPreviewBtn
	 */
	public WebElement getSendPreviewBtn() {
		return sendPreviewBtn;
	}

	@FindBy(xpath="(//span[@title='Select'])[1]")
	private WebElement yesGotostep;

	@FindBy(xpath="(//span[@title='Select'])[2]")
	private WebElement noGotostep;
	
	@FindBy(xpath="//button[@onclick='AddActionList()']")
	private WebElement actionAddsubbtn;
	
	@FindBy(xpath="//button[@onclick='SaveActionDetails()']")
	private WebElement actionSavebtn;
	
	@FindBy(xpath="//div[@id='sendForTranslationBtn']")
	private WebElement sendPreviewBtn;
	
	
	
}
