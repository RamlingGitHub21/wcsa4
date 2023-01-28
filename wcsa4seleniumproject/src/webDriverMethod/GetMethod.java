package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
	      ChromeDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      Thread.sleep(4000);
	      driver.get("https://www.instagram.com/");
	      
	      
         
	}

}
