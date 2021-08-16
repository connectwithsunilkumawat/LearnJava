package testNGLearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BeforeAfterTest {
  
	
	
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Before Test - Starting");
  }
  
  

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After Test - Starting");
  }

}
