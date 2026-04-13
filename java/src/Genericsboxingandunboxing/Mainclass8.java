package Genericsboxingandunboxing;

import java.util.ArrayList;

class Car{
	int m_cost;
	String m_name;
	String m_color;
	Car(int m_cost,String m_name,String m_color){
		this.m_color=m_color;
		this.m_name=m_name;
		this.m_cost=m_cost;
		
	}
	public String toString() {
		return this.m_cost+" "+this.m_name+" "+this.m_color;
	}
}
	class Mainclass8{
		public static void main(String[] args) {
			ArrayList<Car> l1=new ArrayList();
			l1.add(new Car(20000,"Audi","Diesel"));
			l1.add(new Car(20000,"Benz","Petrol"));
			for(int i=0;i<l1.size();i++) {
				Object o1=l1.get(i);
				Car m1=(Car)o1;
				System.out.println(m1);
			}
		}
	}
	



