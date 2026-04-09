package collection;

import java.util.Collection;
import java.util.Vector;

public class Sample1 {
	public static void area(Collection c) {
		for(int i=0;i<c.size();i++) {
			Vector v=(Vector)c;
			int r=(int)v.get(i);
			final double pi=3.142;
			double res=pi*r*r;
			System.out.println("the area is"+res);
			
			
			
		}
		
	}
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		area(v1);
		
	}
}
