package vectorclass;

import java.util.Vector;

public class Vector_retainall_method {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(40);
		v1.add(50);
		v1.add(70);
		Vector v2=new Vector();
		v2.add(10);
		v2.add(30);
		v2.add(50);
		v2.add(80);
		v2.add(97);
		
		System.out.println(v1);
		System.out.println(v2);
		v1.retainAll(v2);
		v2.retainAll(v1);
		System.out.println(v1);
		
		
	}
}
