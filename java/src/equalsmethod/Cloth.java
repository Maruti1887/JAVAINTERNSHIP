package equalsmethod;

public class Cloth {
	String name;
	int id;
	public Cloth(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public boolean equals(Object obj) {
		Cloth c2=(Cloth)obj;
		return this.id==c2.id;
	}
	public static void main(String[] args) {
		Cloth c1=new Cloth("Shirt", 123);
		Cloth c2=new Cloth("Pant", 123);
		System.out.println(c1.equals(c2));
	}
}
