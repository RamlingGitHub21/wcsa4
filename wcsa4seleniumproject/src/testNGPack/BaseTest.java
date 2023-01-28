package testNGPack;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public  class BaseTest {
	
	
	
	
	static WebDriver driver;
	
	@BeforeMethod
	
	@Parameters("browervalue","Url")
	public void setUP(String browserValue,String Url) 
	{
		if(browserValue.equals("chrome"))
		{

			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(Url);
		}
		else if(browserValue.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(Url);

		}
		else
		{
			Reporter.log("enter valid browser value",true);
		}



	}

	@AfterMethod
	public void t()
	{
		driver.quit();
	}

}


