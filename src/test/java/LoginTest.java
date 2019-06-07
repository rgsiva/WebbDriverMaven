import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		System.getProperty("webdriver.chrome.driver","//Users//r632871//Documents//Selenium Drivers//chromedriver");
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin() {
		
		driver.get("https://gmail.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("identifierId")).sendKeys("rgsiva.it@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Amma2018#");
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
	}

}
