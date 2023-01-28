package webDriverMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("laptop");
		Thread.sleep(2000);
		List<WebElement> suggestions=driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		System.out.println(suggestions.size());
	for(WebElement S:suggestions)
	{
		System.out.println(S.getText());
		Thread.sleep(2000);
	}
	driver.close();
		//div[@class='pcTkSc']
	}
	

}
