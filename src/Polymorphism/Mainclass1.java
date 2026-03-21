package Polymorphism;

class Lg{
	void select() {
		System.out.println("welocome to lag brand");
	}
}

class Mobile extends Lg{
	void select() {
		System.out.println("this is the vivo mobile");
	}
}

class Refrigerators extends Lg{
	void select() {
		System.out.println("this is the refrigerators");
	}
}


class Telivisions extends Lg{
	void select() {
		System.out.println("this is the lg telivisons");
	}
}

class Stimulator{
	static void Buy(Lg a1) {
		a1.select();
	}
}

public class Mainclass1 {

	public static void main(String[] args) {
		Lg l1=new Lg();
		Mobile m1=new Mobile();
		Refrigerators r1=new Refrigerators();
		
		Stimulator.Buy(l1);
		Stimulator.Buy(m1);
		Stimulator.Buy(r1);
		

	}

}
