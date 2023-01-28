package webDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);

		System.out.println("-----------------------------------------------------------------");

		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Set<String> childparent = driver.getWindowHandles();
		for( String vb:childparent)
		{
			System.out.println(vb);
		}

	}

}
