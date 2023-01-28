package takeScreenshotDynamic;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class BaseTest {
	static WebDriver driver;
  @Test
  public void initialization() {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do");
  }
  @Test
  public void failed(String methodName)
  {
	  try
	  {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  ts.getScreenshotAs(OutputType.FILE);
	  File det = new File("./screenShot"+methodName+".png");
	  Files.copy(det, det);
	  }
	  
	  catch(Exception e)
	  {
		  
	  }
  }
}
