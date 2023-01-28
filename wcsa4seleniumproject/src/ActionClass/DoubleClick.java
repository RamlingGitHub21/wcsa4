package ActionClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=7k7lmn3d1oglr");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");


		driver.findElement(By.xpath("//a[.='Login']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'content administration')]")).click();
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'uploadNewLogoOption')]")).click();
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));


		Actions act = new Actions(driver);
		// to perform double click action
		act.doubleClick(target).perform();
				
		File file1 = new File("./AutoIt/AutoIt1.exe");
		String abs = file1.getAbsolutePath();
		Thread.sleep(5000);
		Runtime.getRuntime().exec(abs);
		Thread.sleep(5000);
		Runtime.getRuntime().exec(abs);
	
	
	}

}
