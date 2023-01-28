package assignmaent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFlipkartCaseNo6 {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//+button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Hp laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Screen Size']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Below12inch']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		Thread.sleep(2000);
		
		/*driver.findElement(By.xpath("//div[text()='Dedicated Graphics Memory']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='4 GB']")).click();
		Thread.sleep(2000);*/
		
		driver.findElement(By.xpath("//div[text()='Hard Disk Capacity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='1 TB']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Type']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Laptop']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("//div[text()='Processor Brand']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='MediaTek']")).click();
		Thread.sleep(2000);
		
	    String price=driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']//div[@class='_30jeq3 _1_WHN1']")).getText();
	    System.out.println("price of laptops is:"+price);
	    driver.close();
		
		
		
	
	}

}