package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Frame {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://speedwaytech.co.in/testing-02/Frames/");
    
        driver.switchTo().frame("frame1");  //Parent frame
        Thread.sleep(2000);
        driver.switchTo().frame("frame3");  //child frame
        Thread.sleep(2000);
        WebElement e = driver.findElement(By.id("a"));
        e.click();
       int  h = e.getSize().getHeight();
        int w= e.getSize().getWidth();
        System.out.println("Height is : "+h);
        System.out.println("Width is : "+w);
        
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        driver.findElement(By.tagName("input")).sendKeys("sumeet");
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        driver.switchTo().frame("frame2");
        Thread.sleep(2000);
        WebElement dd =  driver.findElement(By.id("animals"));
        Select dropdown = new Select(dd);
        Thread.sleep(2000);
        dropdown.selectByIndex(3);
        Thread.sleep(2000);
        driver.close();
        
    
    }
}
