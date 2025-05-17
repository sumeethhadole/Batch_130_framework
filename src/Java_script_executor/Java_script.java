package Java_script_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script {

	public static void main(String[] args) {

		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		WebElement check = driver.findElement(By.id("persistent"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
	
		
		jse.executeScript("document.getElementById('persistent').click()");
		
		
		
		driver.close();
	}

}
