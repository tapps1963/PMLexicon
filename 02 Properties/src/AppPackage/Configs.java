package AppPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configs {
	
	public static Properties prop = new Properties();
	
	public void saveProp(String title, String value) {
		try {
			prop.setProperty(title, value);
			prop.store(new FileOutputStream("my.properties")	, null);			
		} catch (IOException e) {
			
		}
	}
	
	public String getProp(String title) {
		String result = "";
		
		try {
			prop.load(new FileInputStream("my.properties"));
			
			//InputStream inputStream = getClass().getResourceAsStream("my.properties");
			
			//prop.load(inputStream);
			
			
			result = prop.getProperty(title);
			
			
			
		} catch (IOException e) {
			
		}
		
		return result;
	}
	
	

}
