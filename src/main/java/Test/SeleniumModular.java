package Test;

import java.util.concurrent.TimeUnit;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;



public class SeleniumModular {
	public static String browser;
	static WebDriver driver;
	
	public static void main(String[] args) {
		SeleniumModular test = new SeleniumModular();
		test.setBrowser("Chrome");
		test.setBrowserConfig();
		test.verifyTitle();
	}
	public void setBrowser(String browser) {
		this.browser = browser;
		
	}
	public void setBrowserConfig() {
		String projectLocation =System.getProperty("user.dir");
		
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation + "\\lib\\driver\\geckodriver.exe");
			driver = new ChromeDriver();
		}
	}
	
	@Test
	public void verifyTitle()
	{
		driver.get("https://opensource-demo.orangehrmlive.com");
		String expectedTitle = "OrangeHRM";
		String actualTitle = "";
		
		// get the actual value of title
		actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Assert passed");
	}

}
