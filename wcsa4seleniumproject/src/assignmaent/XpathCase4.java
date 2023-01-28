package assignmaent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en?gclid=EAIaIQobChMInc_YhZTs-wIVg1VgCh19cgitEAAYASABEgJsb_D_BwE&utm_aud=OTH&utm_campaign=PS_GGL_SEA_TXT_OTH_Brand_Position_New&utm_medium=PS&utm_obj=OLC&utm_source=GGL-SEA");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h3[@class='tw-8216tu'and(contains(text(),'Softride Pro Coast Training Shoes'))]")).click();
	}

}
