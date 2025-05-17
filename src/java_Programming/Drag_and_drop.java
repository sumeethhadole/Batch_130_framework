package java_Programming;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://speedwaytech.co.in/testing-02/Select/");
		
		driver.findElement(By.xpath("//a[text()='Drag-n-Drop']")).click();
		
		WebElement source= driver.findElement(By.id("box3"));
		
		WebElement target= driver.findElement(By.id("box103"));
		
		Thread.sleep(3000);

		WebElement source1= driver.findElement(By.id("box2"));
		
		WebElement target1= driver.findElement(By.id("box102"));
		
		Actions act = new Actions(driver);
	
		act.dragAndDrop(source, target).perform();
		Thread.sleep(3000);
		act.dragAndDrop(source1, target1).perform();
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
