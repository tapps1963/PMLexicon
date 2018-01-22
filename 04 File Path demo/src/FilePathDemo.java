import java.io.File;

public class FilePathDemo {
	
	public static void main(String[] args) {
		
		File dir = new File("/Users/shayne/eclipse-workspace-01/");
		
		File[] list = dir.listFiles(); 
		
		for (File file: list ){
			
			if (file.isDirectory()) {
				System.out.println(file.getName());
			} else {
				System.out.println(file.getName());
			}
			
		}
		
	}

}
