package assignmaent;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateUserActiTime {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=54vm39oc3w65h");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[9]/a/img")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Ramling");
		Thread.sleep(2000);
		driver.findElement(By.name("passwordText")).sendKeys("Ram@123");
		Thread.sleep(2000);
		driver.findElement(By.name("passwordTextRetype")).sendKeys("Ram@123");
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Ramling");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Sawant");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("8308470495");
		driver.findElement(By.name("middleName")).sendKeys("Suresh");
		driver.findElement(By.name("mobile")).sendKeys("8308470493");
		Thread.sleep(2000);
		
		
		
		//driver.findElement(By.name("overtimeTracking")).click();
		//driver.findElement(By.name("rightGranted[1]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("/img/default/pixel.gif?hash=1692528820")).click();
		
		
		


	}

}
