package mock1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtiTimeLogin1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdiver.chrome.diver", "./diver/chromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=r73qm5cezy9f");
 WebElement username = driver.findElement(By.name("username"));
 

 if(username.isDisplayed())
 {
	 username.sendKeys("admin");
	System.out.println("Webelement is isdispay");	
		
 }
 else
 {
	 System.out.println("Webelement is not dispay");
 }
 WebElement pass = driver.findElement(By.name("pwd"));//sendKeys("manager");
 if(pass.isDisplayed())
 {
	 pass.sendKeys("manager");
	System.out.println("Webelement is isdispay");	
		
 }
 else
 {
	 System.out.println("Webelement is not isdispay");
 }
 Thread.sleep(2000);
 username.clear();
 Thread.sleep(2000);
 pass.clear();

	
	
}
}
