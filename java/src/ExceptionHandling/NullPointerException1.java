package ExceptionHandling;

public class NullPointerException1 {
public static void main(String[] args) {
System.out.println("mainstarts");
	
	try {
		NullPointerException1 e1=null;
		System.out.println(e1.hashCode());
	}
	catch(NullPointerException e) {
		System.out.println("this is handled");
	}

}
}
