import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		
		// Properties file path
		String filePath = "app.properties";
		Properties prop = new Properties();
				
		//t//ry (InputStream inputStream = App.class.getClassLoader().getResourceAsStream(filePath)){
			
			// Loading the properties
			//prop.load(inputStream);
			
			// Getting properties
			//String url = prop.getProperty("url");
			
			JOptionPane.showMessageDialog(null, "Hello");
			
			//prop.list(System.out);
			
		//} catch (IOException e) {
			//JOptionPane.showMessageDialog(null, e);
			//System.out.println(e);
		//}
	}
		
}

