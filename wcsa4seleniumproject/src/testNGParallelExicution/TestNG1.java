package testNGParallelExicution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG1 {
  @Test
  public void m1() {
	  Reporter.log("method m1",true);
  }
}
