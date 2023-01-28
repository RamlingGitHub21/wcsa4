package assignmaent;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnYoutube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  List<WebElement> list = driver.findElements(By.xpath("//span[@class='inline-metadata-item style-scope ytd-video-meta-block']/ancestor::div[@class='style-scope ytd-rich-grid-slim-media']//span[@id='video-title']"));
		//System.out.println(list.size());
		Thread.sleep(2000);
		 List<WebElement> list1 = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']/ancestor::div[@class='style-scope ytd-rich-grid-slim-media']//span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
			//System.out.println(list1.size());
		  for(WebElement  e1:list1)
			
		{System.out.println(e1.getText());
		
			  for(WebElement e:list)
			  {
				  System.out.println(e.getText());
				  
			  }

			
		}
		 
			 
				  //span[text()='20M views']
		  
	
		
	}

}
