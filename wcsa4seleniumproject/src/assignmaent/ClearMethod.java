package assignmaent;

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
		
		
		WebElement a = driver.findElement(By.name("username"));
		Dimension b = a.getSize();
		System.out.println(b.getHeight());
		System.out.println(b.getWidth());
		
		
		WebElement a2 = driver.findElement(By.name("username"));
		Point po = a2.getLocation();
		int xlocation=po.getX();
		int ylocation=po.getY();
		System.out.println("x axis"+xlocation);
		System.out.println("y axis"+ylocation);
		
		
		WebElement a3 = driver.findElement(By.name("username"));
		if(a3.isDisplayed())
		{
			System.out.println("textbox is display: test case is pass");
		}
		else
		{
			System.out.println("text box is not display:test cas is falas");
		}
		
		WebElement bg = driver.findElement(By.xpath("//input[@name='remember']"));
				bg.click();
				
		if(bg.isSelected())
		{
			System.out.println("checkbox is selected: test case is pass");
		}
		else
		{
			System.out.println("checkbox is not selected: test case is fail");
		}
		
	}

}
