import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
		//InputStream is = new FileInputStream("/Users/shayne/eclipse-workspace-01/01 Properties/my.properties");
		InputStream is = new FileInputStream("my.properties");
		prop.load(is);
		
		//System.out.println(prop.getProperty("uname"));
		
		//JOptionPane.showMessageDialog(null, prop.getProperty("uname"));
		prop.list(System.out);;
	}

}
