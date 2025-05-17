package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Text_Compare {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://extendsclass.com/text-compare.html#google_vignette");
		
        WebElement source = driver.findElement(By.xpath(" (//div[@class='CodeMirror-scroll'])[1]"));
       
        Actions act = new Actions(driver);
       
        Thread.sleep(3000);
        
        act.keyDown(source,Keys.CONTROL);
        act.sendKeys("a");
        act.sendKeys("c");
        
        WebElement destination = driver.findElement(By.xpath(" (//div[@class='CodeMirror-scroll'])[2]"));
        

        act.keyDown(destination,Keys.CONTROL);
        act.sendKeys("a");
        act.sendKeys("v").perform();
        
     
       
        
        
        
	}

}
