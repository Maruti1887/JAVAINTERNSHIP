package vectorclass;

import java.util.Vector;

public class Vector_contains_Method {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(40);
		v1.add(50);
		v1.add(70);
		System.out.println(v1.contains(50));
		System.out.println(v1.contains(500));
		
	}
}
