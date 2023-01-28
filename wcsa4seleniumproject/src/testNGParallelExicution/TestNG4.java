package testNGParallelExicution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG4 {
  @Test
  public void today() {
	  long ThreadID = Thread.currentThread().getId();
	  Reporter.log("today method"+ThreadID+"is the thread,true");
  }
  @Test
  public void tomarrow() {
	  long ThreadID = Thread.currentThread().getId();
	  Reporter.log("today method"+ThreadID+"is the thread,true");
  }

}