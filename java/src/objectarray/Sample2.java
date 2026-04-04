package objectarray;

public class Sample2 {
	static Object [] s1=new Object[10];
	public static void main(String[] args) {
		s1[0]=10;
		s1[3]=20;
		for(Object a:s1) {
			System.out.println(a);
		}
		
	}

}
