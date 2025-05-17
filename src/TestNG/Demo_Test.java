package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo_Test {
	
	
	WebDriver driver;
	@BeforeClass
	public void launch() {
	driver = new ChromeDriver();
	}
@Test (dataProvider="logindata")
public void class_1(String username, String pwd) throws InterruptedException {
	
	
	
	driver.manage().window().maximize();  
	
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	
	driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys(username);
	driver.findElement(By.id("input-password")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='My Account']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
}
	@DataProvider(parallel=false)
	public Object[][] logindata(){
		Object[][] getdata = new Object[2][2];
		
		getdata[0][0]="speedwaytech74@gmail.com";
		getdata[0][1]="speedway@123";
		
		getdata[1][0]="speedwaytech4@gmail.com";
		getdata[1][1]="speedway@123";
		
		return getdata;
		
		
	}
	
}
