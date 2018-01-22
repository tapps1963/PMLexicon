import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {

		App sample = new App();
		
		sample.loadProps1();

	}

	private void loadProps1() {
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("app.properties");
		
		try {
			Properties prop = new Properties();
			prop.load(is);
			
			JOptionPane.showMessageDialog(null, "Made it");
			prop.list(System.out);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			System.out.println(e);
		}
	}
		
}

