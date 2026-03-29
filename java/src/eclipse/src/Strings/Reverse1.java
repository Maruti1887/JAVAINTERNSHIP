package eclipse.src.Strings;

public class Reverse1 {
	public static void main(String [] args) {
	String str="MY NAME IS MARUTI";
	String [] s=str.split(" ");
	for(int i=s.length-1;i>=0;i--) {
		System.out.println(s[i]);
	}
	
	}
}
