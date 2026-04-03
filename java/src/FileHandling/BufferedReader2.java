package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class BufferedReader2 {
	public static void main(String[] args) throws Exception {
		File f1=new File("D:\\filehandling\\pic.jpg");
		FileInputStream fin=new FileInputStream(f1);
		byte [] arr=new byte[(int)f1.length()];
		fin.read(arr);
		for(int i=0;i<20;i++) {
			FileOutputStream fout=new FileOutputStream("D:\\filehandling\\pic"+i+".jpg");
			fout.write(arr);
			fout.flush();
		}
		System.out.println("file is copied successfully");
		
		
		
	}
}

