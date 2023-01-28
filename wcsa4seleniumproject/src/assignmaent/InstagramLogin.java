package assignmaent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("ramling123");
		Thread.sleep(4000);
		driver.findElement(By.name("Password")).sendKeys("Ram@123");
		Thread.sleep(2000);
		driver.findElement( By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
