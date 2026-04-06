package objectarrayassignment;

public class Sample5 {
	static Object [] s2=new Object[10];
	static int index =0;
	
	public static void add(Object m) {
		s2[index++]=m;
	}
	public static void main(String[] args) {
		add((float)(20));
		add((float)(123));
		for(Object a:s2) {
			System.out.println(a);
		}
	}
	
}
