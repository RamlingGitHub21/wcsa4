package assignmaent;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu2 {
	public static void main(String[] args) {
		//how to close the parent and child window without quit()
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Set<String> childparent = driver.getWindowHandles();
		for( String vb:childparent)
		{
			driver.switchTo().window(vb).close();
		}
	}

}
