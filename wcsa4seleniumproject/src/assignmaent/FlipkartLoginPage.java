package assignmaent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginPage {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("https://www.flipkart.com/account/login?ret=/")).sendKeys("8308470495");
		Thread.sleep(4000);
		driver.findElement(By.xpath("_2IX_2- _3mctLh VJZDxU")).sendKeys("Ram@234");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	
	}

}
