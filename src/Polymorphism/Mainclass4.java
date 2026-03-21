package Polymorphism;

class Films{
	void select() {
		System.out.println("watch movies");
	}
}

class Comedy extends Films {
	void select() {
		System.out.println("comedy");
	}
}

class Romantic extends Films{
	void select() {
		System.out.println("Romantic");
	}
}


class Action extends Films{
	void select() {
		System.out.println(" Action");
	}
}

class Stimulator4{
	static void Buy(Films a1) {
		a1.select();
	}
}

public class Mainclass4 {

	public static void main(String[] args) {
		Comedy l1=new Comedy();
		Romantic m1=new Romantic();
		Action r1=new Action();
		
		Stimulator4.Buy(l1);
		Stimulator4.Buy(m1);
		Stimulator4.Buy(r1);
		

	}

}
