package set;

import java.util.HashSet;

public class Hashsetamethod {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	h1.add(20);
	h1.add(39);
	h1.add("hello");
	h1.add(20);
	System.out.println(h1);
	h1.remove(20);
	System.out.println(h1);
	HashSet h2=new HashSet();
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
