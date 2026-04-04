package objectarray;

public class Sample3 {
	static Object [] s1=new Object[10];
	static int index=0;
	public void add(Object a) {
		s1[index++]=a;
	}
	public static void main(String[] args) {
		Sample3 s=new Sample3();
		s.add("abc");
		s.add(123);
		s.add(12.34);
		for(Object a:s1) {
			System.out.println(a);
		}
	}
}
