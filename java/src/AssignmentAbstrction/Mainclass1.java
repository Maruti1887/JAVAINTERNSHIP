package AssignmentAbstrction;

interface Lg{
	void select();
}
class Mobile implements Lg{
	public void select() {
		System.out.println("Lg Mobile");
	}
}
class Refrigerator implements Lg{
	public void select() {
		System.out.println("Lg Refrigearator");
	}
}
class Telivisions implements Lg{
	public void select() {
		System.out.println("Lg teleivisons");
	}
}
class Stimulator {
	static void ansi(Lg l1) {
		l1.select();
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		Refrigerator r1 =new Refrigerator();
		Telivisions t=new Telivisions();
		
		Stimulator.ansi(t);
		Stimulator.ansi(m1);
		Stimulator.ansi(r1);
	}
}
