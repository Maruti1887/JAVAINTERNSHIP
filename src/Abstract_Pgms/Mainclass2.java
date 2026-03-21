package Abstract_Pgms;

abstract class Sample4{
	abstract void disp1();
	abstract void disp2();
}

abstract class Sample3 extends Sample4{
	void disp1() {
		System.out.println("my name is maruti");
	}
}
class Mainclass2 extends Sample3{
	void disp2() {
		System.out.println("The quality of mercy is not strain");
		
	}
	public static void main(String[] args) {
		Mainclass2 m1 = new Mainclass2();
		m1.disp1();
		m1.disp2();
	
	}
}


	


