package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/component/Iframe.html");
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.id("id1"));
		Thread.sleep(5000);
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("frid"));
		Thread.sleep(5000);
		password.sendKeys("manager");
	}

}
