package assignmaent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FceBookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("sawantramling1998@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("div[id='passContainer']")).sendKeys("Ram@621998");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"u_0_c_YY\"]")).click();
		Thread.sleep(2000);
		driver.close();

	}																			

}
