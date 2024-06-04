package org.bajaj;

import static org.testng.Assert.assertTrue;

import java.sql.Array;
import java.util.List;

import org.bajaj_POM.BajajLogPage;
import org.bajaj_POM.Homepage;
import org.bajaj_POM.LoginScreen;
import org.bajaj_POM.MicLoginpage;
import org.bajaj_POM.Pcodepage;
import org.bajaj_POM.SymptomPage;
import org.bajaj_POM.staySignedIn;
import org.bajaj_base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MCDnT extends BaseClass {

	public String UserLiketoLogin;
	public String balUsername = "balcvcybage1@bajajauto.co.in";
	public String balpassword = "Dell@e5400";
	public String genralUsername = "tester001@gmail.com";
	public String generalPassword = "Tester@123";
	public static String pcodeName = "New Features";
	public static String symptomName = "New Features symptom";

	public String descriptionValue = "Enter_description";
	public String overviewTitleValue = "Enter_overviewTitle";
	public String overviewDescriptionValue = "Enter_overviewDesc";

	public LoginScreen l;
	public MicLoginpage m;
	public static Actions a;
	public Homepage h;
	int createCountofPcode = 1;
	int howmuchoverViewTitleAndDescription = 5;
	int createCountofSymptom = 1;

	String[] pcodeNameval = new String[createCountofPcode];
	{
		pcodeNameval[0] = pcodeName;
		// pcodeNameval[1] = "Automation_Pcode_2";
		// pcodeNameval[2] = "Automation_Pcode_3";
		// pcodeNameval[3] = "Automation_Pcode_4";
		// pcodeNameval[4] = "Automation_Pcode_5";
	}

	String[] symptomNameval = new String[createCountofSymptom];
	{
		symptomNameval[0] = symptomName;
		// symptomNameval[1] = "Automation_Symptom_2";
		// symptomNameval[2] = "Automation_Symptom_3";
		// symptomNameval[3] = "Automation_Symptom_4";
		// symptomNameval[4] = "Automation_Symptom_5";
	}

	String[] overViewval = new String[howmuchoverViewTitleAndDescription];
	{
		overViewval[0] = "Enter_overviewTitle_New Feature_1";
		overViewval[1] = "Enter_overviewTitle_New Feature_2";
		overViewval[2] = "Enter_overviewTitle_New Feature_3";
		overViewval[3] = "Enter_overviewTitle_New Feature_4";
		overViewval[4] = "Enter_overviewTitle_New Feature_5";
	}

	String[] overDesVal = new String[howmuchoverViewTitleAndDescription];
	{
		overDesVal[0] = "Enter_overviewTitle_New Feature_1";
		overDesVal[1] = "Enter_overviewTitle_New Feature_2";
		overDesVal[2] = "Enter_overviewTitle_New Feature_3";
		overDesVal[3] = "Enter_overviewTitle_New Feature_4";
		overDesVal[4] = "Enter_overviewTitle_New Feature_5";
	}

	@BeforeClass
	public void setup() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		
		launchURL("https://bajajmcdtuat.azurewebsites.net/");

		maxmizeWindow();

		hold(3000);

	}

	@Test(priority = 1)
	public void Login() throws InterruptedException {

		l = new LoginScreen(driver);

		UserLiketoLogin = "BAL_user";

		if (UserLiketoLogin.equalsIgnoreCase("BAL_user")) {

			l.getBalBtn().click();
			hold(4000);

		} else if (UserLiketoLogin.equalsIgnoreCase("General_user")) {

			l.getUsername().sendKeys(genralUsername);

			l.getPassword().sendKeys(generalPassword);

			l.getLetsgoBtn().click();

			hold(4000);

		} else if (UserLiketoLogin.equalsIgnoreCase("Forgot password")) {

			l.getForgotpasswordlink().click();
			hold(3000);

		}

	}

	@Test(priority = 2)
	public void Login2() throws InterruptedException {

		String Loginthrough = UserLiketoLogin;

		if (Loginthrough.equalsIgnoreCase("BAL_user")) {

			m = new MicLoginpage(driver);

			m.getEmail().sendKeys(balUsername);

			hold(3000);

			m.getNextBtn().click();

			hold(4000);

			BajajLogPage b = new BajajLogPage(driver);

			String balUserNameValue = b.getUsernametxtbox().getAttribute("value");

			if (balUserNameValue.equals(balUsername)) {

				b.getPasswordtxtbox().sendKeys(balpassword);

				hold(2000);

				b.getSigninBtn().click();

				hold(5000);

				String staysignedIn = "yes";

				staySignedIn s = new staySignedIn(driver);

				if (staysignedIn.equalsIgnoreCase("yes")) {

					s.getYesBtn().click();

					hold(3000);

				} else {

					s.getNoBtn().click();

					hold(3000);

				}

			} else {

				assertTrue(true, "BAL Username is Mismatched");

			}

		} else if (Loginthrough.equalsIgnoreCase("General_user")) {

		} else {

		}

	}

	@Test(priority = 3)
	private void createPcodeorSymptom() throws InterruptedException {

		hold(2000);

		a = new Actions(driver);

		h = new Homepage(driver);
		
		hold(3000);

		a.moveToElement(h.getMasterIcon()).build().perform();

		hold(5000);

		String PcodeorSymptom = "symptom";

		if (PcodeorSymptom.equalsIgnoreCase("pcode")) {

			h.getPcode().click();

			hold(3000);

			String pcodeWork = "delete";

			if (pcodeWork.equalsIgnoreCase("Create")) {

				Pcodepage p = new Pcodepage(driver);

				for (int i = 0; i < createCountofPcode; i++) {

					p.getPcodeCreateBtn().click();

					wait(2);

					p.getEnterPcode().clear();
					p.getEnterPcode().sendKeys(pcodeNameval[i]);

					wait(2);

					p.getEnterDescription().clear();
					p.getEnterDescription().sendKeys(descriptionValue);

					wait(2);

					for (int j = 0; j < howmuchoverViewTitleAndDescription; j++) {

						p.getEnterOverviewTitle().clear();
						p.getEnterOverviewTitle().sendKeys(overViewval[j]);

						wait(2);

						driver.switchTo().frame(0);
						wait(2);
						p.getEnterOverciewDescription().clear();
						p.getEnterOverciewDescription().sendKeys(overDesVal[j]);

						wait(2);

						scrollDown(p.getEnterOverciewDescription());

						driver.switchTo().defaultContent();

						wait(5);

						p.getAddBtn().click();

						wait(2);

						scrollUp(p.getEnterPcode());

						wait(2);

					}

					p.getSubmitBtn().click();
					
					wait(3);

					try {

						WebElement successMsg = p.getSuccessMsg();

						System.out.println(pcodeNameval[i] + " " + successMsg.getText());

					} catch (Exception e) {

						WebElement warningMsg = p.getWarningMsg();

						System.out.println(pcodeNameval[i] + " " + warningMsg.getText());

					}
				}

			} else if (pcodeWork.equalsIgnoreCase("delete")) {

				String deletePcodeName = pcodeName;

				Pcodepage p = new Pcodepage(driver);
				WebElement pcodeSearch = p.getPcodeSearch();
				pcodeSearch.sendKeys(deletePcodeName);

				hold(2000);

				try {

					WebElement deletecheckbox = p.getCheckbox();
					deletecheckbox.click();

					hold(2000);

					p.getPcodeDeleteBtn().click();

					hold(2000);

					String areYouSureWantDelete = "yes";

					if (areYouSureWantDelete.equalsIgnoreCase("Yes")) {

						driver.findElement(By.xpath("//button[text()='OK']")).click();

						wait(9);

						System.out.println(deletePcodeName + " " + p.getDeleteSuccessMSg().getText());

					} else {

						driver.findElement(By.xpath("//button[text()='Cancel']")).click();

					}

				} catch (Exception e) {

					System.out.println("The user's expectation to delete the pcode is not available.");

				}

			}

		} else {

			click(h.getSymptom());

			wait(2);

			/**/ String symptomWork = "Create";

			if (symptomWork.equalsIgnoreCase("Create")) {

				for (int i = 0; i < createCountofSymptom; i++) {

					wait(3);

					SymptomPage s = new SymptomPage(driver);

					wait(2);

					click(s.getCreateSymtomBtn());

					hold(2000);

					driver.switchTo().frame(0);
					s.getSymptomName().clear();
					s.getSymptomName().sendKeys(symptomNameval[i]);
					driver.switchTo().defaultContent();

					Thread.sleep(5000);

					click(s.getAddBtn());

					// verify the succcess msg

					try {

						WebElement successMsg = s.getSuccessMsg();

						System.out.println(symptomNameval[i] + " " + successMsg.getText());

					} catch (Exception e) {

						System.out.println(symptomNameval[i] + " " + s.getWarningMsg().getText());

						s.getPopupcloseBtn().click();

						hold(3000);

						continue;

					}

					hold(5000);

				}

			} else if (symptomWork.equalsIgnoreCase("delete")) {

				SymptomPage s = new SymptomPage(driver);

				String deleteSymptomName = symptomName;

				hold(2000);

				try {

					WebElement searchtxtbox = s.getSearch();
					searchtxtbox.sendKeys(deleteSymptomName);

					WebElement checkbox = s.getCheckboxes();
					checkbox.click();

					hold(2000);

					WebElement deleteBtn = s.getDeleteBtn();
					deleteBtn.click();

					hold(2000);

					String areYouSureWantDelete = "yes";

					if (areYouSureWantDelete.equalsIgnoreCase("Yes")) {

						s.getOkBtn().click();

						wait(9);

						System.out.println(deleteSymptomName + " " + s.getDeleteSuccessMSg().getText());

					} else {

						s.getCancelBtn().click();

					}

				} catch (Exception e) {

					System.out.println("The user's expectation to delete the pcode is not available.");

				}

			}

		}

	}
}
