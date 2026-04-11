package assignement_vectors;

import java.util.Collection;
import java.util.Vector;

public class Square {
	static void area(Collection c) {
		for(int i=0;i<c.size();i++) {
		Vector v1=(Vector)c;
		int r=(int)v1.get(i);
		double pi=3.142;
		System.out.println("The area of the Square is "+r*r);
		}
	}
	public static void main(String[] args) {
		Vector m=new Vector();
		m.add(10);
		m.add(20);
		m.add(40);
		area(m);	
	}
}
