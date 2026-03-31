package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) {
		File f1=new File("D:\\New folder\\newone.txt");
		try {
			if(f1.createNewFile()) {
				System.out.println("File created");
			}
			else {
				System.out.println("file not created");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
