package Genericsboxingandunboxing;

import java.util.ArrayList;

class Home{
	int m_cost;
	String m_name;
	String m_color;
	Home(int m_cost,String m_name,String m_color){
		this.m_color=m_color;
		this.m_name=m_name;
		this.m_cost=m_cost;
		
	}
	public String toString() {
		return this.m_cost+" "+this.m_name+" "+this.m_color;
	}
}
	class Mainclass9{
		public static void main(String[] args) {
			ArrayList<Home> l1=new ArrayList();
			l1.add(new Home(20000,"Kinfishertower","blue"));
			l1.add(new Home(20000,"pentahouse","red"));
			for(int i=0;i<l1.size();i++) {
				Object o1=l1.get(i);
				Home m1=(Home)o1;
				System.out.println(m1);
			}
		}
	}
	



