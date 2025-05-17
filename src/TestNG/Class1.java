package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Class1 {
  /*@BeforeMethod
  public void login() {
	  System.out.println("login success");
  }*/
  @Test 
  public void create(){
	  System.out.println("Created account");
  }
  @Test 
  public void edit() {
	  System.out.println("Edited account");
	  
  }
  @Test (dependsOnMethods="edit")
  public void delete() {
	  System.out.println("Deleted account");
  }
  /*@AfterMethod
  public void logout() {
	  System.out.println("logout success");
	  
  }*/
  
}
