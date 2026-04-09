package vectorclass;

import java.util.Vector;

public class Vector_remove_method {
	public static void main(String[] args) {
		Vector v1=new Vector();
		//remove method
		v1.add(10);
		v1.add(20);
		v1.add("hello");
		v1.add(2,"helo");
		System.out.println(v1);
		//v1.remove(10); It will not work because it assume integer value as an index
		v1.remove("hello");
		System.out.println(v1);
		
	}
}
