package java_Programming;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_shot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement border = driver.findElement(By.xpath("//strong[text()='Featured products']"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1200)");
		jse.executeScript("arguments[0].style.border='5px solid red'",border);
		
		WebElement feature = driver.findElement(By.xpath("//div[@class='page-body']"));
		
		File src = feature.getScreenshotAs(OutputType.FILE);
		String trg = ".\\screenshot\\hompage.png";
		Files.copy(src.toPath(),new File(trg).toPath());
	}
}