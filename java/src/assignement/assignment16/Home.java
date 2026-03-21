package assignement.assignment16;

public class Home {
	
	String lname;
	int l_cost;
	String l_brand;
	
	Home(String lname,int l_cost,String l_brand){
		this.lname=lname;
		this.l_cost=l_cost;
		this.l_brand=l_brand;
	}
	public String toString() {
		return this.lname+""+this.l_cost+""+this.l_brand;
	}
	public static void main(String[] args) {
		Home l1=new Home("Brandvana",3000,"blue");
		System.out.println(l1);
	}
	

}
