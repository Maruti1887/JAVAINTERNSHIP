package objectarrayassignment;

public class Sample3 {
	static Object [] s1=new Object[10];
	static int index=0;
	public void add(Object a) {
		s1[index++]=a;
	}
	public static void main(String[] args) {
		Sample3 s=new Sample3();
		s.add((int)10);
		s.add((int)123);
		s.add((int)12.56);
		for(Object a:s1) {
			System.out.println(a);
		}
	}
}