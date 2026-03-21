package assignement.assignment16;
import java.lang.System;
class School{
	int stregth;
	String name;
	char grade;
	
	School(int stregth,String name,char grade){
		this.stregth=stregth;
		this.name=name;
		this.grade=grade;
	}
	 public String toString() {
		 return this.stregth+" "+this.name+" "+this.grade;
	}
	public static void main(String[] args) {
		School m1=new School(1000,"gecKarwar",'A');
		System.out.println(m1);
	}
}