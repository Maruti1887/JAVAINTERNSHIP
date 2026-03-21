package Polymorphism;

class Amazon{
	void select() {
		System.out.println("welocome to Amazon");
	}
}

class Shoes extends Amazon{
	void select() {
		System.out.println("this is the shoes");
	}
}

class Dress extends Amazon{
	void select() {
		System.out.println("this is Dress");
	}
}


class Mobiles extends Amazon{
	void select() {
		System.out.println("this is the lg mobiles");
	}
}

class Stimulator1{
	static void Buy(Amazon a1) {
		a1.select();
	}
}

public class Mainclass2 {

	public static void main(String[] args) {
		Shoes l1=new Shoes();
		Dress m1=new Dress();
		Mobiles r1=new Mobiles();
		
		Stimulator1.Buy(l1);
		Stimulator1.Buy(m1);
		Stimulator1.Buy(r1);
		

	}

}
