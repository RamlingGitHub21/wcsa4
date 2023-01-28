package assignmaent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu1 {
	public static void main(String[] args) throws InterruptedException {
		//how to close parent and child
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Thread.sleep(4000);
		driver.quit();
		
	}

}
