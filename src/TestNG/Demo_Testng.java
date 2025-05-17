package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Testng {
  @Test
  public void user() {
	  System.out.println("create user");
  }
  @Test
  public void editUser() {
	  System.out.println("Edit user");
	  String actual = "ABCD";
	  String expected = "ABCD";
	  Assert.assertEquals(actual, expected);
  }
}
