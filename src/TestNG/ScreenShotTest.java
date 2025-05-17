package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScreenShotTest {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();	
	}
	@Test
	public void captureScreenShotTest() throws IOException {
		driver.get("https://online.actitime.com/abc1/login.do");
		
		File screenshots= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(screenshots, new File("screenshot/webpage.png"));
	}
		@AfterClass
		public void teardown() {
			driver.close();
		
	}
	}
	


