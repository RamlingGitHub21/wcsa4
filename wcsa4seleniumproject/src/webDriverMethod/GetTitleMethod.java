package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","./driver/chromeDriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		String titleWebPage=driver.getTitle();
		System.out.println(titleWebPage);
	}

}

