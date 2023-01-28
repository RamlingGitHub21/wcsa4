package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsselectMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=a8fgi2j35uka");
		WebElement checkbox= driver.findElement(By.xpath("//input[@name='remember']"));
		boolean status1 = checkbox.isSelected();
		Thread.sleep(4000);
		checkbox.click();
		System.out.println(status1);
		
		boolean status2 = checkbox.isSelected();
		Thread.sleep(4000);
		checkbox.click();
		System.out.println(status2);
		
		
		
	}

}
