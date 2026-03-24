package AssignmentAbstrction;



interface Train{
	void select();
}
class Firstclass implements Train{
	public void select() {
		System.out.println("Firstclass");
	}
}
class Sleeper implements Train{
	public void select() {
		System.out.println("Sleeper");
	}
}
class Secondclass implements Train{
	public void select() {
		System.out.println("Secondclass");
	}
}
class Stimulator3 {
	static void ansi(Train l1) {
		l1.select();
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		Firstclass t=new Firstclass();
		Sleeper m=new Sleeper();
		Secondclass r=new Secondclass();
		
		Stimulator3.ansi(t);
		Stimulator3.ansi(m);
		Stimulator3.ansi(r);
	}
}
