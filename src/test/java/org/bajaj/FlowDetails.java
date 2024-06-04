package org.bajaj;

import java.util.List;

import org.bajaj_POM.FlowPage;
import org.bajaj_POM.Homepage;
import org.bajaj_base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlowDetails extends BaseClass {

	public FlowPage f;
	public static Actions a;
	int mainCount = 5;
	int subCount = 2;
	int ActionCount = 2;
	public JavascriptExecutor js;
	int numberofActionicons;

	@Test(priority = 5)
	public void flow() throws InterruptedException {

		js = (JavascriptExecutor) driver;

		hold(8000);

		a = new Actions(BaseClass.driver);

		Homepage h = new Homepage(driver);

		a.moveToElement(h.getDntnavigationMenu()).build().perform();
		hold(2000);

		f = new FlowPage(driver);

		f.getFlownavigationMenu().click();

		hold(3000);

		f.getSearchFlowDetailsBtn().click();

		hold(2000);

		f.getModelDropdown().click();
		f.getDropdownsearchbox().sendKeys("Avenger");
		f.getChooseoption().click();

		hold(2000);

		f.getVariantDropdown().click();
		f.getDropdownsearchbox().sendKeys("Avenger");
		f.getChooseoption().click();

		hold(8000);

		String PcodeorSymptom = "Symptom";

		if (PcodeorSymptom.equalsIgnoreCase("Pcode")) {

			js.executeScript("arguments[0].click()", f.getPcodedropdown());

		} else {

			System.out.println("error portion");

			js.executeScript("arguments[0].click()", f.getSymptomRadioBtn());
			
			hold(2000);
			
			a.click(f.getSymptomdropdown()).build().perform();
			
		//	js.executeScript("arguments[0].click()", f.getSymptomdropdown());

		}


		// f.getPcodeOrSymptomdropdown().click();

		MCDnT mc = new MCDnT();
		f.getDropdownsearchbox().sendKeys(mc.symptomName);
		f.getChooseoption().click();

		hold(2000);

		f.getShowBtn().click();

		hold(2000);

		// Clicking precheck ok btn

		f.getPrecheckOkBtn().click();

		hold(5000);

		for (int i = 0; i < mainCount; i++) {

			f.getAddMainstepBtn().click();
			hold(2000);
			driver.switchTo().frame(2);
			driver.findElement(By.xpath("//body")).sendKeys("Main_" + i);
			driver.switchTo().defaultContent();
			hold(2000);
			f.getMainstepSaveDetailsBtn().click();
			hold(3000);

			if (!(i == 0)) {

				List<WebElement> mainscroll = driver.findElements(
						By.xpath("//div[@class='form-control english update treeData input-sm input-level-1']"));
				scrollDown(mainscroll.get(i));
			}

			hold(2000);

			for (int j = 0; j < subCount; j++) {

				/**/ if (!(i == 0)) {

					scrollDown(f.getMainstepSaveDetailsBtn());
					hold(2000);
				}

				try {

					scrollUp(f.getAddSubstepBtn().get(i));
					hold(2000);
					f.getAddSubstepBtn().get(i).click();
					hold(2000);

				} catch (StaleElementReferenceException e) {

					// Element is stale, attempt to find it again and perform the action
					f.getAddSubstepBtn().get(i).click();
					hold(2000);
				}

				driver.switchTo().frame(3);
				driver.findElement(By.xpath("//body")).sendKeys("Sub_" + j);
				driver.switchTo().defaultContent();
				hold(2000);
				f.getSubstepAddingBtn().click();
				hold(2000);
				f.getSubstepSaveDetailsBtn().click();

				hold(3000);

				String Expand1 = f.getExpandallBtn().getText();
				System.out.println("first" + Expand1);

				if (Expand1.equalsIgnoreCase("Expand All")) {

					f.getExpandallBtn().click();

					System.out.println("inside the condition");

					// js.executeScript("arguments[0].click()", f.getExpandallBtn());

					hold(3000);

				}

				if (!(i == 0)) {

					List<WebElement> mainscroll = driver.findElements(
							By.xpath("//div[@class='form-control english update treeData input-sm input-level-1']"));
					scrollDown(mainscroll.get(i));
				}

				if (i != 0) {

					int numberofActionicons = f.getAddActionPlusBtn().size();
					WebElement ele = driver
							.findElement(By.xpath("(//i[@class='fa fa-action-plus'])[" + numberofActionicons + "]"));

					Thread.sleep(4000);

					System.out.println(numberofActionicons);

					js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView(true)", ele);

					hold(4000);

				}

				int numberofActionicons = f.getAddActionPlusBtn().size();

				if (i != 0) {

					WebElement ele = driver
							.findElement(By.xpath("(//i[@class='fa fa-action-plus'])[" + numberofActionicons + "]"));

					js.executeScript("arguments[0].click()", ele);

				}

				else {

					f.getAddActionPlusBtn().get(j).click();

				}

				for (int k = 0; k < ActionCount; k++) {

					driver.switchTo().frame(5);
					driver.findElement(By.xpath("//body")).sendKeys("Action_" + k);
					driver.switchTo().defaultContent();

					f.getYesMsgtxtline().sendKeys("Yes Message_" + k);

					hold(2000);

					f.getNoMsgtxtline().sendKeys("No Message_" + k);

					hold(2000);

					f.getLaststepChkbox().click();

					hold(2000);

					f.getActionAddsubbtn().click();

					hold(3000);

				}

				WebElement scroll = driver.findElement(By.xpath("(//button[@class='btn-primary-dandt'])[2]"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", scroll);

				hold(2000);

				f.getActionSavebtn().click();

				hold(3000);

				String Expand2 = f.getExpandallBtn().getText();

				System.out.println("second" + Expand2);

				if (!Expand2.equals("Expand All")) {

					// js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].click()", f.getExpandallBtn());
					hold(2000);

				}

			}

		}

		String Expand3 = f.getExpandallBtn().getText();

		System.out.println("second" + Expand3);

		if (Expand3.equals("Expand All")) {

			// js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", f.getExpandallBtn());
			hold(2000);

		}

		hold(4000);

		String sendforPreview = "yes";

		if (sendforPreview.equalsIgnoreCase("yes")) {

			f.getSendPreviewBtn().click();
		}

	}

}
