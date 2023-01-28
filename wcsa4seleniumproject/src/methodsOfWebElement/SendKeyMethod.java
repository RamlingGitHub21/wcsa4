package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class SendKeyMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.jsp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement UserNameTextBox = driver.findElement(By.name("username"));
		UserNameTextBox.sendKeys("admin");
		WebElement PasswordTextBox = driver.findElement(By.name("pwd"));
		PasswordTextBox.sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
	}
	

	
}
