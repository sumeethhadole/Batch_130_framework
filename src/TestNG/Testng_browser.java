package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testng_browser {
  @Test
  public void Facebook() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.id("email")).sendKeys("sumeethhadole");
	  
	  Thread.sleep(2000);

	  driver.findElement(By.name("login")).click();
	  
	  Thread.sleep(2000);
	  
	  

	  String ActualUrl = "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzQ0MzQ1ODUzLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&next";
	  
	  String ExpectedUrl = driver.getCurrentUrl();
	  
	  Assert.assertEquals(ActualUrl, ExpectedUrl);
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(ActualUrl, ExpectedUrl);
	  sa.assertAll();
	  
	  Thread.sleep(2000);
	  
	  String ActualTitle = "Log in to Facebook";
	  
	  String ExpectedTitle = driver.getTitle();
	  
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
	  Thread.sleep(2000);
	  
	  driver.close(); 
  }
}
