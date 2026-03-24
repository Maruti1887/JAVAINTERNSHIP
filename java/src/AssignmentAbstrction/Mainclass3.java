package AssignmentAbstrction;


interface Mobile1{
	void select();
}
class Vivo implements Mobile1{
	public void select() {
		System.out.println("Vivo");
	}
}
class Redmi implements Mobile1{
	public void select() {
		System.out.println("Redmi");
	}
}
class Realme implements Mobile1{
	public void select() {
		System.out.println("Realme");
	}
}
class Stimulator2 {
	static void ansi(Mobile1 l1) {
		l1.select();
	}
}

public class Mainclass3 {
	public static void main(String[] args) {
		Vivo t=new Vivo();
		Redmi m=new Redmi();
		Realme r=new Realme();
		
		Stimulator2.ansi(t);
		Stimulator2.ansi(m);
		Stimulator2.ansi(r);
	}
}
