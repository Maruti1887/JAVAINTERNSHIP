package AssignmentAbstrction;



interface Films{
	void select();
}
class Comedy implements Films{
	public void select() {
		System.out.println("Firstclass");
	}
}
class Romantic implements Films{
	public void select() {
		System.out.println("Sleeper");
	}
}
class Action implements Films{
	public void select() {
		System.out.println("Secondclass");
	}
}
class Stimulator4 {
	static void ansi(Films l1) {
		l1.select();
	}
}

public class Mainclass5 {
	public static void main(String[] args) {
		Comedy t=new Comedy();
		Romantic m=new Romantic();
		Action r=new Action();
		 
		Stimulator4.ansi(t);
		Stimulator4.ansi(m);
		Stimulator4.ansi(r);
	}
}

