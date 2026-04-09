package vectorclass;

import java.util.Vector;

public class Vector_Addall_method {
	public static void main(String[] args) {
			Vector v1=new Vector();
			v1.add(10);
			v1.add(20);
			v1.add(40);
			v1.add(50);
			v1.add(70);
			Vector v2=new Vector();
			v2.add('a');
			v2.add('b');
			v2.add('c');
			v2.add('d');
			v2.add('e');
			
			System.out.println(v1);
			System.out.println(v2);
			//v1.addAll(v2);
			v1.addAll(4,v2);
			
			System.out.println(v1);
			System.out.println(v2);
			
		}
	}

