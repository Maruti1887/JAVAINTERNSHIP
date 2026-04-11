package assignement_vectors;

import java.util.Collection;
import java.util.Vector;

public class Trapezoid {
	static void area(Collection x,Collection y,Collection z) {
		for(int i=0;i<x.size();i++) {
		Vector p=(Vector)x;
		Vector h=(Vector)y;
		Vector n=(Vector)z;
		int a=(int)p.get(i);
		int b=(int)h.get(i);
		int c=(int)n.get(i);
		System.out.println("The area of the Trapezoid is "+0.5*(a+b)*c);
		}
	}

	public static void main(String[] args){
		Vector v1=new Vector();
		Vector v2=new Vector();
		Vector v3=new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(40);
		v2.add(10);
		v2.add(20);
		v2.add(40);
		v3.add(5);
		v3.add(7);
		v3.add(8);
		area(v1,v2,v3);
		
	}
}
