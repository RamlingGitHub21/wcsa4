package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void sumo() {
	  Reporter.log("sumo1",true);
  }
  public void sumo1() {
	  Reporter.log("sumo2",true);
  }
  public void sumo2() {
	  Reporter.log("sumo3",true);
  }
}
