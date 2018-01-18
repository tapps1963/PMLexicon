package package2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyClass {

	public static void main(String[] args) {
		
		String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String appConfigPath  = rootPath + "app.properties";
		
		Properties appProps = new Properties();
		
		try {
			appProps.load(new FileInputStream(appConfigPath));
			
			String appUser = appProps.getProperty("user");
			String appVersion = appProps.getProperty("name", "Default Shayne");
			String appGroup = appProps.getProperty("group", "Default Group");
			String appDownloadAddr = appProps.getProperty("downloadAddr");
			
			System.out.println(appUser);
			System.out.println(appVersion);
			System.out.println(appGroup);
			System.out.println(appDownloadAddr);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
