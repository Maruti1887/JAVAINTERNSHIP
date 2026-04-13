package Genericsboxingandunboxing;

import java.util.ArrayList;

class Laptop{
	int m_cost;
	String m_name;
	String m_color;
	Laptop(int m_cost,String m_name,String m_color){
		this.m_color=m_color;
		this.m_name=m_name;
		this.m_cost=m_cost;
		
	}
	public String toString() {
		return this.m_cost+" "+this.m_name+" "+this.m_color;
	}
}
	class Mainclass4{
		public static void main(String[] args) {
			ArrayList<Laptop> l1=new ArrayList();
			l1.add(new Laptop(20000,"Lenovo","Loq"));
			l1.add(new Laptop(20000,"Dell","victus"));
			for(int i=0;i<l1.size();i++) {
				Object o1=l1.get(i);
				Laptop m1=(Laptop)o1;
				System.out.println(m1);
		}
	}
}
	


