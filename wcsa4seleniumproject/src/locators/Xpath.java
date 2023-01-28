package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.diver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=54vm39oc3w65h");
		driver.findElement(By.xpath("//*[@id=\"loginBox\"]/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"loginBox\"]/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("manager");
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
	}   

}
