package TestNgPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups="FUNCTIONAL")
  public void ft1() {
	  Reporter.log("Functional Testing1",true);
  }
  
  @Test(groups="INTEGRATION")
  public void it1() {
	  Reporter.log("Intigration Testing1",true);
  }
  
  @Test(groups="SYSTEM")
  public void st1() {
	  Reporter.log("System Testing1",true);
  }
  
  //------------------------------------------------------------------------------------
  
  @Test(groups="FUNCTIONAL")
  public void ft2() {
	  Reporter.log("Functional Testing2",true);
  }
  
  @Test(groups="INTEGRATION")
  public void it2() {
	  Reporter.log("IntigrationTesting2",true);
  }
  
  @Test(groups="SYSTEM")
  public void st2() {
	  Reporter.log("System Testing2",true);
  }
  
  //--------------------------------------------------------------------------------------
  
  @Test(groups="FUNCTIONAL")
  public void ft3() {
	  Reporter.log("Functional Testing3",true);
  }
  
  @Test(groups="INTEGRATION")
  public void it3() {
	  Reporter.log("Intigration Testing3",true);
  }
  
  @Test(groups="SYSTEM")
  public void st3() {
	  Reporter.log("System Testing3",true);
  }
  
  //-----------------------------------------------------------------------------------
  
  @Test(groups="FUNCTIONAL")
  public void ft4() {
	  Reporter.log("Functional Testing4",true);
  }
  
  @Test(groups="INTEGRATION")
  public void it4() {
	  Reporter.log("IntigrationTesting4",true);
  }
  
  @Test(groups="SYSTEM")
  public void st4() {
	  Reporter.log("System Testing4",true);
  }
  
}
