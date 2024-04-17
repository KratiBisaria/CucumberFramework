package ApiProject.DATA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver;
	String url= "https://returns-cpa.safesendreturns.com/";
	
	@BeforeTest
	public void launch() {
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.navigate().to(url);
	driver.manage().window().maximize();
	}
	
	
	@Test()
	public void launch1() {
		
		
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("test170423@yopmail.com");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Test@1234");
		driver.findElement(By.id("btnLogin")).click();
		String header= driver.getTitle();
		System.out.println(header);
		
		driver.findElement(By.xpath("//a[@class='menu-item false nav-link']//span[contains(text(),'Delivered Returns')]")).click();
		driver.findElement(By.xpath("//span[@class='fas fa-angle-down']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Clear Filter')]")).click();
		
		
	}

}
