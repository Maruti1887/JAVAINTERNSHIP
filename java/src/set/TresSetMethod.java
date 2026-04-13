package set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TresSetMethod {
	public static void main(String[] args) {
	TreeSet h1=new TreeSet();
	h1.add(20);
	h1.add(39);
	h1.add("hello");
	h1.add(20);
	System.out.println(h1);
	h1.remove(20);
	System.out.println(h1);
	TreeSet h2=new TreeSet();
	h2.add(60);
	h2.add(30);
	h2.add(50);
	h2.add(90);
	System.out.println(h2);
	h2.addAll(h1);
	System.out.println(h2);
	System.out.println(h2.contains(h1));
	System.out.println(h2);
	h2.size();	
	}
}
