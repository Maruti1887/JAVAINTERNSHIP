package Genericsboxingandunboxing;

import java.util.ArrayList;

class School{
	int m_cost;
	String m_name;
	String m_color;
	School(int m_cost,String m_name,String m_color){
		this.m_color=m_color;
		this.m_name=m_name;
		this.m_cost=m_cost;
		
	}
	public String toString() {
		return this.m_cost+" "+this.m_name+" "+this.m_color;
	}
}
	class Mainclass5{
		public static void main(String[] args) {
			ArrayList<School> l1=new ArrayList();
			l1.add(new School(20000,"Geck","cs"));
			l1.add(new School(20000,"Gec","ec"));
			for(int i=0;i<l1.size();i++) {
				Object o1=l1.get(i);
				School m1=(School)o1;
				System.out.println(m1);
			}
		}
	}
	



