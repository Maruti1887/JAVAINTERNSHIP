package interfacetopics;

interface Sample4{
	void disp();
	
}

interface Sample5 extends Sample4{
	void test();
}

public class Mainclass3 implements Sample5 {
	public void disp()
	{
		System.out.println("helo how are you");
	}
	public void test() {
		System.out.println("hello hi by by from the bootom of my heart  ye");
	}
	public static void main(String[] args) {
		Mainclass3 s1 =new Mainclass3();
		s1.disp();
		s1.test();
	}

}
