package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filereader2 {
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\\\filehandling\\\\file1.txt");
		FileReader fr=new FileReader(f1);
		char [] arr=new char[(int)f1.length()];
		fr.read(arr);
		String s=new String(arr);
		System.out.println(s);
		
	}
}
