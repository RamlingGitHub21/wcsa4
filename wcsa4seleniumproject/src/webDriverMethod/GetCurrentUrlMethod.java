package webDriverMethod;


import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webDriver.chrome.driver","./driver/chromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}
	

	
		
	}

