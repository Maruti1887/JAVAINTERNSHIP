package Genericsboxingandunboxing;

import java.util.ArrayList;

class TV{
	int m_cost;
	String m_name;
	String m_color;
	TV(int m_cost,String m_name,String m_color){
		this.m_color=m_color;
		this.m_name=m_name;
		this.m_cost=m_cost;
		
	}
	public String toString() {
		return this.m_cost+" "+this.m_name+" "+this.m_color;
	}
}
	class Mainclass2{
		public static void main(String[] args) {
			ArrayList<TV> l1=new ArrayList();
			l1.add(new TV(20000,"LG","Led"));
			l1.add(new TV(20000,"Panapsonic","LCd"));
			for(int i=0;i<l1.size();i++) {
				Object o1=l1.get(i);
				TV m1=(TV)o1;
				System.out.println(m1);
			}
		}
	}
	

