package equalsmethod;

public class Garden {
	String name;
	int id;
	public Garden(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public boolean equals(Object obj) {
		Garden g2=(Garden)obj;
		return this.id==g2.id;
	}
	public static void main(String[] args) {
		Garden g1=new Garden("Rose", 123);
		Garden g2=new Garden("Lily", 123);
		System.out.println(g1.equals(g2));
	}

}
