package equalsmethod;

public class Tv {
	String name;
	int id;
	public Tv(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public boolean equals(Object obj) {
		Tv t2=(Tv)obj;
		return this.id==t2.id;
	}
	public static void main(String[] args) {
		Tv t1=new Tv("Samsung", 123);
		Tv t2=new Tv("LG", 123);
		System.out.println(t1.equals(t2));
	}
}
