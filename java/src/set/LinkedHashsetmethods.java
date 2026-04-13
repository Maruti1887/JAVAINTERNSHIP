package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetmethods {
	public static void main(String[] args) {
		LinkedHashSet h1=new LinkedHashSet();
		h1.add(20);
		h1.add(39);
		h1.add("hello");
		h1.add(20);
		System.out.println(h1);
		h1.remove(20);
		System.out.println(h1);
		LinkedHashSet h2=new LinkedHashSet();
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
