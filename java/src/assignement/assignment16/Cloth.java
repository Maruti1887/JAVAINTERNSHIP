package assignement.assignment16;

public class Cloth{
	
	String lname;
	int l_cost;
	String l_brand;
	
	Cloth(String lname,int l_cost,String l_brand){
		this.lname=lname;
		this.l_cost=l_cost;
		this.l_brand=l_brand;
	}
	public String toString() {
		return this.lname+""+this.l_cost+""+this.l_brand;
	}
	public static void main(String[] args) {
		Cloth l1=new Cloth("Blue",3000,"XL");
		System.out.println(l1);
	}
	

}
