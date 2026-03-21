package Polymorphism;

class Mobiles{
	void select() {
		System.out.println("mobile store");
	}
}

class Vivo extends Mobiles{
	void select() {
		System.out.println("vivo mobile");
	}
}

class Oppo extends Mobiles{
	void select() {
		System.out.println("oppo moble");
	}
}


class Redmi extends Mobiles{
	void select() {
		System.out.println(" redmi mobile ");
	}
}

class Stimulator3{
	static void Buy(Mobiles a1) {
		a1.select();
	}
}

public class Mainclass3 {

	public static void main(String[] args) {
		Vivo l1=new Vivo();
		Oppo m1=new Oppo();
		Redmi r1=new Redmi();
		
		Stimulator3.Buy(l1);
		Stimulator3.Buy(m1);
		Stimulator3.Buy(r1);
		

	}

}
