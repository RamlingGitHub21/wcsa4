package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/component/AlertPopup.html");
		WebElement button = driver.findElement(By.xpath("//button[.='click me! ']"));
		Thread.sleep(4000);
		button.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		alert.accept();
	}

}
