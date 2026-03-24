package interfacetopics;

interface Sample{
	void disp();
	void test();
}

class Sample2 implements Sample{
	public void disp()
	{
		System.out.println("helo");
	}
	public void test() {
		System.out.println("hello hi by ye");
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Sample2 s1 =new Sample2();
		s1.disp();
		s1.test();
	}

}
