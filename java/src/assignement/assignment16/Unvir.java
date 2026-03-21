package assignement.assignment16;
import java.lang.System;
class Unvir{
	
	String course;
	String uname;
	int cost;
	
	Unvir(String a, String b,int c){
		
		course=a;
		uname=b;
		cost=c;
	}
	 public String toString() {
		 return course+" "+uname+" "+cost;
	}
	public static void main(String[] args) {
		Unvir m1=new Unvir("cse","vtu",1000);
		System.out.println(m1);
		
		Unvir m2=new Unvir("ece","vtu",2000);
		System.out.println(m2);
		
	}
}