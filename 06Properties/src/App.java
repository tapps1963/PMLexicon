import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {

		readMyProp(); // This works
		saveMyProp(); // Original problem

	}

	private static void saveMyProp() {
		// Properties file path.
		String filePath = "app.properties";
		Properties prop = new Properties();

		try (InputStream outputStream = App.class.getClassLoader().getResourceAsStream(filePath)) {

			// Loading the properties.
			prop.load(outputStream);

			// Getting properties
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			String dbase = prop.getProperty("dbase");
			String serverinternal = prop.getProperty("serverinternal");
			String serverexternal = prop.getProperty("serverexternal");

			// Output to console the properties
			System.out.println("User Name = " + user);
			System.out.println("Password = " + password);
			System.out.println("Database = " + dbase);
			System.out.println("Internal IP = " + serverinternal);
			System.out.println("External URL = " + serverexternal);

			JOptionPane.showMessageDialog(null, "Read Ok");

		} catch (IOException ex) {
			System.out.println("Problem occurs when reading file !");
			JOptionPane.showMessageDialog(null, "Did not make it");
			ex.printStackTrace();
		}


	}

	private static void readMyProp() {
		// Properties file path.
		String filePath = "app.properties";
		Properties prop = new Properties();

		try (InputStream inputStream = App.class.getClassLoader().getResourceAsStream(filePath)) {

			// Loading the properties.
			prop.load(inputStream);

			// Getting properties
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			String dbase = prop.getProperty("dbase");
			String serverinternal = prop.getProperty("serverinternal");
			String serverexternal = prop.getProperty("serverexternal");

			// Output to console the properties
			System.out.println("User Name = " + user);
			System.out.println("Password = " + password);
			System.out.println("Database = " + dbase);
			System.out.println("Internal IP = " + serverinternal);
			System.out.println("External URL = " + serverexternal);

			JOptionPane.showMessageDialog(null, "Read Ok");

		} catch (IOException ex) {
			System.out.println("Problem occurs when reading file !");
			JOptionPane.showMessageDialog(null, "Did not make it");
			ex.printStackTrace();
		}

	}
}
