package objectarray;

public class Sample1 {
	public static void main(String[] args) {
		Object [] s1=new Object[10];
		s1[0]=10;
		s1[3]=20;
		for(Object a:s1) {
			System.out.println(a);
		}
		
	}
}
