package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavegateMethod

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		// back
		driver.navigate().back();
		Thread.sleep(2000);
		// forward 
		driver.navigate().forward();
		Thread.sleep(2000);
		// refresh
		driver.navigate().refresh();




	}


}
