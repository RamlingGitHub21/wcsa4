package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.jsp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement UserNameTextBox = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		UserNameTextBox.sendKeys("admin");
		Thread.sleep(2000);
		UserNameTextBox.clear();
		WebElement PasswordTextBox = driver.findElement(By.name("pwd"));
		Thread.sleep(2000);
		PasswordTextBox.sendKeys("manager");
		Thread.sleep(2000);
		PasswordTextBox.clear();
		
		
		
		
	}

}
