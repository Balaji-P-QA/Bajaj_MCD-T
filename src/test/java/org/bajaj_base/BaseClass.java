package org.bajaj_base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	
	public void launchBrowser(String Browsername) {

		if (Browsername.equalsIgnoreCase("Chrome")) {


			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();

		} else if (Browsername.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver();

		} else {

			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver();
			
		}

	}

	public void launchURL(String url) {
		
		driver.get(url);

	}
	
	public void maxmizeWindow() {
		driver.manage().window().maximize();

	}

	public void minimizeWindow() {
		driver.manage().window().minimize();

	}

	public void closeBrowser() {

		driver.close();

	}

	public void quitBrowser() {

		driver.quit();

	}

	public void hold(int time) throws InterruptedException {
		
		Thread.sleep(time);

	}
	
	
	public void wait(int sec) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

	}
	
	
	public void scrollDown(WebElement scrlocation) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrlocation);

	}
	
   public void scrollUp(WebElement scrlocation) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scrlocation);

	}
	
	
   public void click(WebElement scrlocation) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", scrlocation);

	}
	
	
	
	
	
	
	
	
	
}
