package interfacetopics;

interface Sample1{
	void disp();
	void test();
}

abstract class Sample3 implements Sample1{
	public void disp()
	{
		System.out.println("helo");
	}
	
}

public class Mainclass2 extends Sample3 {
	public void test() {
		System.out.println("hello hi by by from the bootom of my heart  ye");
	}
	public static void main(String[] args) {
		Mainclass2 s1 =new Mainclass2();
		s1.disp();
		s1.test();
	}

}
