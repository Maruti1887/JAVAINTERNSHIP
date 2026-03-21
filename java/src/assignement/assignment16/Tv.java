package assignement.assignment16;
import java.lang.System;
class Tv{
	int cost;
	String brand;
	String type;
	
	Tv(int a,String b, String c){
		cost=a;
		brand=b;
		type=c;
	}
	 public String toString() {
		 return cost+" "+brand+" "+type;
	}
	public static void main(String[] args) {
		Tv m1=new Tv(10000,"lg","led");
		System.out.println(m1);
		
		Tv m2=new Tv(2000,"Hier","lcd");
		System.out.println(m2);
		
	}
}