package org.bajaj_POM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MappingPage {

	WebDriver driver;

	public MappingPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='PCode / Symptom - Variant Mapping']")
	private WebElement pcodeSymptomVarMapping;

	@FindBy(css = "input[type='search']")
	private WebElement searchtextline;

	@FindBy(xpath = "//div[@id='new-mapping-btn']")
	private WebElement mappingAddBtn;

	@FindBy(xpath = "//div[@id='delete-mapping-btn']")
	private WebElement mappingDeleteBtn;

	@FindBy(xpath = "//span[@id='select2-modelId-container']")
	private WebElement modelDropdown;

	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * @return the pcodeSymptomVarMapping
	 */
	public WebElement getPcodeSymptomVarMapping() {
		return pcodeSymptomVarMapping;
	}

	/**
	 * @return the searchtextline
	 */
	public WebElement getSearchtextline() {
		return searchtextline;
	}

	/**
	 * @return the mappingAddBtn
	 */
	public WebElement getMappingAddBtn() {
		return mappingAddBtn;
	}

	/**
	 * @return the mappingDeleteBtn
	 */
	public WebElement getMappingDeleteBtn() {
		return mappingDeleteBtn;
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
	 * @return the pcodeRadioBtn
	 */
	public WebElement getPcodeRadioBtn() {
		return pcodeRadioBtn;
	}

	/**
	 * @return the symptomRadioBtn
	 */
	public WebElement getSymptomRadioBtn() {
		return symptomRadioBtn;
	}

	/**
	 * @return the selectPcodeorSymptom
	 */
	public WebElement getSelectPcodeorSymptom() {
		return selectPcode;
	}

	/**
	 * @return the addBtninAddingpopup
	 */
	public WebElement getAddBtninAddingpopup() {
		return addBtninAddingpopup;
	}

	/**
	 * @return the closePopup
	 */
	public WebElement getClosePopup() {
		return closePopup;
	}

	/**
	 * @return the okOption
	 */
	public WebElement getOkOption() {
		return okOption;
	}

	/**
	 * @return the cancelOption
	 */
	public WebElement getCancelOption() {
		return cancelOption;
	}

	@FindBy(xpath = "//span[@id='select2-variantId-container']")
	private WebElement variantDropdown;

	@FindBy(xpath = "//label[@for='radio4']")
	private WebElement pcodeRadioBtn;

	/**
	 * @return the dropdownSearchtxtbox
	 */
	public WebElement getDropdownSearchtxtbox() {
		return dropdownSearchtxtbox;
	}

	/**
	 * @return the saveBtn
	 */
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	/**
	 * @return the selectPcode
	 */
	public WebElement getSelectPcode() {
		return selectPcode;
	}

	/**
	 * @return the selectSymptom
	 */
	public WebElement getSelectSymptom() {
		return selectSymptom;
	}

	@FindBy(xpath = "//label[@for='radio5']")
	private WebElement symptomRadioBtn;

	/**
	 * @return the checkbox
	 */
	public WebElement getCheckbox() {
		return checkbox;
	}

	@FindBy(xpath = "(//span[@class='select2-selection__rendered'])[4]")
	private WebElement selectPcode;
	
	@FindBy(xpath = "(//span[@class='select2-selection__rendered'])[5]")
	private WebElement selectSymptom;

	@FindBy(xpath = "//button[text()='Add']")
	private WebElement addBtninAddingpopup;

	@FindBy(xpath = "(//div[contains(@class,'-srh-close')])[2]")
	private WebElement closePopup;

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement okOption;

	/**
	 * @return the deleteSuccessMsg
	 */
	public WebElement getDeleteSuccessMsg() {
		return deleteSuccessMsg;
	}

	/**
	 * @return the addingSuccessMsg
	 */
	public WebElement getAddingSuccessMsg() {
		return addingSuccessMsg;
	}

	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancelOption;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement dropdownSearchtxtbox;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveBtn;

	@FindBy(xpath = "//span[@class='checkmark']")
	private WebElement checkbox;

	@FindBy(xpath = "//div[contains(text(),'Mapping has been deleted')]")
	private WebElement deleteSuccessMsg;

	@FindBy(xpath = "//div[contains(text(),'Pcode/Symptom - Variant mapping added')]")
	private WebElement addingSuccessMsg;

	

}
