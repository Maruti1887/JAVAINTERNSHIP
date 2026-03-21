package Polymorphism;

class Train{
	void select() {
		System.out.println("Travel through train");
	}
}

class Firstclass extends Train {
	void select() {
		System.out.println("Fristclass");
	}
}

class Sleeper extends Train{
	void select() {
		System.out.println("Sleper");
	}
}


class Secondclass extends Train{
	void select() {
		System.out.println("Secondclass");
	}
}

class Stimulator5{
	static void Buy(Train a1) {
		a1.select();
	}
}

public class Mainclass5 {

	public static void main(String[] args) {
		Firstclass l1=new Firstclass();
		Sleeper m1=new Sleeper();
		Secondclass r1=new Secondclass();
		
		Stimulator5.Buy(l1);
		Stimulator5.Buy(m1);
		Stimulator5.Buy(r1);
		

	}

}
