package ApiProject.DATA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class WindowHand {
	
	static WebDriver driver;
	static String url="https://rahulshettyacademy.com/AutomationPractice/";
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	}
	
}
