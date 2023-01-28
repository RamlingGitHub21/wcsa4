package KeyWordDrivenFrameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import dataDrivenFramework.Flib;

public class BaseTest {
	static WebDriver driver;
	public void openBrowser() throws EncryptedDocumentException, IOException 
	{
		Flib flib = new Flib();
	//	browserValue=flib.readPropertyData(PROP_PATAH,"Browser");
	}
	

}
