package objectarrayassignment;

import objectarray.Sample3;

public class Sample1 {
	static Object [] s1=new Object[10];
	static int index=0;
	public void add(Object a) {
		s1[index++]=a;
	}
	public static void main(String[] args) {
		Sample1 s=new Sample1();
		s.add(10);
		s.add((short)123);
		s.add((short)12.56);
		for(Object a:s1) {
			System.out.println(a);
		}
	}
}