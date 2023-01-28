package assignmaent;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioNo6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("(//a[.='Diamond'])[1]")).click();
		List<WebElement> webElement = driver.findElements(By.xpath("//span[@class='new-price']"));

		for(WebElement prce:webElement)
		{
			System.out.println(prce.getText());
		}
		WebElement target1 = driver.findElement(By.xpath("//span[.=' Popular ']"));
		Actions act1 = new Actions(driver);
		act.moveToElement(target1).perform();

		WebElement target2 = driver.findElement(By.xpath("//a[.='Price Low to High ']"));
		target2.click();
		List<WebElement> webElement2 = driver.findElements(By.xpath("//span[@class='new-price']"));
		for(WebElement prce1:webElement2)
		{   String acc = prce1.getText();
			System.out.println(acc);
		}
		
		TreeSet<String> option = new TreeSet<String> ();
		System.out.println(option);
	}

}
