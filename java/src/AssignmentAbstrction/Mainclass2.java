package AssignmentAbstrction;

interface Amazon{
	void select();
}
class Dress implements Amazon{
	public void select() {
		System.out.println("dress");
	}
}
class Shoe implements Amazon{
	public void select() {
		System.out.println("Shoe");
	}
}
class Cloth implements Amazon{
	public void select() {
		System.out.println("Cloth");
	}
}
class Stimulator1 {
	static void ansi(Amazon l1) {
		l1.select();
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Dress t=new Dress();
		Shoe m=new Shoe();
		Cloth r=new Cloth();
		
		Stimulator1.ansi(t);
		Stimulator1.ansi(m);
		Stimulator1.ansi(r);
	}
}
