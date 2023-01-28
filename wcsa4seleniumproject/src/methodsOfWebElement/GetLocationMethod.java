package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("http://127.0.0.1/login.do;jsessionid=a8fgi2j35uka");
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	Point loc = username.getLocation();
	int xaxis = loc.getX();
	int yaxis = loc.getY();
	System.out.println(xaxis+"is the xaxis");
	System.out.println(yaxis+"is the yaxis");
}

}
