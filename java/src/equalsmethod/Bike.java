package equalsmethod;

public class Bike {
	String name;
	int id;
	public Bike(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public boolean equals(Object obj) {
		Bike b2=(Bike)obj;
		return this.id==b2.id;
	}
	public static void main(String[] args) {
		Bike b1=new Bike("Honda", 123);
		Bike b2=new Bike("Yamaha", 123);
		System.out.println(b1.equals(b2));
	}
}
