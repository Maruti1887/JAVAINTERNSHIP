
package eclipse.src.Strings;

public class Reverse2 {
	
	static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		return rev;   // return instead of print
	}
	
	public static void main(String [] args) {
		String str="MY NAME IS MARUTI";
		String [] s=str.split(" ");
		
		for(int i=s.length-1;i>=0;i--) {
			System.out.println(reverse(s[i]));
		}
	}
}
