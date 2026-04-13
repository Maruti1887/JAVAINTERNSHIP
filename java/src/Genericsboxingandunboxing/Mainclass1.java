package Genericsboxingandunboxing;

import java.util.ArrayList;

class Mobile{
	int m_cost;
	String m_name;
	String m_color;
	Mobile(int m_cost,String m_name,String m_color){
		this.m_color=m_color;
		this.m_name=m_name;
		this.m_cost=m_cost;
		
	}
	public String toString() {
		return this.m_color+" "+this.m_name+" "+this.m_color;
	}
}
	class Mainclass1{
		public static void main(String[] args) {
			ArrayList<Mobile> l1=new ArrayList();
			l1.add(new Mobile(20000,"vivo","Blue"));
			l1.add(new Mobile(20000,"oppo","Blue"));
			for(int i=0;i<l1.size();i++) {
				Object o1=l1.get(i);
				Mobile m1=(Mobile)o1;
				System.out.println(m1);
			}
		}
	}
	

