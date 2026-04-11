package priorityqueue;

import java.util.PriorityQueue;

public class Size_contains_method {
	public static void main(String[] args) {
			PriorityQueue sm=new PriorityQueue();
			PriorityQueue sm1=new PriorityQueue();
			sm1.add(10);
			sm1.add(20);
			sm.add(30);
			sm.add(50);
			System.out.println(sm.size());
			System.out.println(sm.contains(30));
			System.out.println(sm.contains(1));
			
	}
}
