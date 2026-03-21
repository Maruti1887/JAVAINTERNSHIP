package assignement.assignment16;

public class Laptop {
	
	String lname;
	int l_cost;
	String l_brand;
	
	Laptop(String lname,int l_cost,String l_brand){
		this.lname=lname;
		this.l_cost=l_cost;
		this.l_brand=l_brand;
	}
	public String toString() {
		return this.lname+""+this.l_cost+""+this.l_brand;
	}
	public static void main(String[] args) {
		Laptop l1=new Laptop("lenvo",3000,"brbrand");
		System.out.println(l1);
	}
	

}
