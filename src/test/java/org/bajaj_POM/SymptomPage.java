package org.bajaj_POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SymptomPage {

	WebDriver driver;

	public SymptomPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "input[type='search']")
	private WebElement search;

	/**
	 * @return the symptomVerifying
	 */
	public List<WebElement> getSymptomVerifying() {
		return symptomVerifying;
	}

	@FindBy(css = "div[id='addsymptom-btn']")
	private WebElement createSymtomBtn;

	@FindBy(xpath = "//div[@onclick='delete_symptom()']")
	private WebElement deleteBtn;

	@FindBy(xpath = "//tr[@role='row']")
	private List<WebElement> symptomVerifying;

	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * @return the search
	 */
	public WebElement getSearch() {
		return search;
	}

	/**
	 * @return the createSymtomBtn
	 */
	public WebElement getCreateSymtomBtn() {
		return createSymtomBtn;
	}

	/**
	 * @return the deleteBtn
	 */
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	/**
	 * @return the translateBtn
	 */
	public WebElement getTranslateBtn() {
		return translateBtn;
	}

	/**
	 * @return the editIcon
	 */
	public WebElement getEditIcon() {
		return editIcon;
	}

	/**
	 * @return the checkboxes
	 */
	public WebElement getCheckboxes() {
		return checkboxes;
	}

	/**
	 * @return the symptomName
	 */
	public WebElement getSymptomName() {
		return symptomName;
	}

	/**
	 * @return the popupcloseBtn
	 */
	public WebElement getPopupcloseBtn() {
		return popupcloseBtn;
	}

	/**
	 * @return the addBtn
	 */
	public WebElement getAddBtn() {
		return addBtn;
	}

	@FindBy(xpath = "//div[@id='translateSymptom']")
	private WebElement translateBtn;

	@FindBy(className = "editsysmptom-btn")
	private WebElement editIcon;

	@FindBy(xpath = "//span[@class='checkmark']")
	private WebElement checkboxes;

	/**
	 * @return the successMsg
	 */
	public WebElement getSuccessMsg() {
		return successMsg;
	}

	/**
	 * @return the warningMsg
	 */
	public WebElement getWarningMsg() {
		return warningMsg;
	}

	@FindBy(xpath = "//body[@data-id='symptom']")
	private WebElement symptomName;

	@FindBy(xpath = "//div[@class='popupClose add-close']")
	private WebElement popupcloseBtn;

	@FindBy(xpath = "//button[@onClick='symptom_save()']")
	private WebElement addBtn;

	@FindBy(xpath = "//div[text()='Symptom has been added successfully.']")
	private WebElement successMsg;

	/**
	 * @return the deleteSuccessMSg
	 */
	public WebElement getDeleteSuccessMSg() {
		return deleteSuccessMSg;
	}


	/**
	 * @return the okBtn
	 */
	public WebElement getOkBtn() {
		return okBtn;
	}

	/**
	 * @return the cancelBtn
	 */
	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	@FindBy(xpath = "//div[text()='Entered symptom is already exist.']")
	private WebElement warningMsg;

	@FindBy(xpath = "//div[text()='Symptom has been deleted successfully.']")
	private WebElement deleteSuccessMSg;

	@FindBy(xpath = "(//a[@class='page-link'])[2]")
	private WebElement nextPageSlider;

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement okBtn;

	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancelBtn;

	/**
	 * @return the nextPageSlider
	 */
	public WebElement getNextPageSlider() {
		return nextPageSlider;
	}

}
