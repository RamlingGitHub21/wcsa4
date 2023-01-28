package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidCrids {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do");
		Flib flib = new Flib();
		int rc = flib.rowCount("./data/ActiTimeIInvalidData.xlsx","InvalidCrid");

		for(int i=1;i<=rc;i++)
		{
			String username = flib.redExcelData("./data/ActiTimeIInvalidData.xlsx","InvalidCrid",i,0);
			String password = flib.redExcelData("./data/ActiTimeIInvalidData.xlsx","InvalidCrid",i,1);
			WebElement use= driver.findElement(By.name("username"));
			use.sendKeys(username);
			WebElement pass = driver.findElement(By.name("pwd"));
			pass.sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).clear();
		}
	}

}
