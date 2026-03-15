package encapsulation;

class Main5{
	private String name="Breakup";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	
}
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 m1=new Main2();
		System.out.println(m1.getName());
		m1.setName("Comeback");
		System.out.println(m1.getName());

	}

}
