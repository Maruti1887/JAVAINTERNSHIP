package equalsmethod;

public class College {
	String name;
	int id;
	public College(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public boolean equals(Object obj) {
		College c2=(College)obj;
		return this.id==c2.id;
	}
	public static void main(String[] args) {
		College c1=new College("ABC", 123);
		College c2=new College("XYZ", 123);
		System.out.println(c1.equals(c2));
	}
}
