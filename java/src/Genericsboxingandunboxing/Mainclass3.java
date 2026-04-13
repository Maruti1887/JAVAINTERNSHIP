package Genericsboxingandunboxing;

import java.util.ArrayList;

class Course{
	int cost;
	String name;
	String color;
	Course(int cost,String name,String color){
		this.color=color;
		this.name=name;
		this.cost=cost;
		
	}
	public String toString() {
		return this.color+" "+this.name+" "+this.cost;
	}
}
	class Mainclass3{
		public static void main(String[] args) {
			ArrayList<Course> l1=new ArrayList();
			l1.add(new Course(20000,"VtU","EC"));
			l1.add(new Course(20000,"KUD","CS"));
			for(int i=0;i<l1.size();i++) {
				Object o1=l1.get(i);
				Course m1=(Course)o1;
				System.out.println(m1);
			}
		}
	}
	

