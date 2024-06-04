package org.bajaj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.bajaj_POM.BajajLogPage;
import org.bajaj_POM.Homepage;
import org.bajaj_POM.MappingPage;
import org.bajaj_base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class VariantMapping extends BaseClass{

	public Actions a;
	Homepage h;
	int mappingCount = 1;
	int modelCount = 4;
	String Pcode_symptom;

	/*
	 * String[] mappingNameval = new String[mappingCount]; { mappingNameval[0] =
	 * "CT"; mappingNameval[1] = "Avenger"; mappingNameval[2] = "Pulsar";
	 * mappingNameval[3] = "Dominar"; mappingNameval[4] = "Platina"; }
	 */

	@Test(priority=4)
	public void mapping() throws InterruptedException, AWTException {

		a = new Actions(BaseClass.driver);

		Robot r = new Robot();

		h = new Homepage(driver);
		
		MappingPage m = new MappingPage(driver);

		a.moveToElement(h.getMasterIcon()).build().perform();
		
		hold(2000);
		
		m.getPcodeSymptomVarMapping().click();

		hold(5000);

		String UserLikesto = "Add";

		
		if (UserLikesto.equalsIgnoreCase("Add")) {

			m.getMappingAddBtn().click();

			hold(1000);

			m.getModelDropdown().click();
			hold(2000);

			m.getDropdownSearchtxtbox().clear();
			m.getDropdownSearchtxtbox().sendKeys("Avenger");
			hold(2000);
			driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
			//r.keyPress(KeyEvent.VK_ENTER);

			hold(5000);

			m.getVariantDropdown().click();
			hold(2000);
			
			m.getDropdownSearchtxtbox().clear();
			m.getDropdownSearchtxtbox().sendKeys("Avenger 160/220");
			hold(2000);
			driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
			//r.keyPress(KeyEvent.VK_ENTER);
			
			hold(5000);

			String continuewith = "symptom";

			if (continuewith.equalsIgnoreCase("Pcode")) {

			//	m.getPcodeRadioBtn().click();

				hold(2000);

				m.getSelectPcode().click();
				

				m.getDropdownSearchtxtbox().clear();
				MCDnT mc  = new MCDnT();
				m.getDropdownSearchtxtbox().sendKeys(mc.pcodeName);
				Pcode_symptom = m.getDropdownSearchtxtbox().getAttribute("value");
                driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
				//r.keyPress(KeyEvent.VK_ENTER);

			} else {

				m.getSymptomRadioBtn().click();

				hold(2000);

				m.getSelectSymptom().click();
	
				m.getDropdownSearchtxtbox().clear();
				MCDnT mc  = new MCDnT();
				m.getDropdownSearchtxtbox().sendKeys(mc.symptomName);
				Pcode_symptom = m.getDropdownSearchtxtbox().getAttribute("value");
				driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
				//r.keyPress(KeyEvent.VK_ENTER);

			}

			hold(2000);

			m.getAddBtninAddingpopup().click();

			hold(2000);

			m.getSaveBtn().click();

			System.out.println(Pcode_symptom + " " + m.getAddingSuccessMsg().getText());

		} else if (UserLikesto.equalsIgnoreCase("delete")) {
			

			String DeletePcodeSymptomName = "";

			try {

				m.getSearchtextline().clear();
				m.getSearchtextline().sendKeys(DeletePcodeSymptomName);

				hold(2000);

				m.getCheckbox().click();

				hold(2000);

				String areYouSureWantDelete = "yes";

				if (areYouSureWantDelete.equalsIgnoreCase("Yes")) {

					driver.findElement(By.xpath("//button[text()='OK']")).click();

					wait(9);

					System.out.println(DeletePcodeSymptomName + " " + m.getDeleteSuccessMsg().getText());

				} else {

					m.getCancelOption().click();

				}

			} catch (Exception e) {

				System.out.println("The user's expectation to delete the Variant Mapping is not available.");

			}

		}

	}

}
