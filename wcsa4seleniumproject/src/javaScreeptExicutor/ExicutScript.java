package javaScreeptExicutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExicutScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/component/disabled.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(4000);
		js.executeScript("document.getElementById('n2').value='admin'");
		//driver.findElement(By.id("n3")).sendKeys("admin");
	
		
	} 

}
