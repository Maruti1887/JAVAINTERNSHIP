package FileHandling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Bufferedwriter1 {
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\filehandling\\file1.txt");
		FileWriter fw=new FileWriter(f1);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("MOdify the program");
		bw.flush();
		System.out.println("data written successfully");
	}
}
