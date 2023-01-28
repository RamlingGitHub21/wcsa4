package assignmaent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class FlipkartMobile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/account/login?ret=/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("i phone 14 pro max");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[.='APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='512 GB']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("411033");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[7]/div/div/div[1]/div[2]/div/div[2]/div/span")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[.='Remove']")).click();
	}


}
