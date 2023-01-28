package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confermationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/component/ConfirmationPopup3.html");
		WebElement confirmation= driver.findElement(By.xpath("//button[.='Click']"));
		Thread.sleep(4000);
		confirmation.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		String text = alert.getText();
		System.out.println(text);
	}
	
	

}
