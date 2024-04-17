package ApiProject.DATA;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShot {
	
	WebDriver driver;
	String url="https://rahulshettyacademy.com/AutomationPractice/";
	
	@BeforeTest
	public void launch() {
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.navigate().to(url);
	driver.manage().window().maximize();
	}
	
	@Test(enabled=false)
	public void captureScreen() throws IOException {
//	driver.findElement(By.xpath("//*[id='cs-er']")).sendKeys("agile");
	//if(ITestResult.FAILURE==result.getStatus()) {
		File destFile = null;
		if(destFile.exists()) {
			FileUtils.delete(destFile);	
		}
	TakesScreenshot scrshot= ((TakesScreenshot) driver);
	File srcFile= scrshot.getScreenshotAs(OutputType.FILE);
	destFile= new File("E:\\SrcFailed\\Test.png");
	FileUtils.copyFile(srcFile, destFile);
	
	driver.manage().deleteAllCookies();
	//}
		
	}
	
	@Test
	public void countItemDropdown() {
		
	WebElement dropdown= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		//System.out.println(dropdown.size());
		Select se= new Select( dropdown);
		
		List<WebElement> op= se.getOptions();
		// get total items in Dropdown
		int size= op.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			//print all the items in dropdown
			System.out.println(op.get(i).getText());
		}
		
		// get total items in Dropdown
		int sizeop= se.getOptions().size();
		for(int i=0;i<sizeop;i++) {
			//print all the items in dropdown
			System.out.println(se.getOptions().get(i).getText()); 
		}
		
	}
	 
	@AfterTest
	public void closing() {
		
		driver.close();
	}
	
	
	
	
}
