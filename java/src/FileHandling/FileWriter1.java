package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\filehandling\\file1.txt");
		FileWriter fw=new FileWriter(f1,true);
		fw.write("welcome to java programming language which has the ability to run the program");
		fw.flush();
		System.out.println("data written successfully");
	}
}
