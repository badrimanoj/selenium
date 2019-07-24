package seleniumDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;




public class NewTest {
  @Test
  public void f() {
	  System.out.println("sdhgjh");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("hgdhgjh");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("5t6hgjh");
  }

}
