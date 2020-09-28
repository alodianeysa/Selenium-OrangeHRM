package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SekolahQA {
	public static void main(String[] args) {
		String projectLocator = System.getProperty("user.dir");
		WebDriver driver;
		WebDriverWait wait;
		System.setProperty("webdriver.chrome.driver", projectLocator + "\\lib\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,
				TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		
		String URL = "https://www.sekolahqa.com/";
		driver.get(URL);
		
		String title = driver.getTitle();
		int titleLength = title.length();
		
		System.out.println("Page title : " + title);
		System.out.println("Title Length : " + titleLength);
		
		
		String ActualResult = driver.getCurrentUrl();
		Assert.assertEquals(URL, ActualResult);
		
		String pageSource = driver.getPageSource();
		int lengthPageSource = pageSource.length();
		
		
		System.out.println("Page Source length : " + lengthPageSource);
		
		driver.close();
	}

}
