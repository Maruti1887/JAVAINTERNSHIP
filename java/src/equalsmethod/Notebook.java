package equalsmethod;

public class Notebook {
	String name;
	int id;
	public Notebook(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public boolean equals(Object obj) {
		Notebook n2=(Notebook)obj;
		return this.id==n2.id;
	}
	public static void main(String[] args) {
		Notebook n1=new Notebook("Classmate", 123);
		Notebook n2=new Notebook("Camlin", 123);
		System.out.println(n1.equals(n2));
	}
}
