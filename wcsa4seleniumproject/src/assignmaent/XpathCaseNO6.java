package assignmaent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCaseNO6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/fashion-eoss-sale-store?param=389&otracker=hp_bannerads_1_2.bannerAdCard.BANNERADS_EOSS_E0Z7O458M8D3");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung Mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Hp laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	}
	

}
