package ExceptionHandling;

public class IndexOutofBound {
public static void main(String[] args) {
System.out.println("mainstarts");
	
	try {
		int [] a= {10,20,30};
		System.out.println(a[10]);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("this is handled");
	}
}
}
