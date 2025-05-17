package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_download {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://speedwaytech.co.in/testing-02/upload-and-download/");
		
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\4863707769.pdf");

	}

}
