package equalsmethod;

public class Laptop {
	String name;
	int id;
	public Laptop(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public boolean equals(Object obj) {
		Laptop l2=(Laptop)obj;
		return this.id==l2.id;
	}
	public static void main(String[] args) {
		Laptop l1=new Laptop("Dell", 123);
		Laptop l2=new Laptop("HP", 123);
		System.out.println(l1.equals(l2));
	}
}
