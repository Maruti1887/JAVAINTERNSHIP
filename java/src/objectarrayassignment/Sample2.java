package objectarrayassignment;

import objectarray.Sample3;

public class Sample2 {
	static Object [] s1=new Object[10];
	static int index=0;
	public void add(Object a) {
		s1[index++]=a;
	}
	public static void main(String[] args) {
		Sample3 s=new Sample3();
		s.add((byte)10);
		s.add((byte)123);
		s.add((byte)12.56);
		for(Object a:s1) {
			System.out.println(a);
		}
	}
}
