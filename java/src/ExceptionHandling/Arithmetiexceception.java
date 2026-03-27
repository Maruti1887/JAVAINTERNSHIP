package ExceptionHandling;

public class Arithmetiexceception {
 public static void main(String[] args) {
	System.out.println("mainstarts");
	
	try {
		int a=1/0;
		//System.out.println("a");
	}
	catch(ArithmeticException e){
		System.out.println("this is handled");
	}
}
}
