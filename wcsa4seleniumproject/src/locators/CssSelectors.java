package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
   public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   ChromeDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://127.0.0.1/login.do;jsessionid=54vm39oc3w65h");
	   driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	   Thread.sleep(4000);
	   driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
	   Thread.sleep(4000);
	   driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	   
	
}

}
