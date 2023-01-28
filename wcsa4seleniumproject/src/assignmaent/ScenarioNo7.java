package assignmaent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioNo7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		driver.findElement(By.xpath("//a[.='All Jewellery ']")).click();
		WebElement webelement = driver.findElement(By.xpath("//span[.='Kadas']"));
		Actions act = new Actions(driver);
		act.moveToElement(webelement);
		driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]")).click();
		driver.findElement(By.xpath("//h1[.='The Ishank Kada For Him']")).click();
		//driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		Thread.sleep(4000);
		//driver.close();
	}

}
