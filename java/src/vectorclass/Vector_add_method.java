package vectorclass;

import java.util.Vector;

public class Vector_add_method {
	public static void main(String[] args) {
		Vector v1=new Vector();
		//add method
		v1.add(10);
		v1.add(20);
		v1.add("hello");
		v1.add(2,"helo");
		v1.add(40);
		v1.add(50);
		v1.add(70);
		v1.add(90);
		v1.add(30);
		v1.add(20);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(50);
		System.out.println(v1);
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		
	}
}
