package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);

	}

}
