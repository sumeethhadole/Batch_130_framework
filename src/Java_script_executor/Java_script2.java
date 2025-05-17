package Java_script_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script2 {

	public static void main(String[] args) throws InterruptedException {

		
	WebDriver driver = new ChromeDriver();
 	
	driver.manage().window().maximize();
	
	driver.get("https://tutorialsninja.com/demo/");
	System.out.println("hello");
	
	WebElement search=driver.findElement(By.name("search"));
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	Thread.sleep(3000);
	
	jse.executeScript("arguments[0].value='iphone'",search);
	
	jse.executeScript("document.body.style.zoom='250%'");
	
	Thread.sleep(2000);
	
	jse.executeScript("document.body.style.zoom='50%'");
	
	Thread.sleep(2000);
	
	jse.executeScript("document.body.style.zoom='100%'");

	Thread.sleep(2000);

    jse.executeScript("arguments[0].style.border='4px solid blue'", search);
    
    Thread.sleep(2000);

  //  jse.executeScript("window.scrollBy(0,300)");
    
    Thread.sleep(2000);

    jse.executeScript("window.scrollBy(0,200)");

    Thread.sleep(4000);
    
    driver.close();
    

	}

}
