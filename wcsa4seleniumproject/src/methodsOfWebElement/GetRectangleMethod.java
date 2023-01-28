package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangleMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("http://127.0.0.1/login.do;jsessionid=a8fgi2j35uka");
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	Rectangle rect = username.getRect();
	int xaxis=rect.getX();
	int yaxis=rect.getY();
	
	int hihgt=rect.getHeight();
	int width=rect.getWidth();
	System.out.println("x axis"+xaxis);
	System.out.println("y axis"+yaxis);
	System.out.println(hihgt);
	System.out.println(width);
	
 
}

}
