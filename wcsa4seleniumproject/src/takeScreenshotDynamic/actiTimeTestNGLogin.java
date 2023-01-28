package takeScreenshotDynamic;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(CustomeLisner.class)
public class actiTimeTestNGLogin extends BaseTest {
	
	@BeforeMethod
	public void setup()
	{
		initialization();
	}
  @Test(priority=1)
  public void login() {
	  SoftAssert sa = new SoftAssert();
	  String actualLoginPageTitle = driver.getTitle();
	  sa.assertEquals(actualLoginPageTitle, actualLoginPageTitle);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	
  }
  @Test
  public void homePage() throws InterruptedException
  {
	  SoftAssert sa = new SoftAssert();
	  String actualLoginPageTitle = driver.getTitle();
	  sa.assertEquals(actualLoginPageTitle, actualLoginPageTitle);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
	  
	  String actualHomePageTitle = driver.getTitle();
	  Assert.assertEquals(actualHomePageTitle,"actiTimeLoginPage");
	  Thread.sleep(2000);
  }
  @AfterMethod
  public void t()
  {
	  driver.quit();
  }
}
