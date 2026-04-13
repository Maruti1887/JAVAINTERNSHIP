package Genericsboxingandunboxing;

import java.util.ArrayList;

class Emp{
	int m_cost;
	String m_name;
	String m_color;
	Emp(int m_cost,String m_name,String m_color){
		this.m_color=m_color;
		this.m_name=m_name;
		this.m_cost=m_cost;
		
	}
	public String toString() {
		return this.m_cost+" "+this.m_name+" "+this.m_color;
	}
}
	class Mainclass10{
		public static void main(String[] args) {
			ArrayList<Emp> l1=new ArrayList();
			l1.add(new Emp(20000,"Maruti","cs"));
			l1.add(new Emp(20000,"Natarj","ec"));
			for(int i=0;i<l1.size();i++) {
				Object o1=l1.get(i);
				Emp m1=(Emp)o1;
				System.out.println(m1);
			}
		}
	}
	



