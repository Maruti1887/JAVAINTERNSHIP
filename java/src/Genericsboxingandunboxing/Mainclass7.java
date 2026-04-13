package Genericsboxingandunboxing;

import java.util.ArrayList;

class Bike{
	int m_cost;
	String m_name;
	String m_color;
	Bike(int m_cost,String m_name,String m_color){
		this.m_color=m_color;
		this.m_name=m_name;
		this.m_cost=m_cost;
		
	}
	public String toString() {
		return this.m_cost+" "+this.m_name+" "+this.m_color;
	}
}
	class Mainclass7{
		public static void main(String[] args) {
			ArrayList<Bike> l1=new ArrayList();
			l1.add(new Bike(20000,"KTM","Diesel"));
			l1.add(new Bike(20000,"DUKE","PETROL"));
			for(int i=0;i<l1.size();i++) {
				Object o1=l1.get(i);
				Bike m1=(Bike)o1;
				System.out.println(m1);
			}
		}
	}
	



