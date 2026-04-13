package Genericsboxingandunboxing;

import java.util.ArrayList;

class Cloth{
	int m_cost;
	String m_name;
	String m_color;
	Cloth(int m_cost,String m_name,String m_color){
		this.m_color=m_color;
		this.m_name=m_name;
		this.m_cost=m_cost;
		
	}
	public String toString() {
		return this.m_cost+" "+this.m_name+" "+this.m_color;
	}
}
	class Mainclass6{
		public static void main(String[] args) {
			ArrayList<Cloth> l1=new ArrayList();
			l1.add(new Cloth(20000,"Cotton","XL"));
			l1.add(new Cloth(20000,"Nylon","XXL"));
			for(int i=0;i<l1.size();i++) {
				Object o1=l1.get(i);
				Cloth m1=(Cloth)o1;
				System.out.println(m1);
			}
		}
	}
	



