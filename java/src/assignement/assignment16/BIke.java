package assignement.assignment16;
import java.lang.System;
class Bike{
	int cost;
	String brand;
	String color;
	
	Bike(int a,String b, String c){
		cost=a;
		brand=b;
		color=c;
	}
	 public String toString() {
		 return cost+" "+brand+" "+color;
	}
	public static void main(String[] args) {
		Bike m1=new Bike(10000,"duke","blue");
		System.out.println(m1);
		
		Bike m2=new Bike(2000,"pulsur","red");
		System.out.println(m2);
		
	}
}