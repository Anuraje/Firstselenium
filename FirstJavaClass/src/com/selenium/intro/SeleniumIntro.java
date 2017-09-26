package com.selenium.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumIntro {
	String browser;
	WebDriver driver;

	@Parameters({ "browser" })
	public SeleniumIntro(String browser) {
		this.browser = browser;
		System.out.println(browser);

	}

	@BeforeTest
	public void FireBrowser() {
		switch (browser) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			break;
		case "html":
			driver = new HtmlUnitDriver();
			break;
		default:
			break;
		}
	}

	@Test
	public void navigateToHomePage() {
		driver.navigate().to("http://www.google.com");
		

	}

	@Test(dependsOnMethods = "navigateToHomePage")
	public void enterValue() {
		WebElement textbox = driver.findElement(By.xpath(".//*[@id='lst-ib']"));
		textbox.sendKeys("TestNG");
		WebElement submit = driver.findElement(By
				.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
		submit.click();

	}
	@AfterTest
	public void closeApplication() {
		driver.close();
	}

}
