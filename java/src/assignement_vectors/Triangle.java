package assignement_vectors;

import java.util.Collection;
import java.util.Vector;

public class Triangle {
	static void area(Collection x,Collection y) {
		for(int i=0;i<x.size();i++) {
		Vector p=(Vector)x;
		Vector h=(Vector)y;
		int a=(int)p.get(i);
		int b=(int)h.get(i);
		System.out.println("The area of the triangle is"+0.5*a*b);
		}
	}
	
	public static void main(String[] args) {
		Vector v1=new Vector();
		Vector v2=new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(40);
		v2.add(10);
		v2.add(20);
		v2.add(40);
		area(v1,v2);
		
	}
}
