package ExceptionHandling;

public class NumberFormatException1 {
	public static void main(String[] args) {
		System.out.println("mainstarts");
			
			try {
				int a=Integer.parseInt("445er");
				System.out.println(a);
			}
			catch(NumberFormatException e){
				System.out.println("this is handled");
			}
		}
}
