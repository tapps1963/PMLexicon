
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.File;

public class MyFileChooser {
	
	public static void main(String[] args) {
		
	    try {
	        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    }catch(Exception ex) {
	        ex.printStackTrace();
	    }
		
		showOpenFileDialog();

				
	}

	private static void showOpenFileDialog() {
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		fileChooser.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
		fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("PDF Docs", "pdf"));
		fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
		fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("CSV Files", "csv"));
		
		fileChooser.setAcceptAllFileFilterUsed(true);
		
		int result = fileChooser.showOpenDialog(fileChooser);
		
		if(result == JFileChooser.APPROVE_OPTION) {
			
			File selectedFile = fileChooser.getSelectedFile();
			
			System.out.println(selectedFile.getAbsolutePath());
			
			
		}
		
	}

}
