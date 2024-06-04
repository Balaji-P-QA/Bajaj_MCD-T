package org.bajaj;

import org.bajaj_POM.Homepage;
import org.bajaj_POM.PreviewPage;
import org.bajaj_base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Preview extends BaseClass {

	MCDnT m = new MCDnT();
	String WantstoViewPcodeInfo = "Yes";
	String WantstoClosePcodeInfo = "Yes";
	String HowsendConfirmation = "All";
	Actions a;

	@Test(priority = 6)
	private void preview() throws InterruptedException {
	
		hold(2000);
		
		PreviewPage p = new PreviewPage(driver);
		
		Homepage h = new Homepage(driver);

		//a.moveToElement(h.getDntnavigationMenu()).build().perform();
		//hold(2000);
			
		
		click(p.getDnTnavigationMenu());
				
	//	a.moveToElement(p.getDnTnavigationMenu()).build().perform();
		
		hold(2000);
		
		a.moveToElement(p.getTranslateflow()).build().perform();
		
		hold(2000);
		
		click(p.getTranslateflow());
		
		hold(5000);

		//searching the Pcode/Symptom
		p.getSearchPcodeorSymptom().clear();
		p.getSearchPcodeorSymptom().sendKeys(m.pcodeName);

		hold(2000);

		//Clicking Action Icon
		p.getActionEyeIcon().click();

		if (WantstoViewPcodeInfo.equalsIgnoreCase("Yes")) {

			//Clicking PcodeInfo icon
			p.getPcodeInfoIcon().click();

			Thread.sleep(5000);

			//Closing PcodeInfo icon
			if (WantstoClosePcodeInfo.equalsIgnoreCase("Yes")) {

				p.getPopupCloseBtn().click();

			}

		}

		//Sending the Flows from Preview to Confirmation
		
		//single wants to send confirmation if block will execute.
		
		//each wants to send confirmation if block will execute.
		//all wants to send confirmation else block will execute.
		
		if (HowsendConfirmation.equalsIgnoreCase("Single")) {

			//clicking the Confirmation btn
			p.getSendForConfirBtn().click();

			hold(2000);

		} else {

			//clicking the AllMappings checkbox
			p.getAllMappings().click();

			hold(2000);

			//clicking the Confirmation btn
			p.getSendForConfirBtn();

		}

		// WebElement confirSuccessToaster = p.getConfirSuccessToaster();
		
		//validation flow send toaster message.
		if (p.getConfirSuccessToaster().isDisplayed()) {

			System.out.println(p.getConfirSuccessToaster().getText());

		} else {

			System.out.println("Priviews not send to Confirmation");

		}

	}

}
