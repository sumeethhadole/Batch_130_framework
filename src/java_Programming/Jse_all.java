package java_Programming;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jse_all {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		
		WebElement tick = driver.findElement(By.id("persistent"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("document.getElementById('persistent').click();",tick);
		
		WebElement enter = driver.findElement(By.id("login-username"));
		
		jse.executeScript("arguments[0].value='sumeet'",enter);
		
		Thread.sleep(2000);
		
		
		WebElement log = driver.findElement(By.id("login-signin"));

		jse.executeScript("document.body.style.zoom='120%'");
		
		jse.executeScript("arguments[0].style.border='8px solid blue'",log);
		
		jse.executeScript("document.getElementById('login-signin').click();",log);
		
		
	}

}
