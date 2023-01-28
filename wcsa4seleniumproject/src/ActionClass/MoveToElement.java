package ActionClass;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Settings')]")).click();
		driver.findElement(By.xpath("//div[text()='Settings']")).click();
		//driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[13]/a/div[2]/img"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		Thread.sleep(2000);
		WebElement target= driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		 
		Actions act =new Actions(driver);
		act.doubleClick(target).perform();
	}

}
