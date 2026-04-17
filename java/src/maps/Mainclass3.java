package maps;

import java.util.LinkedHashMap;
import java.util.Map;

class Car{
	String c_name;
	int c_cost;
	Car(String c_name,int c_cost){
		this.c_name=c_name;
		this.c_cost=c_cost;
	}
	public String toString() {
		return this.c_name+this.c_cost;
	}
}
public class Mainclass3 {
	LinkedHashMap <Integer,Car> c=new LinkedHashMap();
	//c.put(1, new Car("Audi",20000));
	c.put(1, new Car("Lenvov",1200));
	m1.put(2, new Laptop(13000,"dell","Blue"));
	
	
	

}
