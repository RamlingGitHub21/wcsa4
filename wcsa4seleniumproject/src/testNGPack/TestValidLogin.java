package testNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestValidLogin  {
  @Test
  public void validLogin(String username,String password) throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.findElement(By.name("username")).sendKeys("admin");
	  Thread.sleep(4000);
	  driver.findElement(By.id("password")).sendKeys("manager");
	  Thread.sleep(4000);
	  driver.findElement(By.id("loginButton")).click();
  }
}
