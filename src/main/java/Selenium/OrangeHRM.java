package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {
	public static void main(String[] args) {
		String projectLocator = System.getProperty("user.dir");
		WebDriver driver;
		WebDriverWait wait;
		System.setProperty("webdriver.chrome.driver", projectLocator + "\\lib\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,
				TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		
		String URL = "https://opensource-demo.orangehrmlive.com";
		driver.get(URL);
		
		By inputUsername = By.id("txtUsername");
		By inputPassword = By.id("txtPassword");
		By btnLogin = By.id("btnLogin");
		//By btnLogin = By.name("Submit");
		By btnAdmin = By.id("menu_admin_viewAdminModule");
		By btnUserMng = By.id("menu_admin_UserManagement");
		By setText = By.id("searchSystemUser_userName");
		By btnSearch = By.id("searchBtn");
		
		
		driver.findElement(inputUsername).sendKeys("Admin");
		driver.findElement(inputPassword).sendKeys("admin123");
		driver.findElement(btnLogin).click();
		driver.findElement(btnAdmin).click();
		driver.findElement(btnUserMng).click();
		driver.findElement(setText).sendKeys("Kevin");
		driver.findElement(btnSearch).click();
		
		
		
		
		
		
		
		
		
		
		
		

}
}