package encapsulation;



class Main2{
	private String name="maruti";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	
}
public class Instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 m1=new Main2();
		System.out.println(m1.getName());
		m1.setName("raju");
		System.out.println(m1.getName());

	}

}
