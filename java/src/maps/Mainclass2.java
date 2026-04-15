package maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Laptop{
	int m_cost;
	String m_name;
	String m_color;
	Laptop(int m_cost,String m_name,String m_color){
		this.m_cost=m_cost;
		this.m_name=m_name;
		this.m_color=m_color;
	}
	public String toString() {
		return this.m_color+" "+this.m_cost+" "+this.m_name;
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Laptop> m1=new LinkedHashMap();
		m1.put(1, new Laptop(13000,"Lenvov","Blue"));
		m1.put(2, new Laptop(13000,"dell","Blue"));
		for(Entry x:m1.entrySet()){
			Object o1= x.getValue();
			Laptop m11=(Laptop)o1;
			System.out.println(m11);
			
		}
		
	}
}
