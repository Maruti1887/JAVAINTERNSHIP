package Abstract_Pgms;

abstract class Sample2{
	abstract void disp();
	abstract void  test();
}
class Cool extends Sample2{
	void disp() {
		System.out.println("hello my name is maruti");
	}
	void test() {
		System.out.println("the quality of mercy is not strain ");
	}
}

public class Mainclass1 {

	public static void main(String[] args) {
		Cool m= new Cool();
		m.disp();
		m.test();

	}

}
