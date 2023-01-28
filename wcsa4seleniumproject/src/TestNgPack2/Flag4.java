package TestNgPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void loginmethod() 
  {
	  Reporter.log("login is perform",true);
  }
  @Test(dependsOnMethods = "loginMethod")
  public void createUser() 
  {
	  Reporter.log("user is created",true);
  }
  
  @Test(dependsOnMethods = "createUser")
  public void LogoutMethod() 
  {
	  Reporter.log("logout is done",true);
  }
}
