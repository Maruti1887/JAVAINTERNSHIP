package vectorclass;

import java.util.Vector;

public class Vector_get_size_method {
	public static void main(String[] args) {
		Vector a=new Vector();
		a.add(10);
		a.add(20);
		a.add(40);
		System.out.println(a);
		
		System.out.println(a.get(2));
		System.out.println(a.size());
		System.out.println(a.capacity());
	}
}
