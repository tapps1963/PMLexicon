package package2;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import javax.swing.JOptionPane;

public class MyClass {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {

		String jarCheck = MyClass.class.getResource("MyClass.class").toString().substring(0, 4);

		System.out.println(jarCheck);
		String appConfigPath;
		
		if (jarCheck != "jar:") {
			appConfigPath = "resources/" + "app.properties";
		} else {

			appConfigPath = "C:\\JavaUtilities\\" + "app.properties";
		}

		Properties appProps = new Properties();

		try {
			appProps.load(new FileInputStream(appConfigPath));

			String appUser = appProps.getProperty("user");
			String appVersion = appProps.getProperty("name", "Default Shayne");
			String appGroup = appProps.getProperty("group", "Default Group");
			String appDownloadAddr = appProps.getProperty("downloadAddr", "Doef doef");

			JOptionPane.showMessageDialog(null, jarCheck, "Test", 0);

			System.out.println(appUser);
			System.out.println(appVersion);
			System.out.println(appGroup);
			System.out.println(appDownloadAddr);
			
			System.out.println(System.getProperty("os.name"));

			Properties p = System.getProperties();
			p.list(System.out);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, jarCheck, "Test", 0);
			e.printStackTrace();
		}

	}

}
