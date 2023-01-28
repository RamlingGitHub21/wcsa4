package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--disable-notification");
		co.addArguments("-start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.bluestone.com/");


	}
}
