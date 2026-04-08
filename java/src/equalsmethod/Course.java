package equalsmethod;

public class Course {
	String name;
	int id;
	public Course(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public boolean equals(Object obj) {
		Course c2=(Course)obj;
		return this.id==c2.id;
	}
	public static void main(String[] args) {
		Course c1=new Course("Java", 123);
		Course c2=new Course("Python", 123);
		System.out.println(c1.equals(c2));
	}
}
