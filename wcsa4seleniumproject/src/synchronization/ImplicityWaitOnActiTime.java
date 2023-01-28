package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWaitOnActiTime {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=gxuy7vuaojzf");
		String ActiTimeLoginPageTitle=driver.getTitle();
		if(ActiTimeLoginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("Login page title is matchd:test case is pass");
			
		}
		else
		{
			System.out.println("Login page title is not mached:test case is false");
			
		}   
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		String ActiTimeHomePageTitle=driver.getTitle();
		if(ActiTimeHomePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Home page title is matched:test case is passed");
		}
		else 
		{
			System.out.println("Home page title is not mached:test case is failed");
		}
		
		
	}
	
}
