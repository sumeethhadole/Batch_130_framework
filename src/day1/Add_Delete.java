package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Delete {

	public static void main(String[] args) throws InterruptedException {

           WebDriver driver = new ChromeDriver();
           
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
           
           driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
          
           driver.manage().window().maximize();
           
           Thread.sleep(3000);
           
           driver.findElement(By.xpath("//button[text()='Add Element']")).click();
           
           Thread.sleep(3000);
           
           driver.findElement(By.xpath("//button[text()='Delete']")).click();
           
           Thread.sleep(3000);
           
           driver.close();
        		   
           
		
	}

}
