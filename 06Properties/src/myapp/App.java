package myapp;
import java.io.File;
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
		
		try {
			File filePath = new File("app.properties");
			
	        Properties props = new Properties();
	        OutputStream out = new FileOutputStream( "app.properties" );
	        
	        props.setProperty("user123", "domste");
	        
	        props.store(out, "This is an optional header comment string");
	        //out.close();
	        out.flush();	        
	        
	        JOptionPane.showMessageDialog(null, "Tried to write it");
	        
	    }
	    catch (Exception e ) {
	        System.out.println(e);
	        JOptionPane.showMessageDialog(null, "Did not write it");
	    }
		
		
	}

	private static void readMyProp() {
		// Properties file path.
		String filePath = "myapp/app.properties";
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

			JOptionPane.showMessageDialog(null, user);

		} catch (IOException ex) {
			System.out.println("Problem occurs when reading file !");
			JOptionPane.showMessageDialog(null, "Did not make it");
			ex.printStackTrace();
		}

	}
}
