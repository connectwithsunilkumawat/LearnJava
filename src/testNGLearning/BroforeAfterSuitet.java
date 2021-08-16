package testNGLearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BroforeAfterSuitet {
	
  @BeforeSuite
  public void BeforeSuiteMethod() {
	  
	  System.out.println("It will run before anything to run");
	  
  }

  @AfterSuite
  public void AfterSuiteMethod() {
	  
	  System.out.println("It will run After every got ran");
  }

}
