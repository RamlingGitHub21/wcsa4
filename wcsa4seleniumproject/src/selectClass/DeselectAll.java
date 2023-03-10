package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		WebElement click1 = driver.findElement(By.xpath("//select[@name='cars']"));

		Select sel = new Select(click1);
		for(int i=0;i<6;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		sel.deselectAll();
	}
}

