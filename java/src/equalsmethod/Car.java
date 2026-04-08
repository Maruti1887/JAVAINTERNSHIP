package equalsmethod;

public class Car {
	String name;
	int id;
	public Car(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public boolean equals(Object obj) {
		Car c2=(Car)obj;
		return this.id==c2.id;
	}
	public static void main(String[] args) {
		Car c1=new Car("BMW", 123);
		Car c2=new Car("Audi", 123);
		System.out.println(c1.equals(c2));
	}
}
