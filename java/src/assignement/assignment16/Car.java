package assignement.assignment16;
import java.lang.System;
class Car{
	int cost;
	String model;
	String type;
	
	Car(int cost,String model, String type){
		this.cost=cost;
		this.model=model;
		this.type=type;
	}
	 public String toString() {
		 return this.cost+" "+this.model+" "+this.type;
	}
	public static void main(String[] args) {
		Car m1=new Car(10000,"SUzuki","Petrol");
		System.out.println(m1);
	}
}