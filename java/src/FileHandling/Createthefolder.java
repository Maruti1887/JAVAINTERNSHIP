package FileHandling;
import java.io.File;

public class Createthefolder {
	public static void main(String[] args) {
		File f1=new File("D:\\New folder\\newone");
		if(f1.mkdir()) {
			System.out.println("folder crated");
		}
		else {
			System.out.println("Folder not Created");
		}
		
		if(f1.exists()) {
			System.out.println("folder exists");
		}
		else {
			System.out.println("folder not exists");
		}
		
		if(f1.delete()) {
			System.out.println("folder deleted");
		}
		else {
			System.out.println("Folder deleted");
		}
	}
}
