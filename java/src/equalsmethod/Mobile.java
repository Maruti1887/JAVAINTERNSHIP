package equalsmethod;

public class Mobile {
	String name;
	int id;
	public Mobile(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public boolean equals(Object obj) {
		Mobile m2=(Mobile)obj;
		return this.id==m2.id;
	}
	public static void main(String[] args) {
		Mobile m1=new Mobile("Samsung", 123);
		Mobile m2=new Mobile("Apple", 123);
		System.out.println(m1.equals(m2));
	}
}
