package redExceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.properties");
		Properties prop = new Properties();
		prop.load(fis);//used to read the data
		
		String data = prop.getProperty("Browser");
		System.out.println(data);
	}

}
