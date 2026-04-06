package objectarrayassignment;

public class Sample6 {
	static Object [] s2=new Object[10];
	static int index =0;
	
	public static void add(Object m) {
		s2[index++]=m;
	}
	public static void main(String[] args) {
		add((double)(20));
		add((double)(123));
		for(Object a:s2) {
			System.out.println(a);
		}
	}
	
}