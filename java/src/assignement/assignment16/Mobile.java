package assignement.assignment16;
import java.lang.System;
class Mobile{
	int cost;
	String name;
	String color;
	
	Mobile(int cost,String name, String color){
		this.cost=cost;
		this.name=name;
		this.color=color;
	}
	 public String toString() {
		 return this.cost+" "+this.name+" "+this.color;
	}
	public static void main(String[] args) {
		Mobile m1=new Mobile(10000,"redmi","blue");
		System.out.println(m1);
	}
}